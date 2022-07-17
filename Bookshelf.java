package com.jap.furniture;
public class Bookshelf extends Furniture {
	// specify attributes for BookShelf
	// define constructors, ensure the super keyword is used


	String color;
	String furnitureType;
	String material;
	int price;

	public Bookshelf(String color, String furnitureType, String material, int price) {

		this.color = color;
		this.furnitureType = furnitureType;
		this.material = material;
		this.price = price;
	}

	public void showSpecs() {
		System.out.println("Product - Bookshelf");
		System.out.println("Color of Furniture - " + color);
		System.out.println("Type of Furniture - " + furnitureType);
		System.out.println("Price of the Furniture - $" + price);
	}
}
