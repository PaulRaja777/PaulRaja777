package interview.java.programs;

public class Reverse_Number {
public static void main(String[] args) {
	int a =  12345;
	int n = a;
	int j=0,i = 0;
	while(n>0){
		i = n%10; // 5
		j = (j*10)+i; //j = (0*10)+5
		n=n/10;   // n = 12345/10 = 1234
		}
	System.out.println("Reverse Numer is "+j);
}
}
