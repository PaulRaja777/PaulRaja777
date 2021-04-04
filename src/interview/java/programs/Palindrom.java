package interview.java.programs;

public class Palindrom {
public static void main(String[] args) {
	int a = 121;
	int n = a;
	int i = 0, j=0;
	while (n>0) {
		i = n % 10;   // 1 2 1
		j = (j*10)+i;  // 0+1 10+2 120+1
		n = n/10;  // 12 1
	}
	if (a==j) {
		System.out.println("Its a palindrom");
	}
	else {
		System.out.println("Not a Palindrom");
	}
}
}
