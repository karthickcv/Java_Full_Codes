import java.util.ArrayList;
public class ArrayList_demo {

	public static void main(String[] args) {
     
		 ArrayList<ArrayList<String>> groceryList = new ArrayList();
		 
		   ArrayList<String> bakeryList = new ArrayList();
		   
		      bakeryList.add("Bread");
		      bakeryList.add("Jam");
		      bakeryList.add("Puffs");
		   
		   ArrayList<String> produceList = new ArrayList();
		   
		      produceList.add("Tomatoes");
		      produceList.add("Garlic");
		      produceList.add("Onion");
		      
		   ArrayList<String> drinksList = new ArrayList();
		   
		      drinksList.add("Soda");
		      drinksList.add("Juice");
		      
		   groceryList.add(bakeryList);
		   groceryList.add(produceList);
		   groceryList.add(drinksList);
		   
		   System.out.println(groceryList);
		      
	}

}
