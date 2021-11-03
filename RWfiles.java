import java.io.*;
import java.util.Scanner;
public class RWfiles
{
	public static void main (String	[]args) throws IOException
	{
		
		
		int sum = 0;
		int fileNum = 0;
		
		
		int filename = 0;
		
		File numbers = new File("numbers.txt");
		Scanner input = new Scanner(numbers);
		
		while(input.hasNext())
		{
			
			sum+=input.nextInt();
			fileNum++;
			
		}
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter your name.");
		String name = in.nextLine();
		FileWriter fwriter = new FileWriter("lab6.txt", true);
		PrintWriter prwrite = new PrintWriter(fwriter);
		
			prwrite.println("Name is " + name);
			prwrite.println("the sum of the numbers in Numbers.txt is " + sum);
			prwrite.println("Average is " + (sum/fileNum));
			prwrite.close();
	}
	
}





/*Scanner in = new Scanner(H:());
int i = 0;
		int sum = 0;
		while (i )
					double number = inputFile.nextDouble();

		
		File lab6 = new File("lab6.txt");
		
		
		String numText = null;
		String line = raeder.readLine();
		while (line != null)
		{
			text += line;
			line = reader.readline();
		}
		System.out.println(text);
		String numbers = "H:\\numbers.txt";
	BufferedReader reader = new BufferedReader(file);
Scanner textfile = new Scanner(new File("numbers.txt"));
		y = new File("H:\\numbers.txt");
		double sum = 0;
		double average = 0; 
		double totalNum = 0;
		double x = in.nextDouble();
		File textNumbs;
	FileReader file = new FileReader("H:\\numbers.txt");
		textNumbs = new File("H:\numbers.txt");
		Path filePath = Paths.get("numbers.txt");
		String userName = in.next();
		
		while(scanner.hasNext())
		{
			boolean var = false;
		}while(sum != 0);
	*/
	