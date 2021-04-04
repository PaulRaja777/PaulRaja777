package task3.java.com;

public class Child implements Abstract1, Abstract2 {
public void a1() {
	System.out.println("A1");
}
public void a2() {
	System.out.println("A2");
}
public void a3() {
	System.out.println("A3");
}
public void a4() {
	System.out.println("A4");
}
public static void main(String[] args) {
	Child d = new Child();
	d.a1();
	d.a2();
	d.a3();
	d.a4();
}
}
