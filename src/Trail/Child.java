package Trail;
import practice.java.com.Trail;
public class Child {
	public void danny(){
		System.out.println("Child");
	}
public static void main(String[] args) {
	Parent d = new Parent();
	Child s = new Child();
	Trail e = new Trail();
	d.raja();
	s.danny();
	e.google();
}
}
