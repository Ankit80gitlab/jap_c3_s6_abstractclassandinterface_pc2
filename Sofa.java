package com.jap.furniture;
class Sofa extends Furniture
    {
        // Specify attributes for Sofa
       // define constructors, ensure the super keyword is used

		String color;
		String furnitureType;
		String material;
		int price;

		public Sofa (String color, String furnitureType, String material, int price) {

			this.color=color;
			this.furnitureType=furnitureType;
			this.material=material;
			this.price=price;
	}

		public void showSpecs() {
			System.out.println("Product - Sofa");
			System.out.println("Color of Furniture - " + color);
			System.out.println("Type of Furniture - " + furnitureType);
			System.out.println("Price of the Furniture - $" + price);
		}

}