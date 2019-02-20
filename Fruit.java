package com.org.streamapijava;

public class Fruit
{
	String name,color;
	int calories, price;
	public Fruit(String name, String color, int calories, int price) {
		super();
		this.name = name;
		this.color = color;
		this.calories = calories;
		this.price = price;
	}
	
	
	public String getName() {
		return name;
	}


	public String getColor() {
		return color;
	}


	public int getCalories() {
		return calories;
	}


	public int getPrice() {
		return price;
	}


	@Override
	public String toString() {
		return "Fruit [name=" + name + ", color=" + color + ", calories=" + calories + ", price=" + price + "]";
	}
	

}
