
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Customer[] costArr = new Customer[4];

		int end = -1;
		// String na , String number,String name, double price, double weigth,int
		// quant,Date d,Item[] arr
		costArr[0].setDate("19980514");
		costArr[0].setName("Adel Mohsen");
		costArr[0].setNumber("0528040075");
		costArr[0].addOrder("meat", 83.5, 1.2, 3);

		costArr[1].setDate("19990320");
		costArr[1].setName("Ortal Zawda");
		costArr[1].setNumber("05287657675");
		costArr[1].addOrder("milk", 6.7, 0.2, 4);

		costArr[2].setDate("19970324");
		costArr[2].setName("tsvekad cohen");
		costArr[2].setNumber("0547889095");
		costArr[2].addOrder("ciggarete", 35, 0.1, 10);

		costArr[3].setDate("19954554");
		costArr[3].setName("Ahtgdbnhsen");
		costArr[3].setNumber("0553647575");
		costArr[3].addOrder("chocolate", 15.9, 0.5, 6);

		System.out.println("Please choose a number : \n"
				+ " 1 - To print details of the customer whose cost of all his orders was the highest  \n"
				+ " 2 - To print the names of the customers who made purchases at a certain time according to your choice \n"
				+ " 3 - To print the details of the product that sells the most among the existing customers in the array \n"
				+ " 0 or anything - To End\n");

		while (end != 0) {
			switch (end) {
			case 1:
				double ordersNum = 0;
				int temp=0;
				for (int i = 0; i < 4; i++) {
					if (costArr[i].totalPrice() >= ordersNum) {
						ordersNum = costArr[i].totalPrice();
						temp = i;
					}
				}
				System.out.println(costArr[temp].toString());
				break;
			case 2:
				System.out.println("Witch date ? ");
				String d = sc.next();

				for (int i = 0; i < 4; i++) // the 4 is the array length so I dont need to use it .
				{
					if (costArr[i].getDate() == d) {
						System.out.println(costArr[i].getName());
					}

				}

				break;
			case 3:
				int temp1=0;
				int qtemp = 0;
				for (int i = 0; i < 4; i++) {
					if (costArr[i].getQuant() > qtemp) {
						qtemp = costArr[i].getQuant();
						temp = i;
					}
				}
				System.out.println(costArr[temp1].getOrderList()[0].getArr()[0].toString());

				break;

			default:
				end = 0;
				break;
			}
		}

	}

}
