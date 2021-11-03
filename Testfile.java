import java.io.*;
import java.util.Scanner;
import java.util.Random;
public class Testfile
{
	
	
	public static void main (String	[]args)
	{
		
	}
	public static void PrintTotal(int playertotal)
	{
		String stand;
		String draw;
		System.out.println("Stand or draw");
		System.out.println(playertotal);
	}
	public static int Draw ()
	{
	int card1 = 0;
	int card2 = 0;
	int card3 = 0;
	int card4 = 0;
	int card5 = 0;
	int card6 = 0;
	int card7 = 0;
	int card8 = 0;
	int card9 = 0;
	int playertotal = 0;
	String response;
	Random gen = new Random();	
	Scanner in = new Scanner(System.in);	
			do 
		{
			card1 = gen.nextInt(14)+1;
			card2 = gen.nextInt(14)+1;
			if (card1 > 10 || card1 < 14 || card2 > 10 || card2 < 14)
			{
				card1 = 10;
				card2 = 10;
			}
			else if (card1 == 14 && card2 == 14)
			{
				card1 = 14;
				card2 = 1;
			}
			else if (card1 == 14)
			{
				card1 = 11;
			}
			else if(card2 == 14)
			{
				card2 = 11;
			}
		playertotal = (card1 + card2+ card3 +card4 +card5 +card6 +card7 +card8 + card9);
		PrintTotal(playertotal);
			System.out.println("Would you like another card?");
			response = in.nextLine();
			if (response == "yes" || response == "y")
			{
				card3 = gen.nextInt(14)+1;
				if (card3 > 10 || card3 < 14)
				{
					card3 = 10;
				}
				if (card3 == 14 && playertotal > 21)
				{
					card3 = 1;
				}
				else if (card3 == 14)
				{
					card3 = 11;
				}
				
			}
			System.out.println("You drew" + card3);
		//call
		if (playertotal < 21)
		{
			System.out.println("Would you like another card?");
			
		}
		else if (playertotal > 21)
		{
			System.out.println("You busted");
			break;
		}
		}while(playertotal <= 21);
		
			
		return playertotal;
		}
	}