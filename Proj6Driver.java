/*
Name: Ty Thompson
Current Date: 12/02/2015
Sources: TA: Sean O'Hara

By submitting this work, I attest that it is my original work and that I did not violate the
University of Mississippi academic policies set forth in the "M" book.
*/ 
import java.util.Scanner;
import java.io.*;
import java.util.Arrays;
public class Proj6Driver
{

	public static void main (String[] args) throws FileNotFoundException
	{
		int logic1 = 0;
		int logic2 =0;
		int logic3 =0;
		boolean var = false;
		Student[] arrayStudent = new Student[20];
		File data = new File("data.txt");
		Scanner input = new Scanner(data);
		for (int i = 0; i < arrayStudent.length; i++)
		{
			arrayStudent[i] = new Student();
		}
		while (input.hasNextLine()){
			String line = input.nextLine();
			if(line.length()==4){
				arrayStudent[logic1].setGPA(Double.parseDouble(line));
				logic1++;
			}
			else if(line.length()==6){
				arrayStudent[logic2].setID(Integer.parseInt(line));
				logic2++;
			}
			else
			{
				arrayStudent[logic3].setName(line);
				logic3++;
			}
		}
		int response = 0;
		do
			{
				System.out.println("Your choices are:");
				System.out.println("1. Print all the data");
				System.out.println("2. Print the average GPA");
				System.out.println("3. Find the person with the highest GPA.");
				System.out.println("4. Find the person with the lowest GPA.");
				System.out.println();
				System.out.println("Enter the number of your choice or -1 to quit");
				Scanner in = new Scanner(System.in);
				response = in.nextInt();
				if (response == 1){
				Print(arrayStudent, logic1);	
				}
				else if (response == 2){
				Average(arrayStudent, logic1);
				}
				else if (response == 3){
				Highest(arrayStudent, logic1);
				}
				else if (response == 4){
				Lowest(arrayStudent, logic1);	
				}
				else {
					response = -1;
				}
				
				
				
				
			}while(response != -1);
	}
	public static void Print(Student[] arrayStudent, int logic)
	{
		for (int i = 0; i < logic; i++)
		{
			System.out.println("Name: " + arrayStudent[i].getName() +" ID#: " + arrayStudent[i].getID() + " GPA: " + arrayStudent[i].getGPA());
		}
		System.out.println("");
		
		
	}
	
	public static void Average(Student[] student, int Logic1)
	{
		double sum = 0.0;
		for (int i = 0; i < Logic1; i++)
		{
			sum += student[i].getGPA();
		}
		System.out.println("The Average is " + sum/Logic1);
		System.out.println("");
	}
	public static void Highest(Student[] student, int Logic1)
	{
		double highest = 0;
		String name ="";
		for (int i = 0; i < Logic1; i++)
		{
			if(student[i].getGPA()>highest){
				highest = student[i].getGPA();
				name = student[i].getName();
			}
			//store index
		}
		System.out.println("The highest GPA is " + highest + " and is held by " + name);
		System.out.println("");
	}
	public static void Lowest(Student[] student, int Logic1)
	{
		double lowest = student[0].getGPA();
		String name = ""; 
		for (int i = 0; i < Logic1; i++)
		{
			if(student[i].getGPA()<lowest){
				lowest = student[i].getGPA();
				name = student[i].getName();
			}
			
			
		}
		System.out.println("The lowest GPA is " + lowest + " and is held by " + name);
		System.out.println("");
	}
	
	
}