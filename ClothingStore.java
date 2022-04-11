
import java.util.Scanner;


/*File: ClothingStore.java
 Author: Larry Frayer
 Description: Store program.
 
 */
 class Store {
	 
	 private String name;
	 private String itemName;
	 private double itemPrice;
	 
	 
	 Store() {
		 
	 }
	 Store (String name , String itemName, double itemPrice) {
		 this.name = name;
		 this.itemName = itemName;
		 this.itemPrice = itemPrice;
		 
	 }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	
	}
	public String toString() {
		return this.getName() + " " + this.getItemName() +
				" " + this.getItemPrice();
	}
	 
	 
}
public class ClothingStore {

	
	static double funds = 250.00;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		Store [] c = new Store[3];
		
		
		
		for (int i = 0; i < c.length; i++) {
			System.out.println("Enter customer " + (i + 1) + "'s name, item name and item price:");
			
			c[i] = new Store(input.next(), input.next(), input.nextDouble());
			funds = funds - c[i].getItemPrice();
		}
		if (funds < 0) {
			System.out.println("Balance exceeded");
		}
		

		System.out.println("Remaining funds = " + funds + "\n");
	
		for (int j = 0; j < c.length; j++) {
			System.out.println(c[j].toString());
		}

	}

}
