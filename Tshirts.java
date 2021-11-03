public class Tshirts
{
	String size;
	String color;
	
	public Tshirts()
	{
	size = "";
	color = "";
	}
	public Tshirts(String sizes, String colors)
	{
		size = sizes;
		color = colors;
	}
	public String getSize()
	{
		return size;
	}
	public String getColor()
	{
		return color;
	}
}