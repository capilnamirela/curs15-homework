package org.fasttrackit.generics;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws ItemNotFoundException {
        Shop<Clothes> clothesShop = new Shop<>(new ArrayList<>());
        clothesShop.addItem(new Clothes("Dress", 15, Category.ON_SALE));
        clothesShop.addItem(new Clothes("Hat", 25, Category.NEW));
        clothesShop.addItem(new Clothes("Blue Dress", 20, Category.ON_SALE));
        clothesShop.addItem(new Clothes("Red Dress", 35, Category.NEW));

        System.out.println(clothesShop);
        System.out.println("Category ON_SALE: " + clothesShop.findByCategory(Category.ON_SALE));
        System.out.println("PRICE LOWER: " + clothesShop.findWithLowerPrice(30));

        try {
            System.out.println("BY NAME :" + clothesShop.findByName("Dress"));
        } catch (ItemNotFoundException exception) {
            System.out.println("We don't have that item");
        }

        try {
            clothesShop.removeItem("Hat");
        } catch (ItemNotFoundException exception) {
            System.out.println("We don't have that item to delete");
        }

        System.out.println(clothesShop);

        System.out.println("--------------------");

        Shop<Electronics> electronicsShop = new Shop<>(new ArrayList<>());
        electronicsShop.addItem(new Electronics("Radio", 25, Category.NEW));
        electronicsShop.addItem(new Electronics("Old Radio", 10, Category.REFURBISHED));
        System.out.println("BY CATEGORY: " + electronicsShop.findByCategory(Category.REFURBISHED));


    }

}
