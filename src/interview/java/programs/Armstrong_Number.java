package interview.java.programs;

public class Armstrong_Number {
public static void main(String[] args) {
	int a = 153; // Orginal value
	int n =a; //For iteration
	int i, j = 0; 
	while (n>0) {
		i = n%10;        //remainder
		j = j+(i*i*i);   //Final output stored here
		n = n/10;        // quotient for next iteration
	}
	if (a==j) {
		System.out.println(j+" Armstrong number");
	}
	else {
		System.out.println("Not an Armstrong number");
	}
	}
}
