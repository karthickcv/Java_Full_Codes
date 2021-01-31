package Reverse;
import java.util.Scanner;

public class reverse_num {

	   public static void main(String[] args) {
		   
		   int sum = 0;
		   Scanner scanner = new Scanner(System.in);
		   
		   System.out.println("Enter the Number\n");
		   int n = scanner.nextInt();
		   
		   while(n>0) {
		    int r = n%10;
		    sum = sum * 10 + r;
		    n = n/10;
		    
		   }
		   
		   System.out.println("Reverse Number :\n"+sum);
		   
		}
}
