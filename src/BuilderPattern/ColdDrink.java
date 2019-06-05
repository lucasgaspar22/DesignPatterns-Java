package BuilderPattern;

public abstract class ColdDrink implements Item {

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Packing packing() {
		return new Bottle();
	}

	@Override
	public abstract float price(); 

}
