package com.css.javatraining.basic;

public class MainAnimal {
	public static void main(String[] args) {
	    Animals myAnimal = new Animals();  
	    Animals mydog = new Dog();  
	    Animals mycat = new Cat(); 
	    myAnimal.animalSound();
	    mydog.animalSound();
	    mycat.animalSound();
	}

}
