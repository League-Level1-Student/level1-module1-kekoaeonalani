package _03_cat;

public class CatRunner {
	public static void main(String[]args) {
		Cat brooster = new Cat("brooster");
		brooster.meow();
		brooster.printName();
		for(int i = 9; i > 0; i --) {
			brooster.kill();
		}
	}
	
	
}
