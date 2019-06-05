package SingletonPattern;

public class Main {

	public static void main(String[] args) {
		
		// Illigal Instantiation
		/*
		 * SingleObject object = new SingleObject();
		 */
		
		//Legal instantiation
		SingleObject object = SingleObject.getInstance();
		object.showMessage();

	}

}
