/*
 * Program 2
 * Modify your stupid number-guessing game to actually pick a random number from 1 to 10 
 * and have the user try to guess that. Tell them if they get it right or wrong, and if 
 * they get it wrong, show them what the random number was.
 * They will still only get one try.
 * */
import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame02 {

	public static void main(String[] args){
	// Initialize Scanner Object
			Scanner in = new Scanner(System.in);
			// Initialize random object
			Random random = new Random();
			// maximum possible number
			int max = 10;
			//minimum possible number
			int min =1;
			/*variable that will hold the value of the user guess 
			 * initialize as 100 , since 100 is not a possible answer/option
			*/
			int answer =100;
			// randomNum is initialize to 0
			int randomNum =0;
			
			while(answer != randomNum){
				randomNum = random.nextInt(max - min + 1 ) + min;
				
				System.out.print("\nI'm thinking of a number from 1 to 10. \nYour guess: ");
				answer = in.nextInt();
				
				if(answer != randomNum)System.out.println("Sorry, but I was really thinking of"+ randomNum + ".");
			}
			
			System.out.print(" That's right!  My secret number was"+ randomNum+"!");
			
	}			
}
