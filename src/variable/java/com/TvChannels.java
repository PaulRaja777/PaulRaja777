package variable.java.com;

public class TvChannels {
double a;
	public void channelInfo() {
		System.out.println("No of channels: "+a);
}
	public static void main(String[] args) {
		TvChannels Info = new TvChannels();
		Info.channelInfo();
	}
}
