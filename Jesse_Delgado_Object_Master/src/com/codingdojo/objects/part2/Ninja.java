package com.codingdojo.objects.part2;

public class Ninja extends Human {
	public Ninja(){
		this.health = 100;
		this.stealth = 10;
		
	}
	public void steal(Human human) {
		human.health -= stealth;
		this.health += stealth;
	}
}
