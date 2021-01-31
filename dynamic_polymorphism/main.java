package dynamic_polymorphism;
import java.util.Scanner;


public class main {

	public static void main(String[] args) {
		
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("What Animal Do you want ?\n");
    System.out.println("(1=Dog) (2=Cat)\n");
    int choice = scanner.nextInt();
    
       if(choice==1) {
    	   
    	   Animal animal = new dog();
    	   animal.speak();
           }
    
       else if(choice==2) {
    	   Animal animal = new cat();
    	   animal.speak();
           }
       
       else {
    	
    	    Animal animal = new Animal();
    	   System.out.println("Invalid Option");
    	   
       } 
	}

}
