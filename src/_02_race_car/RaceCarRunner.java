package _02_race_car;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */



public class RaceCarRunner {
	public static void main(String[] args) {
		/* Do the following things without changing the RaceCar class */
		
		// 1. Create a RaceCar and place it in 5th position
	RaceCar car = new RaceCar("heleToKauai", 15);
		// 2. Print the RaceCar's position in the race
System.out.println("Your position is " + car.positionInRace);
		// 3. Crash the RaceCar
		car.crash();
		// 4. If the car is damaged. Bring it in for a pit stop.
		if (car.isDamaged()) {
			car.pit();
		}
	System.out.println("your position is: " + car.positionInRace);
		// 5. Help the car move into first place.
	
	if(car.positionInRace != 1) {
for(int i  = car.positionInRace; i >= 1; i++) {
car.overtake();
}
	}
	
	else {
		System.out.println("You are in the lead!");
	}

	}
}
