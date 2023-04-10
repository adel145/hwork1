
import java.util.Arrays;

public class Order extends Item  {

	private Item[] array=new Item[1];
	private String date;
	
	
	public void setDate(String i) {
		this.date = i;
	}
	public Order(String name, double price, double weigth,int quant,String d,Item[] arr)
	{
		super(name,price,weigth,quant);
		this.date=d;
		this.array=arr;
	}
	
	public String getDate()
	{
		return this.date;
	}

	public void addOrder(String name, double price, double weigth,int quant )
	{
		boolean exist=true;
		for(int i=0;i<this.array.length;i++)
		{
			if(this.array[i].getName()==name)
				exist=false;
		}
		if(exist) {
			Item[] temp=new Item[this.array.length+1];
			for(int i=0;i<this.array.length;i++)
			{
				temp[i]=this.array[i];
			}
			temp[this.array.length].setName(name);
			temp[this.array.length].setQuant(quant);
			temp[this.array.length].setWeigth(weigth);
			temp[this.array.length].setPrice(price);		
			
			this.array=temp;
		}
	}
	
	public void updateQuant(String name,int q)
	{
		for(int i=0;i<this.array.length;i++)
		{
			if(this.array[i].getName()==name)
				this.array[i].setQuant(q);
		}
	}
	
	public double getPrice()
	{
		double total=0;
		for(int i=0;i<this.array.length;i++)
		{
			total+=this.array[i].getPrice()*this.array[i].getQuant();
		}
		return total;
	}
	public Item[] getArr() {
		return this.array;
	}
	
	@Override
	public String toString() {
		String[] totalString=new String[this.array.length];
		for(int i=0;i<this.array.length;i++)
		{
			totalString[i]=this.array[i].toString();
		} 
		return Arrays.toString(totalString) + String.format("\nTotal Price : %.2f\n",getPrice());
	}
	
	
	
	
	/*public String toString() {
		String TotalStr="";
		for(int i=0;i<this.array.length;i++)
		{
			TotalStr+=this.array[i].toString();
		} 
		return TotalStr + String.format("\nTotal Price : %.2f\n",getPrice());
	}  */
	
	
	


}
