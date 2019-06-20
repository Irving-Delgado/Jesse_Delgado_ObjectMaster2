package com.codingdojo.objects.part2;

public class Samurai extends Human{
	int count = 1;
	
	public Samurai() {
		this.health=200;
	}
	public void deathBlow(Human human) {
		human.health = 0;
		this.health = (this.health/2);
	}
	public void meditate() {
		this.health += (this.health/2);
		count += 1; 
		System.out.println("While meditating a samurai came to help");
	}
	public void howMany() {
		System.out.println("There are "+count+" Samurai");
	}
}