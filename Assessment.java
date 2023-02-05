import java.util.Scanner;
import java.util.*;


 class Questions {
	
	//Q & A example
	Scanner input = new Scanner(System.in);
	
	private Map<String, String> map = new HashMap(); // Map to store quesitons and answers
	private String ans;
	private String [] question = {"What is your favorite color?", "What is your favorite animal?",
			"What is your dream car?", "If you can travel to any country, which one would it be?"};
	public void  getQandA () {
		for (int i = 0; i < question.length; i++) {
			System.out.println(question[i] + " ");
			ans = input.nextLine();
			map.put(question[i], ans);
			System.out.println();
		}
	}
	
	public void displayAnswer() {
		for(int i = 0; i < question.length; i++) {
		System.out.println("The answer to question " + (i + 1)
				+ " is " + map.get(question[i]));
	
	}
	  }
	

}
public class Assessment {
	
	
	
	public static void main(String [] args) {
		
		Questions q = new Questions();
		System.out.println("Answer the displayed question:\n");
		q.getQandA();
		
		System.out.println("Here are your answers");
		q.displayAnswer();
		
		
			
		}
		
	}
		
			
		
	


