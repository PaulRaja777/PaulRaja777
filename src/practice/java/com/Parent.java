package practice.java.com;

public class Parent extends Child{
	
	
	public Parent(String a) {
		super(a);
	}

	public static void main(String[] args) {
		Child c = new Child("From child");
		c.print();
	}

}
