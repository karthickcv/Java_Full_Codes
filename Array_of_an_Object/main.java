package Array_of_an_Object;

public class main {

	public static void main(String[] args) {
		
		Food food1 = new Food("Pizza");
		Food food2 = new Food("Burger");
		Food food3 = new Food("Puffs");
		
		
		
		Food[] refridgerator = {food1,food2,food3};

		System.out.println("Food name"+refridgerator[0].name);
		
	}
}
