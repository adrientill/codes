package homework;


import java.util.Scanner;

public class Reverse {

public static void main(String[] args) {
	System.out.println(" Enter string to be reversed ");
Scanner read = new Scanner(System.in); // takes input from user and assigns to read
String str = read.nextLine(); // assigns input from reader to str
String reverse = "";

for(int i = str.length() - 1; i >= 0; i--) {
	reverse = reverse + str.charAt(i); //adds character at position i to reverse
}
System.out.println("Reverse string is:");
System.out.println(reverse); // Calls reverse
	}
}
