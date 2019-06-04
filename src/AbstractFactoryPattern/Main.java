package AbstractFactoryPattern;

public class Main {

	public static void main(String[] args) {
		
		AbstractFactory shapeFactory1 = FactoryProducer.getFactory(false);
		Shape shape1 = shapeFactory1.getShape("RECTANGLE");
		Shape shape2 = shapeFactory1.getShape("TRIANGLE");
		
		AbstractFactory shapeFactory2 = FactoryProducer.getFactory(true);
		Shape shape3 = shapeFactory2.getShape("RECTANGLE");
		Shape shape4 = shapeFactory2.getShape("TRIANGLE");
		
		shape1.draw();
		shape2.draw();
		shape3.draw();
		shape4.draw();
	}

}
