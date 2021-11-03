/*
Name: Ty Thompson
Current Date: 10/23/2015
Sources: Joey

By submitting this work, I attest that it is my original work and that I did not violate the
University of Mississippi academic policies set forth in the "M" book.
*/ 

import java.io.*;
import java.util.Scanner;
import java.util.Random;
public class Blackjack
{
	static Random gen = new Random();	
	static Scanner in = new Scanner(System.in);
	
	public static void main (String[] args)
	{
		
		Boolean var = false;
		int drawReturn;
		int dealerReturn;
		int playerwon = 0;
		int dealerwon = 0;
		int gamesPlayed = 0;
		
		System.out.println("Welcome to Blackjack!");
		System.out.println("The objective is to get as close to 21 without going over.");
		String response1;
		
		do
		{
			gamesPlayed++;
			int dealer1 = gen.nextInt(14)+1;
			if ((dealer1 > 10) && (dealer1 < 14)){
				dealer1 = 10;
			}
			if (dealer1 == 14)
			{
				dealer1 = 11;
			}
			System.out.println("The dealer is showing " + dealer1);
			drawReturn = Draw();
			if (drawReturn == -1)
			{
				System.out.println("You busted!");
			}
			else {
				dealerReturn = Dealer(dealer1);
				
				if (dealerReturn == -1)
				{
					System.out.println("You won!");
					playerwon++;
				}
				else if (drawReturn > dealerReturn)
				{
					System.out.println("You won!");
					playerwon++;
				}
				else
				{
					System.out.println("You lose!");
					dealerwon++;
				}
			}
		System.out.println("Would you like to play again? (y/n)");
		response1 = in.nextLine();
		} while (response1.toLowerCase().equals("y"));
		// put output for stats here
		System.out.println("Thanks for playing!");
		System.out.println();
		System.out.println("Games played: " + gamesPlayed);
		System.out.println("Games won:" + playerwon);
		System.out.println("Games lost:" + dealerwon);
	}
		
	public static int Draw ()
	{
	
		int playertotal = 0;
		String response;
		Random gen = new Random();	
		Scanner in = new Scanner(System.in);	
		 
		int card1 = gen.nextInt(14)+1;
		int card2 = gen.nextInt(14)+1;
	
		if (card1 > 10 && card1 < 14)
		{
			card1 = 10;
		}
		if (card2 > 10 && card2 < 14)
		{
			card2 = 10;
		}
		if (card1 == 14 && card2 == 14)
		{
			card2 = 1;
		}
		if (card1 == 14)
		{
			card1 = 11;
		}
		if(card2 == 14)
		{
			card2 = 11;
		}
		playertotal = card1 + card2;
		PrintTotal(playertotal);
		System.out.println("Would you like another card?");
		response = in.nextLine();
		while (response.toLowerCase().equals("y"))
		{
			
			int card3 = gen.nextInt(14)+1;
			
			if (card3 > 10 && card3 < 14)
			{
				card3 = 10;
			}				
			if(card3 == 14)
			{
				card3 = 11;
				if ((card3 + playertotal) > 21)
				{
					card3 = 1;
				}
			}
			System.out.println("Your new card is a: " + card3);
			playertotal += card3;	
			PrintTotal(playertotal);
			if (playertotal <= 21)
			{
				System.out.println("Would you like another card (y/n)");
				response = in.nextLine();
			}
			else 
			{
				playertotal = -1;
				response = "n";
			}
		}	
		return playertotal;
	}
		
public static int Dealer(int dealertotal)
	{
		
		Random gen = new Random();
		int card = gen.nextInt(14) + 1;
		if ((card > 10) && (card < 14)){
			card = 10;
		}
		if ((dealertotal == 11) && (card == 14)){
			card = 1;
		}
		if (card == 14){
			card = 11;
		}
		dealertotal += card;
		System.out.println("The dealer is showing " + dealertotal);
		while (dealertotal < 17)
		{
			card = gen.nextInt(14) + 1;
			if ((card > 10) && (card < 14)){
				card = 10;
			}
			if (card == 14){
				card = 11;
				if ((card + dealertotal) > 21){
					card = 1;
				}
			}
			dealertotal += card;
			System.out.println("The dealer got " + card + " for a total " + dealertotal);
		}
		if(dealertotal <= 21){
			return dealertotal;
		}
		else return -1;
	}




public static void PrintTotal(int playertotal)
	{
		
		System.out.println("You're showing: " + playertotal);
		switch (playertotal)//need to finish switch statement
		{
			case 20:
			case 21:
				System.out.println("With those cards you better stand");
				break;
			case 17:
			case 18:
			case 19:
				System.out.println("Do you feel lucky?");
				break;
			case 12:
			case 13:
			case 14:
			case 15:
			case 16:
				System.out.println("No guts no glory");
			default:
				System.out.println("Draw you chicken");
				break;
			
		}
	
		
	}
	

}