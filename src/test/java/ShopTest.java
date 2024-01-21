import org.assertj.core.api.Assertions;
import org.fasttrackit.generics.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ShopTest {
    @Test
    void clothesClass() {
        Clothes clothes = new Clothes("Dress", 25, Category.NEW);
    }

    @Test
    void electronicsClass() {
        Electronics electronics = new Electronics("TV", 25, Category.NEW);
    }

    @Test
    void fruitClass() {
        Fruits fruits = new Fruits("Apple", 5, Category.ON_SALE);
    }

    @Test
    void classShop() {
        Shop<Clothes> clothesShop = new Shop<>(new ArrayList<>());
        clothesShop.addItem(new Clothes("Dress", 15, Category.ON_SALE));
    }

    @Test
    void methodFindByCategory(){
        Shop<Clothes> clothesShop = new Shop<>(new ArrayList<>());
        clothesShop.addItem(new Clothes("Dress", 15, Category.ON_SALE));

        List<Clothes> clothes = new ArrayList<>();
        clothes.add(new Clothes("Dress", 15, Category.ON_SALE));

        Assertions.assertThat(clothesShop.findByCategory(Category.ON_SALE)).isEqualTo(clothes);
    }

    @Test
    void methodFindWithLowerPrice(){
        Shop<Clothes> clothesShop = new Shop<>(new ArrayList<>());
        clothesShop.addItem(new Clothes("Dress", 25, Category.ON_SALE));

        List<Clothes> clothes = new ArrayList<>();
        clothes.add(new Clothes("Dress", 25, Category.ON_SALE));

        Assertions.assertThat(clothesShop.findWithLowerPrice(30)).isEqualTo(clothes);

    }

    @Test
    void methodFindWithLowerPriceEmpty(){
        Shop<Clothes> clothesShop = new Shop<>(new ArrayList<>());
        clothesShop.addItem(new Clothes("Dress", 35, Category.ON_SALE));

        List<Clothes> clothes = new ArrayList<>();
        clothes.add(new Clothes("Dress", 35, Category.ON_SALE));

        Assertions.assertThat(clothesShop.findWithLowerPrice(30)).isEmpty();

    }

    @Test
    void methodFindByName() throws ItemNotFoundException {
        Shop<Clothes> clothesShop = new Shop<>(new ArrayList<>());
        clothesShop.addItem(new Clothes("Dress", 25, Category.ON_SALE));

        List<Clothes> clothes = new ArrayList<>();
        clothes.add(new Clothes("Dress", 25, Category.ON_SALE));

        Assertions.assertThat(clothesShop.findByName("Dress")).isEqualTo(clothes);

    }



}
