package com.hs.s5;

public class Car {

	String company;
	String brand;
	String color;
	int door;
	
	//생성자 생성
	public Car() {
		//this()
		this("Black");
	}
	
	
	public Car(String color) {
		this.company="Benz";
		this.brand="G-Class";
		this.color=color;
		this.door=5;
		this.info();
	}
	
	public Car(String color, int door) {
		this.company="Benz";
		this.brand="G-Class";
		this.color=color;
		this.door=door;
		this.info();
	}
	
	
	
	public void info() {
		System.out.println("Company : "+this.company);
		System.out.println("Brand : "+this.brand);
		System.out.println("Color : "+this.color);
		System.out.println("Door : "+this.door);
	}
}
