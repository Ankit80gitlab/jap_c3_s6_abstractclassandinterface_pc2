package com.jap.furniture;public interface IFurniture 
{
    // define the discount percentage for various furniture types

    // define common methods like calculateDiscountedPrice and display furniture details

       double forOffice=0.1;
       double forHome=0.05;
       double forGarden=0.025;
   
       double calculateDiscountedPrice (String furnitureType, int price);

       void displayFurnitureDetails (String color, String furnitureType, String material, int price);

}
