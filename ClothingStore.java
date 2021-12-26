import java.util.Scanner;


/*File: ClothingStore.java
 *Author: Larry Frayer
 *Description: Lets user enter customer's name, item choice and price,
 *then returns info.
 
 */
 class Store { // class name
	 
	 private String name; 
	 private String itemName;
	 private double itemPrice;
	 
	 
	 Store() { //default constructor
		 
	 }
	 Store (String name , String itemName, double itemPrice) { //constructor
		 this.name = name;
		 this.itemName = itemName;
		 this.itemPrice = itemPrice;
		 
	 }
	public String getName() { //getters and setters
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
	public void print() { //print info
		System.out.println(this.getName() + " " + this.getItemName() +
				" " + this.getItemPrice());
	}
	 
	 
} // end of class
public class ClothingStore { 

	
	static double funds = 250.00; // global variable
	public static void main(String[] args) { // begin main method
		Scanner input = new Scanner(System.in);
		Store [] c = new Store[3]; //array of class-type objects
		
		
		
		for (int i = 0; i < c.length; i++) { //allows user to enter information for each object
			System.out.println("Enter customer " + (i + 1) + "'s name, item name and item price:");
			
			c[i] = new Store(input.next(), input.next(), input.nextDouble()); // fill in constructor
			funds = funds - c[i].getItemPrice(); //decrease funds
		}
		if (funds < 0) { //prints message if balance is exceeded
			System.out.println("Balance exceeded");
		}
		

		System.out.println("Remaining funds = " + funds + "\n"); //prints remaining balance
	
		for (int j = 0; j < c.length; j++) { //prints user-entered info
			c[j].print();
		}

	}

}
