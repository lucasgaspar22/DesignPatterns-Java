package SingletonPattern;

public class SingleObject {
	private static SingleObject instance = new SingleObject();
	
	private SingleObject() {}
	
	
	//make the constructor private so that this class cannot be instantiated
	public static SingleObject getInstance() {
		return instance;
	}
	
	public void showMessage() {
		System.out.println("Inside instance::showMessage() method.");
	}
}
