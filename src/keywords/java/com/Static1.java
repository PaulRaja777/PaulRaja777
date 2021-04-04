package keywords.java.com;

public class Static1{
// Static Block
	static {
	System.out.println("Im Static");
}
// Normal Method
	public void method() {
		System.out.println("Im Method");
	}
// Constructor
	public Static1() {
		System.out.println("Im Constructor");
	}
	public static void main(String[] args) {
	Static1 a = new Static1();
	a.method();
}
	
}
