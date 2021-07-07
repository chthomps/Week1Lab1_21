
import java.util.Scanner;

public class TimeComp {
	
	//A program that reads a seconds input and converts to an equivalent hours, minutes, seconds value.

	public static void main(String[] args) {
		
		
		//Variable definitions
		int seconds, minutes, hours, remainder;
		
		Scanner scan = new Scanner(System.in);
		
		
		//Prompts seconds entry by user
		System.out.print("Enter an integer number of seconds: ");
		seconds = scan.nextInt();
		
		
		//Calculating hours, min, seconds
		hours = seconds/3600;
		remainder = seconds%3600;
		minutes = remainder/60;
		remainder = minutes%60;
		seconds = remainder;
		
		System.out.println(hours+ " hours," +minutes+ " minutes,"+ seconds+ " seconds");

	}

}
