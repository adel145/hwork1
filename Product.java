
public class Product {

	private String name;
	private static int numberID=0;
	private int id;
	private double price;
	private double weigth;

	public Product(String name, double price, double weigth) {
		this.id=numberID++;
		this.name = name;
		this.price = price;
		this.weigth = weigth;
	}

	public Product(Product p) {
		this.id=p.id;
		this.name = p.name;
		this.price = p.price;
		this.weigth = p.weigth;
	}

	public double getPrice() {
		return this.price;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
	

	public void increasePrice(int precent) {
		this.price += ((this.price * precent) / 100);
	}

	public double getWeigth() {
		return this.weigth;
	}

	public void setWeigth(double newW) {
		this.weigth = newW;
	}

	public String getName() {
		return this.name;
	}

	void setName(String name) {
		this.name = name;
	}
	public int getID()
	{
		return id;
	}

	@Override
	public String toString() {
		return String.format("ID : %d \n"
				+ " Name : %s \n"
				+ " Price : %.2f \n"
				+ " Weigth : %.2f \n", numberID, this.name,
				this.price, this.weigth);
	}

}
