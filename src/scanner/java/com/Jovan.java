package scanner.java.com;
import java.util.Scanner;
public class Jovan {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
	System.out.println("Enter your day of birth: ");
		int day= a.nextInt();
	System.out.println("Enter your month of birth: ");
	    String month = a.next();
	System.out.println("Enter the year: ");
	    int year = a.nextInt();
	System.out.println("Your date of birth is "+day +month +year);
	}
}
