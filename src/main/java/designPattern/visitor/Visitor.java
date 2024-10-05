package designPattern.visitor;

import designPattern.visitor.shapes.*;

public interface Visitor {
    String visit(Dot dot);

    String visit(Circle circle);

    String visit(Rectangle rectangle);

    String visit(CompoundShape cg);

    String export(Shape...shapes);
}