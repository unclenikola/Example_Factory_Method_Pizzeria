package ru.shops;

import ru.products.Pizza;
import ru.products.SeafoodPizza;

public class SeafoodPizzaShop extends PizzaShop {

    @Override
    protected Pizza createPizza() {
        System.out.println("Морская пийццерия: готовим пиццу с морепродуктами");
        return new SeafoodPizza();
    }
}
