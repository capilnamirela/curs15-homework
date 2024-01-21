package org.fasttrackit.generics;


import lombok.Data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Data
public class Shop<T extends ShopItem> {
    private List<ShopItem> newShopItem = new ArrayList<>();

    public Shop(List<ShopItem> newShopItem) {
        this.newShopItem = newShopItem;
    }

    public void addItem(T item) {
        newShopItem.add(item);
    }

    public List<ShopItem> findByCategory(Category category) {
        List<ShopItem> listCategory = new ArrayList<>();
        for (ShopItem item : newShopItem) {
            if (item.category().equals(category)) {
                listCategory.add(item);
            }
        }
        return listCategory;
    }

    public List<ShopItem> findWithLowerPrice(int maxPrice) {
        List<ShopItem> listWithLowerPrice = new ArrayList<>();
        for (ShopItem item : newShopItem) {
            if (item.price() < maxPrice) {
                listWithLowerPrice.add(item);
            }
        }
        return listWithLowerPrice;
    }

    public List<ShopItem> findByName(String name) throws ItemNotFoundException {
        List<ShopItem> byName = new ArrayList<>();
        for (ShopItem item : newShopItem) {
            if (item.name().contains(name)) {
                byName.add(item);
            }
        }
        if (byName.isEmpty()) {
            throw new ItemNotFoundException("We don't have that item");
        } else {
            return byName;
        }
    }

    public void removeItem(String name) throws ItemNotFoundException {
        Boolean verif = false;
        Iterator<ShopItem> iterator = newShopItem.iterator();
        while (iterator.hasNext()) {
            ShopItem shopItem = iterator.next();
            if (shopItem.name().equals(name)) {
                iterator.remove();
                verif = true;
            }
        }
        if (!verif) {
            throw new ItemNotFoundException("We don't have that item");

        }
    }


}
