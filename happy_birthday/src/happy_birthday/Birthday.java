package happy_birthday;

import java.util.Date;
import java.util.Scanner;

public class Birthday {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is the Date of Birth?");
		String date = scanner.nextLine();
		System.out.println("What is the name? ");
		String name = scanner.nextLine();
		System.out.println("What is the message?");
		String message = scanner.nextLine();
		Me adrien = new Me(date, name, message);
	
		System.out.println(adrien.getName());
		adrien.displayMessage();
		adrien.displayMessage();

		
		
		
		
	
		
		
	}}
		
		
	


