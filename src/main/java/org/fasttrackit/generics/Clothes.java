package org.fasttrackit.generics;

import lombok.Data;

@Data
public class Clothes implements ShopItem {
    private String name;
    private int price;
    private Category category;

    public Clothes(String name, int price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String name() {
        return name;
    }

    public int price() {

        return price;
    }

    public Category category() {

        return category;
    }


}
