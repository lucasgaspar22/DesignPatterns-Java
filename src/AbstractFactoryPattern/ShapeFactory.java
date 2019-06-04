package AbstractFactoryPattern;

public class ShapeFactory extends AbstractFactory {

	@Override
	Shape getShape(String shapeType) {
		if(shapeType.equalsIgnoreCase("RECTANGLE")) return new Rectangle();
		else if(shapeType.equalsIgnoreCase("TRIANGLE")) return new Triangle();
		else return null;
	}

}
