
import java.util.Arrays;

public class Customer extends Order{
	
	private String name;
	private String number;
	private Order[] order=new Order[1];
	
	public Customer(String na , String number,String name, double price, double weigth,int quant,String d,Item[] arr) {
	
	super( name,  price,  weigth,quant, d,arr);
	this.name=na;
	this.number=number;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String n)
	{
		this.name=n;
	}
	public String getNumber(){
		return this.number;
	}
	public void setNumber(String num) {
		this.number=num;
	}
	public Order[] getOrderList()
	{
		return order;		
	}
	
	public void addOrder(Order ord)
	{
		Order[] temp=new Order[this.order.length+1];
		for(int i=0;i<this.order.length;i++)
			temp[i]=this.order[i];
		
		temp[this.order.length]=ord;
		this.order=temp;
	}
	
	public double datePrice(String d)
	{
		for(int i=0;i<this.order.length;i++)
		{
			if(this.order[i].getDate()==d)
				return this.order[i].totalPrice();
		}
		return 0;
	}
	
	
	@Override
	public String toString() {
		String[] totalString=new String[this.order.length];
		for(int i=0;i<this.order.length;i++)
		{
			totalString[i]=this.order[i].getDate().toString();
			
		} 
		return String.format("---- Customer ---\n Name : %s \n Number : %s \n ",this.name,this.number) + Arrays.toString(totalString) ;
	}

}
