/*
Name: Ty Thompson
Current Date: 9/22/2015
Sources: none

By submitting this work, I attest that it is my original work and that I did not violate the
University of Mississippi academic policies set forth in the "M" book.
*/ 
import java.util.Scanner;
public class Horoscope
{
	public static void main (String []args)
	{
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("Welcome to the Horoscope Calculator!");
		System.out.println("Learn your Horoscope and get your sign!");
		System.out.println("");
	
Scanner in = new Scanner(System.in);
int monthDigits = 0; //the two digit month that the user enters
int dayDigits = 0; //the two digitd day that the user enters

		
		
		System.out.println("Enter the two-digit month you were born. (Ex: 05 for May)");
		monthDigits = in.nextInt();
			System.out.println("Enter the two-digit day you were born.");
		dayDigits = in.nextInt();
		System.out.println();
		
		switch (monthDigits) 
		{
			case 01:
			if( dayDigits <= 19 )
			{
				System.out.println("You are a Capricorn!");
				System.out.println("Your Zodiac Sign is the goat!");
				System.out.println("Your job will bestow you with extreme respect.");
			}
			if ( dayDigits >= 20)
			{
				System.out.println("You are an Aquarius!" );
				System.out.println("Your Zodiac Sign is the Water Bearer!");
				System.out.println("Aquarians like to surround themselves with lots of people, preferably family and friends. ");
			}
			break;
			
			case 02:
			if (dayDigits <= 19)
			{
				System.out.println("You are an Aquarius!");
				System.out.println("Your Zodiac Sign is the Water Bearer!");
			}
			if (dayDigits >= 20)
			{
				System.out.println("You are an Pisces!");
				System.out.println("Your Zodiac Sign is Ying&Yang!");
				System.out.println("Pisces feel a great deal, and they also feel misunderstood much of the time.");
			}
			break;
			
			case 03:
			if (dayDigits <= 20)
			{
				System.out.println("You are a Pisces!");
				System.out.println("Your Zodiac Sign is Ying&Yang!");
				System.out.println("Pisces feel a great deal, and they also feel misunderstood much of the time.");
			}
			if (dayDigits >= 21)
			{
				System.out.println("You are an Aries!");
				System.out.println("Your Zodiac Sign is the ram");
				System.out.println(" While other areas of your life will pick up speed of betterment from August, things in love look opposite.");
			}
			break;
			
			case 04:
			if (dayDigits <= 20)
			{
				System.out.println("You are an Aries!");
				System.out.println("Your Zodiac Sign is the ram");
				System.out.println(" While other areas of your life will pick up speed of betterment from August, things in love look opposite.");
			}
			if (dayDigits >= 21)
			{
				System.out.println("You are a Taurus!");
				System.out.println("Your Zodiac Sign is a Bull!");
				System.out.println("Headache and pain in eyes are also seen on your future cards. Instead of getting panic over these, try to practice Yoga regularly.");
			}
			break;
			
			case 05:
			if (dayDigits <= 20)
			{
				System.out.println("You are a Taurus!");
				System.out.println("Your Zodiac Sign is a Bull!");
				System.out.println("Headache and pain in eyes are also seen on your future cards. Instead of getting panic over these, try to practice Yoga regularly.");
			}
			if (dayDigits >= 21)
			{
				System.out.println("You are a Gemini!");
				System.out.println("Your Zodiac Sign is the Twins!");
				System.out.println("This year, you will share cordial bond with your life partner. ");
				
			}
			break;
			
			case 06:
			if (dayDigits <= 20)
			{
				System.out.println("You are a Gemini!");
				System.out.println("Your Zodiac Sign is the Twins!");
				System.out.println("This year, you will share cordial bond with your life partner. ");
			}
			if (dayDigits >= 21)
			{
				System.out.println("You are a Cancer!");
				System.out.println("Your Zodiac Sign is a Crab!");
				System.out.println("Investments need to be avoided from April 17 to June 29. ");
			}
			break;
			
			case 07:
			if (dayDigits <= 22)
			{
			System.out.println("You are a Cancer!");
			System.out.println("Your Zodiac Sign is a Crab!");
			System.out.println("Investments need to be avoided from April 17 to June 29. ");
			}
			if (dayDigits >= 23)
			{
			System.out.println("You are a Leo!");
			System.out.println("Your Zodiac Sign is a Lion!");
			System.out.println("This year will fulfill your wish, as you will make immense wealth. ");
			}
			break;
			
			case 8:
			if(dayDigits <=22)
			{
			System.out.println("You are a Leo!");
			System.out.println("Your Zodiac Sign is a Lion!");
			System.out.println("This year will fulfill your wish, as you will make immense wealth. ");
			}
			if (dayDigits >= 23)
			{
			System.out.println("You are a Virgo!");
			System.out.println("Your Zodiac Sign is a Virgin!");
			System.out.println("Financial loss is clearly foreseen for you.");
			}
			break;
			
			case 9:
			if (dayDigits <= 22 )
			{
			System.out.println("You are a Virgo!");
			System.out.println("Your Zodiac Sign is a Virgin!");
			System.out.println("Financial loss is clearly foreseen for you.");
			}
			if (dayDigits >= 23)
			{
			System.out.println("You are a Libra!");
			System.out.println("Your Zodiac Sign is a Scale!");
			System.out.println("Your yearly predictions book is missing the chapter of love.");
			}
			break;
			
			case 10:
			if (dayDigits <= 22)
			{
			System.out.println("You are a Libra!");
			System.out.println("Your Zodiac Sign is a Scale!");
			System.out.println("Your yearly predictions book is missing the chapter of love.");
			}
			if (dayDigits >= 23 )
			{
			System.out.println("You are a Scorpio!");
			System.out.println("Your Zodiac Sign is a Scorpion!");
			System.out.println("Physical ailments are not foreseen for you this year.");
			}
			break;
			
			case 11:
			if (dayDigits <=  22)
			{
			System.out.println("You are a Scorpio!");
			System.out.println("Your Zodiac Sign is a Scorpion!");
			System.out.println("Physical ailments are not foreseen for you this year.");
			}
			if (dayDigits >= 23)
			{
			System.out.println("You are a Sagittarius!");
			System.out.println("Your Zodiac Sign is the Archer!");
			System.out.println("Sagittarians who are into service will have a very rewarding year. ");
			} 
			break;
			
			case 12:
			if (dayDigits <= 22)
			{
			System.out.println("You are a Sagittarius!");
			System.out.println("Your Zodiac Sign is the Arcger!");
			System.out.println("Sagittarians who are into service will have a very rewarding year. ");
			}
			if (dayDigits >= 22)
			{
			System.out.println("You are a Capricorn!");
			System.out.println("Your Zodiac Sign is the goat!");
			System.out.println("Your job will bestow you with extreme respect.");
			}
			break;
			
			default:
			System.out.println("You have entered an incorrect month or date.");
			break;
			
			
			
		
			
			
			
				
		
		}
		System.out.println("");
		System.out.println("Goodbye,");
		System.out.println("Have a wonderful day!");
		
	}
	
	
	
	
	
	
	
}