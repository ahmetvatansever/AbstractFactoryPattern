package abstractFactoryShapeColor.Factory;


import abstractFactoryShapeColor.Color.Color;
import abstractFactoryShapeColor.Shape.Circle;
import abstractFactoryShapeColor.Shape.Rectangle;
import abstractFactoryShapeColor.Shape.Shape;
import abstractFactoryShapeColor.Shape.Square;

public class ShapeFactory extends AbstractFactory{
    @Override
    public Shape getShape(String shapeType) {
        if (shapeType == null){
            return null;
        }

        if (shapeType.equalsIgnoreCase("Circle")) {
            return new Circle();
        }
        else if (shapeType.equalsIgnoreCase("Square")){
            return new Square();
        }
        else if (shapeType.equalsIgnoreCase("Rectangle")){
            return new Rectangle();
        }
        else{
            System.out.println("Type hatalı.");
            return null;
        }
    }

    @Override
    public Color getColor(String colorType) {
        return null;
    }
}
