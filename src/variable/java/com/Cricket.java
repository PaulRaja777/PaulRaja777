package variable.java.com;

public class Cricket {
	public void playerInfo() {
		int age= 37;     // local variable
		String name = "Dhoni";   //local variable
		System.out.println("Name of player : " +name);
		System.out.println("Age of player: " +age);
	}
	public static void main(String[] args) {
		Cricket info = new Cricket();
		info.playerInfo();
	}
}
