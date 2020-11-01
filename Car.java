package com.css.javatraining.basic;
public class Car {
	String color;
	String type;
	int serialNumber;
	static int carCount;
	
	
	Car() {
		carCount++;
		serialNumber = carCount;
	}
	
	Car(String color, String type){
		
		
		this.color = color;
		this.type = type;
		
	}
	
	String getDescription()
	{
		String desc = "This is a " + color + " " + type + " ";
		return desc;
	}
	
	void customize(String color, String type)
	{
		this.color=color;
		this.type=type;
		System.out.println(getDescription());
	}
	public static void main(String[] args)
	{
		Car myCar = new Car();
		myCar.customize("Green", "Convertable");
	}
}





