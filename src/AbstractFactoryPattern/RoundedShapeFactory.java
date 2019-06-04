package AbstractFactoryPattern;

public class RoundedShapeFactory extends AbstractFactory {

	@Override
	public Shape getShape(String shapeType) {
		if(shapeType.equalsIgnoreCase("RECTANGLE")) return new RoundedRectangle();
		else if(shapeType.equalsIgnoreCase("TRIANGLE")) return new RoundedTriangle();
		else return null;

	}

}
