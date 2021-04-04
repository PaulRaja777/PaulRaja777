package controlstatement.java.com;

public class Pre_Post_Increment {
public static void main(String[] args) {
	int a = 10;
	int b = 10;
	//Post increment
	System.out.println(a);
	System.out.println(a++); //Post increment happen in next step
	System.out.println(a);
	//Pre increment
	System.out.println(b);
	System.out.println(++b);//Pre increment happen in same step
}
}
