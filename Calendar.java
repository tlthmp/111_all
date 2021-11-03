import java.util.Scanner;
public class Calendar
{
	public static void main (String []args)
	{
		System.out.println("Welcome to the Calendar!");
		System.out.println();
Scanner in = new Scanner(System.in);


		System.out.print("Please enter the first letter of your birthmonth:");
		System.out.println();
			String BirthMonth = in.next();
			

			
		switch (BirthMonth) 
		{
			case "A":
			System.out.println("The months that begin with an 'a' are April and August.");
			break;
			case "D":
			System.out.println("The month that begins with the letter 'd' is December.");
			break;
			case "F":
			System.out.println("The month the begins with the letter 'f' is February.");
			break; 
			case "J":
			System.out.println("The months that begin with the letter 'j' are January, June, and July.");
			break;
			case "M":
			System.out.println("The months that begin with the letter 'm' are March and May.");
			break;
			case "N":
			System.out.println("The month that begins with the letter 'n' is November.");
			break;
			case "O":
			System.out.println("The month that begins with the letter 'o' is October");
			break;
			case "S":
			System.out.println("The month that begins with the letter 's' is September.");
			break;
			case "a":
			System.out.println("The months that begin with an 'a' are April and August.");
			break;
			case "d":
			System.out.println("The month that begins with the letter 'd' is December.");
			break;
			case "f":
			System.out.println("The month the begins with the letter 'f' is February.");
			break; 
			case "j":
			System.out.println("The months that begin with the letter 'j' are January, June, and July.");
			break;
			case "m":
			System.out.println("The months that begin with the letter 'm' are March and May.");
			break;
			case "n":
			System.out.println("The month that begins with the letter 'n' is November.");
			break;
			case "o":
			System.out.println("The month that begins with the letter 'o' is October");
			break;
			case "s":
			System.out.println("The month that begins with the letter 's' is September.");
			break;
			default:
			System.out.println("There is no month which starts with that letter.");
			break;
			
		}
			
	}
	
}