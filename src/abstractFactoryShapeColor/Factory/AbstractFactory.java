package abstractFactoryShapeColor.Factory;

import abstractFactoryShapeColor.Color.Color;
import abstractFactoryShapeColor.Shape.Shape;

public abstract class AbstractFactory {
    public abstract Color getColor(String colorType);
    public abstract Shape getShape(String shapeType);
}
