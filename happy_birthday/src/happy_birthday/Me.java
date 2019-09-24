package happy_birthday;

import java.util.Date;

public class Me {
	
	
	String date;
	String name;
	String message;
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "Me [date=" + date + ", name=" + name + ", message=" + message + "]";
	}
	public Me(String date, String name, String message) {
		super();
		this.date = date;
		this.name = name;
		this.message = message;
	}
	public void displayMessage() {
		System.out.println("Guess what today is.. it is " + date + "Happy Birthday " + name +
				message + "inside display messages");
				System.out.println();
				
				
		
	}
	
	
	
}
