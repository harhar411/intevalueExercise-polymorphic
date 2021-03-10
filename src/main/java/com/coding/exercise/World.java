package com.coding.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class World {
	private List<Animal> animals;
	private static int[] a = new int[10];
	private static char[] c = new char[10];
	
	public static void main(String... args) {
		System.out.println(a[0]);
		
		System.out.println((int)c[7]);
		World w = new World();
		w.animals = new ArrayList<Animal>();
		
		Random r = new Random();
		
		for(int i = 0; i < 100; i++) {
			Animal animal;
			
			if(r.nextInt(2) == 0) {
				animal = new Cat();
			}
			else {
				animal = new Dog();
			}
			
			w.animals.add(animal);
		}
		
		// Test the polymorphic property of Animal
		w.interact(w.animals.get(r.nextInt(100)));
	}
	
	public void interact(Animal animal) {
		animal.makeSound();
	}
}
