package FactoryPattern;

public class Main {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		
		Shape shape1 = shapeFactory.getShape("CIRCLE");
		Shape shape2 = shapeFactory.getShape("TRIANGLE");
		Shape shape3 = shapeFactory.getShape("RECTANGLE");
		
		shape1.draw();
		shape2.draw();
		shape3.draw();

	}

}
