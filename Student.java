public class Student
{
	String name;
	int id;
	double gpa;
	public Student() // same name as class
	{
		name = "";
		id = 0;
		gpa = 0;
	}
	public void setName(String Name)
	{
		name = Name;
	}
	public void setID(int ID)
	{
		id = ID;
	}
	
	
	public void setGPA(double GPA)
	{
		gpa = GPA; 
	}
	public double getGPA()
	{
		return gpa;
	}
	public String getName()
	{
		return name;
	}
	public int getID()
	{
		return id;
	}
	
}