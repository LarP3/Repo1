//Digital Forensics Assignment
package encoderhw1;
import java.util.Scanner;

import javax.crypto.Cipher;



public class Encoder {
static void encrypt() {
		Scanner input = new Scanner(System.in);
		System.out.print("Input message to encode: ");
		String s = input.nextLine();
		System.out.print("\nEnter the space that each character should shift: ");
		int shift = input.nextInt();
	    String cipher = " ";
		char alphabet;
		for (int i = 0; i <s.length();i++) {
			alphabet = s.charAt(i);
			
			if(alphabet >= 'a' && alphabet <='z') {
				alphabet = (char) (alphabet + shift);
				if (alphabet > 'z') {
					alphabet = (char) (alphabet + 'a'-'z' - 1);
				}
				cipher = cipher + alphabet;
			}
			
			else if (alphabet >= 'A' && alphabet <='Z') {
				alphabet = (char) (alphabet + shift);
				
				if (alphabet > 'Z') {
					alphabet = (char) (alphabet + 'A'-'Z'-1);
				}
				cipher = cipher + alphabet;
			}
			else {
				cipher = cipher + alphabet;
			}
		}
		System.out.println(" \nciphertext: " + cipher + "\n");
	}
	static void decrypt() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Message to decode\n");
		String s = input.nextLine();
		System.out.println("Enter the space that each character should shift\n");
		int shift = input.nextInt();
		String decryption = "";
		for(int i = 0; i < s.length(); i++) {
			char alphabet = s.charAt(i);
			if (alphabet >= 'a' && alphabet <= 'z') {
				alphabet = (char)(alphabet- shift);
				
				if (alphabet < 'a') {
					
					alphabet = (char) (alphabet - 'a' + 'z' + 1);
				}
				decryption = decryption + alphabet;
			}
			
			else if(alphabet >= 'A' && alphabet <= 'Z' ) {
				alphabet = (char) (alphabet - shift);
				
				if(alphabet < 'A') {
					alphabet = (char) (alphabet - 'A' + 'Z' + 1);
				}
				decryption = decryption + alphabet;
			}
			else {
				decryption = decryption + alphabet;
			}
		}
		System.out.println("\n\tDecrypted message: " + decryption + "\n");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner selection = new Scanner(System.in);
		
		while (true) {
			
			System.out.println("Enter \"e\" to encode a string\n");
			System.out.println("Enter \'d\' to decode a string.\n");
			System.out.println("Enter \'q\' to quit program.");
			
			
			char choice = selection.next().charAt(0);
			System.out.println();
			
			switch (choice) {
			  
			case 'e' : 
				
				encrypt();
			
				break;
				
			case 'd':
			
				decrypt();
				
				break;
			
			case 'q':
				
				System.out.println("Quitting program");
				System.exit(0);
			    default:{ 
				
				System.out.println("Ending program");
			}
			
			}
			
			}
			
				}
			}

	
	

			
			

	





	

