package com.coding.exercise;

import java.util.Random;

public class Cat implements Animal {
	private int soundBehavior;
	
	public Cat() {
		this.soundBehavior = new Random().nextInt(3) + 1;
	}
	
	@Override
	public void makeSound() {
		if(this.soundBehavior == 1) {
			this.purr();
		}
		else if(this.soundBehavior == 2) {
			this.hiss();
		}
		else {
			this.meow();
		}
	}

	private void purr() {
		System.out.println("rrr rr rrrr rr");
	}
	
	private void hiss() {
		System.out.println("RAAOOOWWW!!!");
	}
	
	private void meow() {
		System.out.println("Meow");
	}
}
