package variable.java.com;
import java.util.Scanner;
public class Variable {
int a;// class variable
static String n = "My math program";
public static void Raja() {
	System.out.println(n);
}
public static void main(String[] args) {
	Raja();
	int f =20;
	int g =30;
	Scanner c = new Scanner(System.in);
	System.out.println("Enter the value of d: ");
	int d = c.nextInt();
	System.out.println("Enter the value of a: ");
	int a = c.nextInt();
	System.out.println("Addition: "+(a+d));
	System.out.println("In addition with 20: "+(a+d+f));
	System.out.println("In addition with 30: "+(a+d+g));
}
}
