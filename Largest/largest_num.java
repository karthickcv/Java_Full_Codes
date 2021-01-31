package Largest;
import java.util.Scanner;

public class largest_num {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Enter the First Number");
		int a = scanner.nextInt();
		
		System.out.println("Enter the Second Number");
		int b = scanner.nextInt();
		
		System.out.println("Enter the Third Number");
		int c = scanner.nextInt();
		
		if(a>b && a>c){
		
			System.out.println("A is a largest Number\n" +a);
		    }
		else if (b>a && b>c) {
			System.out.println("B is a largest Number\n" +b);
		}
		
		else {
			System.out.println("C is a largest Number\t" +c);
		  
        	}
 	}
}

