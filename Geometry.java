import java.util.Scanner;

public class Geometry
{
	public static Scanner scan = new Scanner(System.in);
	
	public static void main (String [] args)
	{
		int choice;
		
		do
		{
		choice = getChoice();
		processChoice(choice);
		}while (choice != 4);
		
	}

public static int getChoice()
{
System.out.println("Choose what you would like to calculate");
System.out.println("1. Find the area of a circle");
System.out.println("2. Find the area of a rectangle");
System.out.println("3. Find the area of a triangle");
System.out.println("4. Exit the program");
return scan.nextInt();
}

public static void processChoice(int choice)
{
	double value = 0;
	double radius;
	double length;
	double width;
	double height;
	double base;
	
	switch (choice)
	{
	 case 1:
		System.out.print("Enter the radius of the circle: ");
		radius = scan.nextDouble();
		value = circleArea(radius);
		System.out.println("The area of the circle is " + value + "\n");
		break;
	case 2:
		System.out.print("Enter the length of the rectangle: ");
		length = scan.nextDouble();
		System.out.print("Enter the width of the rectangle: ");
		width = scan.nextDouble();
		value =	rectangleArea(length, width);
		System.out.println("The area of the recatnge is " + value + "\n");
		break;
	case 3:
		System.out.print("Enter the height of the triangle: ");
		height = scan.nextDouble();
		System.out.print("Enter the base of the triangle: ");
		base = scan.nextDouble();
		value = triangleArea(height,base);
		
		System.out.println("The area of the triangle is " + value + "\n");
		break;
	case 4:
		System.out.println("Goodbye");
		break;
	default:
		System.out.println("You did notenter a valid choice.");
	}
}

public static double circleArea (double radius)
{

 double area = (3.14159265359)*(radius)*(radius);
return area;


}

public static double rectangleArea (double length, double width)
{
	double area = (length)*(width);
	return area;
}

public static double triangleArea (double height, double base)
{
	double area = (.5)*(base)*(height);
	return area;
}
}