/*
Name: Ty Thompson
Current Date: 9/8/2015
Sources:

By submitting this work, I attest that it is my original work and that I did not violate the
University of Mississippi academic policies set forth in the "M" book.
*/ 

import java.util.Scanner;
public class Converter
{	
	public static void main (String	[]args){
		
	String One = "1. To convert a Fahrenheit temerature to Celsius."; // I defined these variables at the beginning, however, 
	String Two = "2. To convert a Celsius temperature to Fahrenheit.";//I now realize that I probbably could have just println their data.
	String Three = "3. To convert miles per hour to kilometers per hour.";
	String Four = "4. To convert kilometers per hour to miles per hour.";
		System.out.println();
		System.out.println("Welcome to the USA Canadian Converter!!!");
		System.out.println("");
		System.out.println("The selections are:");{
			System.out.println("	" + One);
			System.out.println("	" + Two);
			System.out.println("	" + Three);
			System.out.println("	" + Four);
		}
Scanner in = new Scanner(System.in);
int x;
int fy;
double z = .55555555555555555; // I had to use the decimal for 5/9, because for some reason (5/9) makes equation equal 0.


		System.out.println("Enter the number here:");{
			x = in.nextInt();
			System.out.println();

				if(x==1){
					System.out.println("Enter the Fahrenheit temperature:");
						fy = in.nextInt();
	

					System.out.println("Converting " + fy + "° Farenheit to Celsius."); //note that after the degrees sign, a question mark appears in the code. The teachers assistant could not explain the cause of this nor the cause of the improper answer when we use (5/9)
						double result = (fy - 32)*(z);
					System.out.println("The result is " + result + "° Celsius");
				}
		
				else if(x==2){
					System.out.println("Enter the Celsius temperature:");
						fy = in.nextInt();
						
					System.out.println("Converting " + fy + "° Celsius to Farenheit.");
						double result = (fy * (9/5)) + 32;
					System.out.println("The result is " + result + "° Farenheit.");
				}
				else if(x==3){
					System.out.println("Enter the mph:");
						fy = in.nextInt();
						
					System.out.println("Converting " + fy + " mph to kilometers per hour.");
						double result = (fy * 1.609);
					System.out.println("The result is " + result + " kilometers/hour.");
					
				}
				else if(x==4){
					System.out.println("Enter the kph:");
						fy = in.nextInt();
						
					System.out.println("Converting " + fy + " kph to miles per hour.");
						double result = (fy / 1.609);
					System.out.println("The result is " + result + " miles/hour.");
				}
				else if(x>=5){
					System.out.println("Invalid number entered. Good-bye");
				}
			}	
		}

	}	
	