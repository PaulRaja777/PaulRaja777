package scanner.java.com;

import java.util.Scanner;

public class Student {
	 int t;
	 float av;
public int total(int a,int b,int c,int d,int e) {
	t = a+b+c+d+e;
	System.out.println("Total marks: "+t);
	return t;
}
public float average() {
	av = t/5;
	System.out.println("Average :"+av);
	return av;
}
public static void main(String[] args) {
	Scanner dt= new Scanner(System.in);
	System.out.println("Enter your ID:");
	int id= dt.nextInt();
	System.out.println("Enter your name:");
	String name= dt.next();
	System.out.println("Enter your 5 marks: ");
	int m1 = dt.nextInt();
	int m2 = dt.nextInt();
	int m3 = dt.nextInt();
	int m4 = dt.nextInt();
	int m5 = dt.nextInt();
	System.out.println("Your name is "+name);
	System.out.println("Your ID is "+id);
	Student ma = new Student();
	ma.total(m1,m2,m3,m4,m5);
	ma.average();
}
}
