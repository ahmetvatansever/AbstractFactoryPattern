package abstractFactoryShapeColor;

import abstractFactoryShapeColor.Color.Color;
import abstractFactoryShapeColor.Factory.AbstractFactory;
import abstractFactoryShapeColor.Factory.FactoryGenerator;
import abstractFactoryShapeColor.Shape.Shape;

public class Run {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryGenerator.getFactory("Shape");

        Shape shapeCircle = shapeFactory.getShape("Circle");
        shapeCircle.drawShape();

        Shape shapeSquare = shapeFactory.getShape("Square");
        shapeSquare.drawShape();

        Shape shapeRectangle = shapeFactory.getShape("Rectangle");
        shapeRectangle.drawShape();


        AbstractFactory colorFactory = FactoryGenerator.getFactory("Color");

        Color colorRed = colorFactory.getColor("Red");
        colorRed.fillColor();

        Color colorGreen = colorFactory.getColor("Green");
        colorGreen.fillColor();

        Color colorBlue = colorFactory.getColor("Blue");
        colorBlue.fillColor();

    }

}
