package Trail;

public class Type_Casting {

	public static void main(String[] args) {
		
		int a = 512;
		
		// Widening
		
		long b = a;
		
		System.out.println("Long: "+b);
		
		//narrowing
		
		double c = 85.0045526541;
		
		float d = (float) c;
		
		System.out.println("Float : "+d);
		
	}
}
