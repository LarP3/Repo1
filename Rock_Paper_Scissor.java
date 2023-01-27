import java.util.Scanner;

public class Rock_Paper_Scissor {
	
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Let's play rock, paper, scissors!");
		
		//Initialize user input string
		String userInput = " ";
		String opponent = "";
		
		//Enter user's choice
		System.out.println("Enter rock, paper, or scissor");
		userInput = in.nextLine();
		System.out.print("Choice:  *******");
		//Enter opponent's choice
		System.out.println("\nInput opponent's choice:");
		opponent = in.nextLine();
		
		//conditional statements
		if(userInput.equalsIgnoreCase("Rock")) {
			if (opponent.equalsIgnoreCase("rock")) {
				System.out.println("Tie");
			}
			
			else if(opponent.equalsIgnoreCase("paper")) {
				   System.out.println("Opponent wins!");
			}
			else if(opponent.equalsIgnoreCase("Scissor")) {
				  System.out.println("User wins!!");
			}
		}
		
		if (userInput.equalsIgnoreCase("Scissor")) {
			if(opponent.equalsIgnoreCase("scissor")) {
				System.out.println("Tie");
			}
			
			else if(opponent.equalsIgnoreCase("paper")) {
				   System.out.println("User wins!!");
			}
			else if(opponent.equalsIgnoreCase("Rock")) {
				  System.out.println("Opponent wins!!");
			}
		}
		
		if (userInput.equalsIgnoreCase("Paper")) {
			if(opponent.equalsIgnoreCase("scissor")) {
				System.out.println("Opponent wins!");
			}
			
			else if(opponent.equalsIgnoreCase("Rock")) {
				   System.out.println("User wins!!");
			}
			else if(opponent.equalsIgnoreCase("paper")) {
				  System.out.println("Tie!!");
			}
		}
		
		
		}
		
		
		

	}

