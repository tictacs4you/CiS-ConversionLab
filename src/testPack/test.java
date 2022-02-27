package testPack;

import java.util.Scanner;

public class test {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Hello user, and welcome to the Celsius and Farenheit converter by Logan and Kenny.  To begin, please select one of the options below.");
		System.out.println("1: Convert Farenheit to Celsius");
		System.out.println("2: Convert Celsius to Farenheit");
		
		Scanner in = new Scanner(System.in);
		int option = in.nextInt();
		switch(option) {
			case 1:
				F2C();
				break;
				
		}
		
	}

	private static void F2C() {
		// TODO Auto-generated method stub
		System.out.print("Converting farenheit to Celcius");
	}

}
