package ru.shops;

import ru.products.Pizza;

public abstract class PizzaShop {

    protected abstract Pizza createPizza();

    public Pizza orderPizza() {
        System.out.println("\n=== Новый заказ===");
        Pizza pizza = createPizza();

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        System.out.println("Ваша пицца готова: " + pizza.getName());

        return pizza;
    }

    public Pizza orderPizzaDelivery(String address) {
        Pizza pizza = createPizza();
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        System.out.println("Доставка " + pizza.getName() + " по адреce :" + address);
        return pizza;
    }
}