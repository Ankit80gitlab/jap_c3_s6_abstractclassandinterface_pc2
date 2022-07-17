package com.jap.furniture;
public class Furniture implements IFurniture
{
        // declare color, price, discounted price and furniture type as variables
        // use appropriate access specifiers

	double amount=0;

	public double calculateDiscountedPrice (String furnitureType, int price){



		if(furnitureType=="OFFICE")
		{
			amount=price-forOffice*price;
		}
		else if (furnitureType=="HOME")
		{
			amount=price-forHome*price;
		}
		else if (furnitureType=="GARDEN")
		{
			amount=price-forGarden*price;
		}
		return amount;

	}

	public void displayFurnitureDetails (String color, String furnitureType, String material, int price){

		System.out.println("Product Details");
		System.out.println("Color of Furniture - "+color);
		System.out.println("Type of Furniture - "+furnitureType);
		System.out.println("Material of Furniture - "+material);
		System.out.println("Price of the Furniture $"+price);
		System.out.println("Discounted price of the Furniture $"+amount);

	}

}
