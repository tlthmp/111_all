import java.util.Scanner;
public class Multiplier
{	
	public static void main (String	[]args)
	{
int num=0;
int num1=0; 
int result=0;
	Scanner in = new Scanner(System.in);
	System.out.println("Hello!");
	System.out.println("Please enter a number or type -1 to exit.");
		num = in.nextInt();
		
		
	while (num != -1)
	{
		System.out.println("Please enter another number.");
	num1 = in.nextInt();
	result = (num *= num1);
	System.out.println("The result is " + result);
	System.out.println("Please enter a number or type -1 to exit.");
		num = in.nextInt();
	
	
	
	} 
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}