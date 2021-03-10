package com.coding.exercise;

import java.util.Random;

public class Dog implements Animal {
	private int soundBehavior;
	
	public Dog() {
		this.soundBehavior = new Random().nextInt(3) + 1;
	}
	
	@Override
	public void makeSound() {
		if(this.soundBehavior == 1) {
			this.growl();
		}
		else if(this.soundBehavior == 2) {
			this.bark();
		}
		else {
			this.howl();
		}
	}

	private void growl() {
		System.out.println("GROWL!!!");
	}
	
	private void bark() {
		System.out.println("RARF!!!");
	}
	
	private void howl() {
		System.out.println("AAAWOOOOHHHH!!!!!");
	}
}
