
public class Lab10Driver
{
	public static void main (String[] args)
	{
		Buyer buyer1 = new Buyer();
		Buyer buyer2 = new Buyer();
		Buyer buyer3 = new Buyer();
		
		buyer1.setName("Bob Jones");
		buyer2.setName("Stefanie Wright");
		buyer3.setName("Cornelius Smith");
		
		buyer1.setAcnum(87523);
		buyer2.setAcnum(54321);
		buyer3.setAcnum(23945);
		
		Tshirts tshirt1 = new Tshirts(null,null);
		Tshirts tshirt2 = new Tshirts("Large","Blue");
		Tshirts tshirt3 = new Tshirts("Small","Pink");
		Tshirts tshirt4 = new Tshirts("Medium","Green");
		
		System.out.println("The Buyers name:" + buyer1.getName() + " and his account #" + buyer1.getAcnum());
		System.out.println("The T-shirt size: " + tshirt2.getSize() + " comes in:" + tshirt2.getColor());
		System.out.println("");
		
		System.out.println("The Buyers name:" + buyer2.getName() + " and his account #" + buyer2.getAcnum());
		System.out.println("The T-shirt size: " + tshirt3.getSize() + " comes in:" + tshirt3.getColor());
		System.out.println("");
		
		System.out.println("The Buyers name:" + buyer3.getName() + " and his account #" + buyer3.getAcnum());
		System.out.println("The T-shirt size: " + tshirt4.getSize() + " comes in:" + tshirt4.getColor());
		System.out.println("");
		
		System.out.println("The Buyers name: Joey and his account #42");
		System.out.println("The T-shirt size: " + tshirt1.getSize() + " comes in:" + tshirt1.getColor());
		System.out.println("Joey doesn't wear T-shirts");
		
	}
	
}