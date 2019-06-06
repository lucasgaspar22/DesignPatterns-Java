package FacadePattern;

public class ShapeMaker {
	private Shape circle;
	private Shape triangle;
	private Shape rectangle;
	
	public ShapeMaker() {
		circle = new Circle();
		rectangle = new Rectangle();
		triangle = new Triangle();
	}
	
	public void drawCircle() {
		circle.draw();
	}
	
	public void drawTriangle() {
		triangle.draw();
	}
	
	public void drawRectangle() {
		rectangle.draw();
	}
}
