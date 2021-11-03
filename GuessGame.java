/*
Name: Ty Thompson
Current Date: 10/7/2015
Sources: Hacker.java lab

By submitting this work, I attest that it is my original work and that I did not violate the
University of Mississippi academic policies set forth in the "M" book.
*/ 
import java.util.Scanner;
import java.util.Random;
public class GuessGame
{
	
	
	public static void main (String	[]args)
	{
	Random gen = new Random();	
	Scanner in = new Scanner(System.in);
			int comp1; //RNG
			int guess= 0;
			int guessNum = 0;
			int gamesPlayed = 0;
			int meanGuess = 0;
			int again = 0;
			System.out.println("Welcome to the Guessing Game!");
			System.out.println("I'm thinking of a number between 1 and 20. Enter your guess");
			System.out.println("or enter -1 if you would like to quit");
					
			
	 
		do
		{
			boolean var = false;
			comp1 = gen.nextInt(20)+1;
			guess = in.nextInt();
			guessNum++;
			if (guess == -1)
			{
				break;
			}
			for (int i=0; !var; i++)
			{
				if (guess == comp1)
				{
						gamesPlayed++;
						var = true;
						meanGuess = (guessNum/gamesPlayed);
						System.out.println("You won!");
						System.out.println("");
						System.out.println("Game over. Here are your stats:");
						System.out.println("Total Games played:"+ gamesPlayed);
						System.out.println("Total Guesses given: "+ guessNum);
						System.out.println("Average number of guesses per game:" + meanGuess);
						System.out.println("Your rank for guesses is:");
						gamesPlayed++;
						
					if (meanGuess == 1)
				
					{
						System.out.println("You're not human");
					}
					if (meanGuess == 2)
				
					{
						System.out.println("Lucky Lucky");
					}
					if (meanGuess == 3)
				
					{
						System.out.println("Average Guesser");
					}
					if (meanGuess == 4)
				
					{
						System.out.println("Poor Guesser");
					}
					if (meanGuess >= 5)
				
					{
						System.out.println("Never play games for money");
					}
				System.out.println("Enter another number to keep playing or -1 to exit");
				}
				if (guess == -1)
				{
				break;
				}
				else if(guess > comp1)
					{
						System.out.println("That is too high.");
						System.out.println("Guess again.");
						guess = in.nextInt();
						guessNum++;

							
					}
				else if (guess < comp1)
					{
						System.out.println("That is too low.");
						System.out.println("Guess again.");
						guess = in.nextInt();
						guessNum++;
						
					}
					
				
			}
		}while(again != -1); 
			
		
		
		
	
	
	
		

		
	}
}