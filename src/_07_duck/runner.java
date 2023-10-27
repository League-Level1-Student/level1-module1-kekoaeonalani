package _07_duck;

public class runner {

	public static void main(String[]args) {
		 Duck daffy = new Duck("Honey", 100);
		HapaDog hapa = new HapaDog(2, "Long Beach, CA");
		daffy.quack();
		daffy.waddle();
		hapa.cuddle();
		hapa.wag();
	}
	
	
}
