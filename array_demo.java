
public class array_demo {

	public static void main(String[] args) {
		/*// TODO Auto-generated method stub
      
		// Method 1 
		String[] cars = new String[3];
       
       cars[0] = "Hello";
       cars[1] = "Dude";
       cars[2] = "welcome";
       
       
       for(int i=0;i<cars.length;i++)
       {
    	  System.out.println(cars[i]);
	}*/
		
		//Method 2D Array
		
		
		
		String[][] cars = {{"Corvette","Lambo","Testla"},
				          {"Cheverlot","Murgicello","GT"},
				          {"IST","Linea","Fiat"}};
		
		for(int i=0;i<cars.length;i++)
		{
			System.out.println();
			for(int j=0;j<cars[i].length;j++) {
				System.out.print(cars[i][j]+" ");
			}
		}
		
	}
}
