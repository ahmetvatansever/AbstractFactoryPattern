package abstractFactoryShapeColor.Factory;

import abstractFactoryShapeColor.Color.Blue;
import abstractFactoryShapeColor.Color.Color;
import abstractFactoryShapeColor.Color.Green;
import abstractFactoryShapeColor.Color.Red;
import abstractFactoryShapeColor.Shape.Shape;

public class ColorFactory extends AbstractFactory{
    @Override
    public Color getColor(String colorType) {
        if (colorType == null){
            return null;
        }

        if (colorType.equalsIgnoreCase("Red")) {
            return new Red();
        }
        else if (colorType.equalsIgnoreCase("Blue")){
            return new Blue();
        }
        else if (colorType.equalsIgnoreCase("Green")){
            return new Green();
        }

        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        return null;
    }
}
