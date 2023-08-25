import java.util.Scanner;

public class RandomGuessMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//initializing constants
		final int MIN = 1; 
		final int MAX = 5;
		
		//initializing the keyboard to read the user's input 
		Scanner keyboard = new Scanner(System.in);
		
		//declaring variables for random number, user's guess, and boolean checker 
		int random; 
		int guess; 
		boolean check;
		
		//generating random number
		random = 1 + (int)(Math.random() * MAX);
		
		//asking the user for the input 
		System.out.println("Guess the number: ");
		
		//reading user's input 
		guess = keyboard.nextInt();
		
		//checking if the user's guess was right or not and calculating the difference 
		//between the random number and user's guess
		if (guess >= random)
		{System.out.println("The difference between your guess and the random number is: " + (guess - random));}
		else if (guess < random)
		{System.out.println("The difference between your guess and the random number is: " + (random - guess));}
		
		//displaying the generated random number
		System.out.println("The random number is: " + random);
		
		//checking if the user's guess was right or not 
		//and displaying true or false message 
		if (guess == random) {check = true;}
		else {check = false;} 
		System.out.println(check);
	}

}
