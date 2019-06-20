package com.codingdojo.objects.part2;

public class Wizard extends Human {
	
	public Wizard(){
		this.health = 50;
		this.intelligence = 8;
	}
	public void heal(Human human) {
		human.health += intelligence;
	}
	public void fireball(Human human) {
		human.health = human.health - (this.intelligence*3);
	}
}
