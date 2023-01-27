import java.io.IOException;
import java.util.Scanner;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class Health_Care {
	static Scanner input = new Scanner(System.in);
	

	public static void main(String[] args) throws ClientProtocolException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Jessie's Shoes!");
		
		String [] brand = {"Nike", "Adidas", "Puma"};
		double change = -1;
		double amount;
		double nikePrice = 400.00;
		double adidasPrice = 200.00;
		double pumaPrice = 100.00;
		
		int nameBrand = -1;
		System.out.println("Enter \"0\" for Nike, \"1\" for Adidas,"
				+ "or \"2\" for Puma: ");
		for (int i = 0; i < brand.length; i++) {
			nameBrand = input.nextInt();
			break;
		}
		
		if (nameBrand == 0) {
			System.out.println("Nike Price:" + nikePrice);
			
			System.out.println("Enter an amount: ");
			
			amount = input.nextDouble();
			
			if (amount >= nikePrice) {
				System.out.println("Here are your new Nikes!");
				change =  amount - nikePrice;
				System.out.println("Amount paid: " + nikePrice + "\nChange due: " + change);
			}
			
			else  {
				System.out.println("unsufficent funds.");
			}
		}
			
			if (nameBrand == 1) {
				System.out.println("Adidas price: " + adidasPrice);
				
				System.out.println("Enter an amount: ");
				
				amount = input.nextDouble();
				
				if (amount >= adidasPrice) {
					System.out.println("Here are your new Adidas!");
					change = amount - adidasPrice;
					System.out.println("Amount paid: " + adidasPrice + "\nChange due: " + change);
				}
				
				else  {
					System.out.println("unsufficent funds.");
				}
			}
				
				if (nameBrand == 2) {
					System.out.println("Puma Price: " + pumaPrice);
					
					System.out.println("Enter an amount: ");
					
					amount = input.nextDouble();
					
					if (amount >= pumaPrice) {
						System.out.println("Here are your new Pumas!");
						change = amount - pumaPrice;
						System.out.println("Amount paid: " + pumaPrice + "\nChange due: " + change);
					}
					
					else  {
						System.out.println("unsufficent funds.");
					}
			
			}
			
				
		
		
		}
		
	
	
	
	
	
	
	}
		
		
		
		
		
		
	
		
		
		




