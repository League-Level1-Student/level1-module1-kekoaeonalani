package _07_duck;



public class Duck {
	int numberOfFriends;
	String favoriteFood;
	
	Duck(String favoriteFood, int numberOfFriends) {
	       this.favoriteFood = favoriteFood;
	       this.numberOfFriends = numberOfFriends;
	}
	
	
	void quack() {
		System.out.println("Quack");
	}
	void waddle() {
		System.out.println("waddlewaddle");
	}
	
	
	
	


}

