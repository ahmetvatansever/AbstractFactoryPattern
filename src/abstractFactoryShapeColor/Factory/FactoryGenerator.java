package abstractFactoryShapeColor.Factory;

public class FactoryGenerator {
    public static AbstractFactory getFactory(String type){
        if (type.equalsIgnoreCase("Shape")) {
            return new ShapeFactory();
        }
        else if (type.equalsIgnoreCase("Color")){
            return new ColorFactory();
        }
        return null;
    }
}
