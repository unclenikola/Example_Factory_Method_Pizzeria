package ru.shops;


import ru.products.Pizza;
import ru.products.VeggiePizza;

public class VeggiePizzaShop extends PizzaShop {

    @Override
    protected Pizza createPizza() {
        System.out.println("Овощная пиццерияЖ готовим овощную пиццу");
        return new VeggiePizza();
    }
}
