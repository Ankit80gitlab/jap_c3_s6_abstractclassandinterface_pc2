package com.jap.furniture;
import java.util.Scanner;
public class FurnitureDemo
    {
        public static void main(String[] args)
        {
			Scanner sc=new Scanner(System.in);
            // Declare Objects for the furniture Bookshelf, Table and Sofa
            // Ensure that the super type refers to the sub classes
            // Display the details of each of them

			Bookshelf obj1 = new Bookshelf("Black","OFFICE","Ply-Wood",1000);
			Sofa obj2 = new Sofa("White","HOME","Leather",1200);
			Table obj3 = new Table ("Grey","GARDEN","Particle-Wood",800);
			Furniture obj4 =new Furniture();

			FurnitureType opt1 = FurnitureType.OFFICE;
			FurnitureType opt2 = FurnitureType.HOME;
			FurnitureType opt3 = FurnitureType.GARDEN;

			System.out.println();
			System.out.println("---------Welcome to the Furniture Mart----------");
			System.out.println();
			obj1.showSpecs();
			System.out.println("------------------------------------------------");
			obj2.showSpecs();
			System.out.println("------------------------------------------------");
			obj3.showSpecs();
			System.out.println("------------------------------------------------");
			System.out.println("1.OFFICE   2.HOME   3.GARDEN");
			System.out.println("Select the product to get the discounted price");
			int input=sc.nextInt();
			System.out.println("------------------------------------------------");
			switch(input)
			{

				case 1:
					obj4.calculateDiscountedPrice("OFFICE", 1000);
					obj4.displayFurnitureDetails("Black", "OFFICE", "Ply-Wood", 1000);
					break;
				case 2:
					obj4.calculateDiscountedPrice("HOME", 1200);
					obj4.displayFurnitureDetails("White", "HOME", "Leather", 1200);
					break;
				case 3:
					obj4.calculateDiscountedPrice("GARDEN", 800);
					obj4.displayFurnitureDetails("Grey", "GARDEN", "Particle-Wood", 800);
					break;
			}
			System.out.println("------------------------------------------------");
			System.out.println("    The Furniture and Fittings Company (FFC)    ");
			System.out.println("------------------------------------------------");

        }   
    }
