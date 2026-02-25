package ru.shops;

import ru.products.CheesePizza;
import ru.products.Pizza;

public class CheesePizzaShop extends PizzaShop {
    @Override
    protected Pizza createPizza() {
        System.out.println("Сырная пицерия: готовим сырную пиццу");
        return new CheesePizza();
    }
}
