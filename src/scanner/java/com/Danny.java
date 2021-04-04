package scanner.java.com;

import java.util.Scanner;

public class Danny {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter your domain: ");
	String dm = s.nextLine();
	System.out.println("Enter your ID number: ");
	long id = s.nextLong();
	System.out.println("Enter your Department: ");
	String dept = s.next();
	System.out.println("Enter your CGPA: ");
	Float cgpa = s.nextFloat();
	System.out.println("Your details: " +"\n"+id +"\n"+dept +"\n" +dm +"\n" +cgpa );
	}
}
