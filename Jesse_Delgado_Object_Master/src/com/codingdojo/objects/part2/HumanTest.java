package com.codingdojo.objects.part2;

public class HumanTest {
	public static void main(String[] args) {
		Ninja ninja = new Ninja();
		Wizard wizard = new Wizard();
		Samurai samurai = new Samurai();
		
		samurai.meditate();
		samurai.howMany();
		samurai.deathBlow(wizard);
		
		wizard.heal(wizard);
		wizard.displayHealth();
	
		wizard.fireball(samurai);
		samurai.displayHealth();
		
		ninja.steal(samurai);
		ninja.displayHealth();
	}
}
