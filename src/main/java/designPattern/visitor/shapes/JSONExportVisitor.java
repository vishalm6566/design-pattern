package designPattern.visitor.shapes;

import designPattern.visitor.Visitor;
import designPattern.visitor.shapes.*;

public class JSONExportVisitor implements Visitor {

    public String export(Shape... args) {
        StringBuilder sb = new StringBuilder();
        sb.append("[\n");
        for (int i = 0; i < args.length; i++) {
            sb.append(indent(args[i].accept(this), 1));
            if (i < args.length - 1) {
                sb.append(",\n");
            }
        }
        sb.append("\n]");
        return sb.toString();
    }

    public String visit(Dot d) {
        return "{\n"
                + "  \"type\": \"dot\",\n"
                + "  \"id\": " + d.getId() + ",\n"
                + "  \"x\": " + d.getX() + ",\n"
                + "  \"y\": " + d.getY() + "\n"
                + "}";
    }

    public String visit(Circle c) {
        return "{\n"
                + "  \"type\": \"circle\",\n"
                + "  \"id\": " + c.getId() + ",\n"
                + "  \"x\": " + c.getX() + ",\n"
                + "  \"y\": " + c.getY() + ",\n"
                + "  \"radius\": " + c.getRadius() + "\n"
                + "}";
    }

    public String visit(Rectangle r) {
        return "{\n"
                + "  \"type\": \"rectangle\",\n"
                + "  \"id\": " + r.getId() + ",\n"
                + "  \"x\": " + r.getX() + ",\n"
                + "  \"y\": " + r.getY() + ",\n"
                + "  \"width\": " + r.getWidth() + ",\n"
                + "  \"height\": " + r.getHeight() + "\n"
                + "}";
    }

    public String visit(CompoundShape cg) {
        StringBuilder sb = new StringBuilder();
        sb.append("{\n")
                .append("  \"type\": \"compound_graphic\",\n")
                .append("  \"id\": ").append(cg.getId()).append(",\n")
                .append("  \"children\": ").append(_visitCompoundGraphic(cg))
                .append("\n}");
        return sb.toString();
    }

    private String _visitCompoundGraphic(CompoundShape cg) {
        StringBuilder sb = new StringBuilder();
        sb.append("[\n");
        for (int i = 0; i < cg.children.size(); i++) {
            sb.append(indent(cg.children.get(i).accept(this), 2));
            if (i < cg.children.size() - 1) {
                sb.append(",\n");
            }
        }
        sb.append("\n  ]");
        return sb.toString();
    }

    private String indent(String json, int level) {
        String indent = "  ".repeat(level);
        return json.lines()
                .map(line -> indent + line)
                .reduce((a, b) -> a + "\n" + b)
                .orElse("");
    }
}
