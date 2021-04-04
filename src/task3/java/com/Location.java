package task3.java.com;

public class Location {
public void data() {
	int a = 10;
System.out.println("Memory location");
System.out.println(System.identityHashCode(a));
}
public static void main(String[] args) {
	Location s = new Location();
	s.data();
}
}
