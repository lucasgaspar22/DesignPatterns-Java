package BuilderPattern;

public class Main {

	public static void main(String[] args) {
		
		MealBuilder mealBuilder = new MealBuilder();
		
		Meal vegMeal = mealBuilder.prepareVegMeal();
		Meal nonVegMeal = mealBuilder.preparNonVegMeal();
		
		System.out.println("Veg Meal:");
		vegMeal.showItems();
		System.out.println("_________");
		System.out.println("Total Cost: " + vegMeal.getCost());
		System.out.println("\n");
		System.out.println("Non Veg Meal:");
		nonVegMeal.showItems();
		System.out.println("_________");
		System.out.println("Total Cost: " + nonVegMeal.getCost());
	}

}
