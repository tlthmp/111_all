import java.util.Scanner;
public class whileLoop
{	
	public static void main (String	[]args)
	{
int num;
int num1; 
int result;
	Scanner in = new Scanner(System.in);
	System.out.println("Hello!");
	System.out.println("Please enter a number or type -1 to exit.");
	num = (int)in.nextInt();
		
	while (num != -1)
	{

	System.out.println("Please enter another number.");
	num1 = (int)in.nextInt();
	result = (int)(num *= num1);
	System.out.println("The result is " + result);
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}