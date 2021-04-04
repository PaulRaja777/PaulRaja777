package variable.java.com;

public class Family {
static String a= "My Variable";//class variable
	public static void family() {
		System.out.println("Static variable in method: "+a);	
	}
	public static void main(String[] args) {
				family();
				System.out.println("static variale in main: ");
	}
}
