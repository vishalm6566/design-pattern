package designPattern.visitor;

import designPattern.visitor.shapes.Circle;
import designPattern.visitor.shapes.CompoundShape;
import designPattern.visitor.shapes.Dot;
import designPattern.visitor.shapes.Rectangle;

public interface Visitor {
    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);
}