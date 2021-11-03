import java.util.Scanner;
public class GradeCalc
{
	public static void main (String []args)
	{
		System.out.println("Welcome to the Grade Calculator!!!");
		System.out.println("");
		System.out.println("Letter grades based on average grade:");
		System.out.println("	"+"A - is a grade of 90 or higher");
		System.out.println("	"+"B - is a grade of 80 to 89");
		System.out.println("	"+"C - is a grade of 70 to 79");
		System.out.println("	"+"D - is a grade of 60 to 69");
		System.out.println("	"+"F - is a grade of 59 and below");
	

Scanner in = new Scanner(System.in);
int a;
int b;
int c;
int d;
int e;
String x;
double answer =0;
String response;


		System.out.println("");
		System.out.println("Please enter a test score:");
			a = in.nextInt();
				System.out.println();
			b = in.nextInt();
				System.out.println();
			c = in.nextInt();
				System.out.println();
			d = in.nextInt();
				System.out.println();
			e = in.nextInt();
				System.out.println();
		
		System.out.println("Please enter name:");
			x = in.next();
				System.out.println();
		
		answer = (a + b + c + d + e)/5;
		System.out.println(answer);
		
		
		if(answer >= 90)
		{
			response = "Congratulations " + x + ", your average is in the A range.";
			System.out.println(response);
		}
		 else if( answer >= 80 && answer < 90)
		{
			response = "Congratulations " + x + ", your average is in the B range.";
			System.out.println(response);
		}
		
		else if( answer >= 70 && answer < 79)
		{
			response = "Congratulations " + x + ", your average is in the C range.";
			System.out.println(response);
		}
		
		else if( answer >= 60 && answer < 69)
		{
			response = "Congratulations " + x + ", your average is in the D range.";
			System.out.println(response);
		}
		
		else if( answer >= 0 && answer < 59)
		{
			response = "Congratulations " + x + ", your average is in the F range.";
			System.out.println(response);
		}
		
		
		
		
		
		

	
		
		
	
		
		}
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	


