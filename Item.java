
public class Item extends Product {
	

private int quant;
private Product product;

public Item(String name, double price, double weigth,int quantity)
{
	super(name,price,weigth);
	this.quant=quantity;
}
public int getQuant() {
	return this.quant;
}
public void setQuant(int q) {
	this.quant=q;
}
public double totalPrice()
{
	return product.getPrice()*quant;
}

@Override
public String toString() {
	return super.toString()+ String.format("Quantity : %d \n  ",quant);
}

}
