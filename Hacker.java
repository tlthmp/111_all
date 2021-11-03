import java.util.Scanner;
import java.util.Random;
public class Hacker
{
	Random gen = new Random();	
	Scanner in = new Scanner(System.in);	
	public static void main (String	[]args)
	{
			int comp1;
			int num1= 0;
			int roundNum = 0;
			int GamesWon = 0;
			int again = 0;
		
			
		System.out.println("Can you beat a computer?");
		System.out.println("The computer will pick a number between 1 and 10.");
		System.out.println("You have to guess it before losing the round.");
		System.out.println();
		Random gen = new Random();	
	Scanner in = new Scanner(System.in);	
		
		
		
			 
		do 
		{
			comp1 = gen.nextInt(10)+1;
			boolean var = false;
			roundNum++;
			System.out.println("You will get 5 chances to get it right before being knocked out");
			System.out.println("of the round.");
			System.out.println("Enter a number to test");
			num1 = in.nextInt();

			for (int i=0; i<4 && !var; i++)
			{
			if (num1 == comp1)
				{
				roundNum++;
				var = true;
				System.out.println("You won!");
				}else
					{
					System.out.println("Enter your next guess");
					num1 = in.nextInt();
					}
			
				}	
		if (!var)
			{
				System.out.println("You lost.");
			}
		System.out.println("Press -1 to exit or any key to play again.");
		again = in.nextInt();
		}while (again != -1);
		{
		System.out.println("Thank you come again.");
		System.out.println("Rounds played: "+ roundNum);
		System.out.println("Games won:"+ GamesWon);
		}
	}
}
