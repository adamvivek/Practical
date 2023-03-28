package Method;
import java.util.Scanner;
	public class User_DefinedEx3 {
		  public static void main(String[] args) 
		  {
		    Scanner in = new Scanner(System.in);
	        System.out.print("Enter 1st Number: ");
	        double num1 = in.nextDouble();
	        System.out.print("Enter 2nd Number: ");
	        double num2 = in.nextDouble();
	        System.out.print("Enter 3rd Number: ");
	        double num3 = in.nextDouble();
	        
		    double sum = 0.0;
		    double avg = 0.0;
		    
		    sum = num1 + num2 + num3;
		    avg = sum/3;
		    System.out.println("Sum: " + sum );
		    System.out.println("Average: " + avg );
		  }
}