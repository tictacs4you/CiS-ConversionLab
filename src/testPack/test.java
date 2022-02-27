package testPack;

import java.util.Scanner;

public class test {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean continueProgram = true;
		
		System.out.println("Hello user, and welcome to the Celsius and Farenheit converter by Logan and Kenny.");
		while (true == continueProgram) {
			System.out.println("To begin, please select one of the options below.");
			System.out.println("1: Convert Farenheit to Celsius");
			System.out.println("2: Convert Celsius to Farenheit");
			System.out.println("3: Exit Program");
			
			Scanner in = new Scanner(System.in);
			int option = in.nextInt();
			switch(option) {
				case 1:
					F2C();
					break;
				case 2:
					C2F();
					break;
				case 3:
					continueProgram = false;
					break;
				default:
					System.out.println("That is not a valid input, please type '1' or '2' to make your selection.");
					
			}
		}
		
	}

	private static void F2C() {
		// TODO Auto-generated method stub
		System.out.println("This works");
	}
	private static void C2F() {
		System.out.println("This works");
	}

}
