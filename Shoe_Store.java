import java.io.IOException;
import java.util.Scanner;


public class Shoe_Store {

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome to Jessie's Shoes!");
		
		//array to hold brand names
		String [] brand = {"Nike", "Adidas", "Puma"};
		
		//variables
		double change = -1;
		double amount;
		double nikePrice = 400.00;
		double adidasPrice = 200.00;
		double pumaPrice = 100.00;
		int nameBrand = -1;
		
		//for loop to get customers's input
		System.out.println("Enter \"0\" for Nike, \"1\" for Adidas,"
				+ "or \"2\" for Puma: ");
		for (int i = 0; i < brand.length; i++) {
			nameBrand = input.nextInt();
			break;
		}
		
		
		//conditionals to output the users choices
		if (nameBrand == 0) {
			System.out.println("Nike Price: $" + nikePrice);
			
			System.out.println("Enter an amount: ");
			
			amount = input.nextDouble();
			
			if (amount >= nikePrice) {
				System.out.println("Here are your new Nikes!");
				change =  amount - nikePrice;
				System.out.println("Amount paid: $" + amount + "\nChange due: $" + change);
			}
			
			else  {
				System.out.println("unsufficent funds.");
			}
		}
			
			if (nameBrand == 1) {
				System.out.println("Adidas price: $" + adidasPrice);
				
				System.out.println("Enter an amount: ");
				
				amount = input.nextDouble();
				
				if (amount >= adidasPrice) {
					System.out.println("Here are your new Adidas!");
					change = amount - adidasPrice;
					System.out.println("Amount paid: $" + amount + "\nChange due: $" + change);
				}
				
				else  {
					System.out.println("unsufficent funds.");
				}
			}
				
				if (nameBrand == 2) {
					System.out.println("Puma Price: $" + pumaPrice);
					
					System.out.println("Enter an amount: ");
					
					amount = input.nextDouble();
					
					if (amount >= pumaPrice) {
						System.out.println("Here are your new Pumas!");
						change = amount - pumaPrice;
						System.out.println("Amount paid: $" + amount + "\nChange due: $" + change);
					}
					
					else  {
						System.out.println("unsufficent funds.");
					}
			
			}
			
				
		
		
		}
		
	
	
	
	
	
	
	}
		