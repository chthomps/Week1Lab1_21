

import java.util.Scanner;

public class AgeGuess {

//A program prompting the user to guess the age of a famous person.

	public static void main(String[] args) {
		
		String name;
		int ageGuess;
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Enter the name of a famous, contemporary person: "); 
		name = scan.nextLine();
		
		System.out.print("Enter an age guess for " +name+ "'s age: ");
		ageGuess = scan.nextInt();
		
		System.out.println(name + ", " + ageGuess);
		

	}

}
