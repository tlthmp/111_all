import java.io.*;
import java.util.Scanner;
public class OddEven
{
	
	public static void PrintData(int numb, int evenNum)
	{
	
	System.out.println("The length of the is: " + numb + " long.");
	System.out.println("The number of even numbers in the string is: " + evenNum);
	System.out.println("The number of odd numbers in the string is: " + (numb - evenNum));
		
	}
	

	
	public static int Convert(String numList)
	{
		int sum = 0;
		int evenNum = 0;
		
		
		
		for(int i = 0; i < numList.length(); i++) 
		{
			char num = numList.charAt(i);
			int numb = Character.getNumericValue(num);
			sum += numb;
			if((numb%2)==0)
			{
				evenNum++;
			}
		}
		PrintData(evenNum, numList.length());
		return sum; 
	}
	
	
	public static void main (String	[]args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number between 5 and 10 digits long without any spaces.");
		String numList = in.nextLine();
	
			
		do
		{
			System.out.println();
			int sum = Convert(numList);
			
			System.out.println("Please enter a number or type -1 to exit.");
			numList = in.nextLine();
		}while(!numList.equals("-1"));
		System.out.println();
		System.out.println("Bye!");
	
			
		
		
	}

	
}
	
	
	
	

		
	