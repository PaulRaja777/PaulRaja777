package practice.java.com;

public class Inheritance_Single1 extends Inheritance_Single {
public void son() {
	
	int a=10;
	try {
		System.out.println("My Property is mine"+a/0);
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally {
		
	}
}
public static void main (String[] args) {
	Inheritance_Single1 s = new Inheritance_Single1();
	s.parent();
	s.son();
}
}
