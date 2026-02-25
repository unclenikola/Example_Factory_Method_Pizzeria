package ru.shops;

import ru.products.MeatPizza;
import ru.products.Pizza;

public class MeatPizzaShop extends PizzaShop {

    @Override
    protected Pizza createPizza() {
        System.out.println("Мясная пиццерия: готовим мясную пиццу");
        return new MeatPizza();
    }

    public void sellSoda() {
        System.out.println("Продаем газировку к мясной пицце");
    }
}
