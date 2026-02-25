package ru;

import ru.products.Pizza;
import ru.shops.CheesePizzaShop;
import ru.shops.MeatPizzaShop;
import ru.shops.PizzaShop;
import ru.shops.SeafoodPizzaShop;
import ru.shops.VeggiePizzaShop;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Добро пожаловать в сеть пиццерий===\n");

        PizzaShop meatShop = new MeatPizzaShop();
        PizzaShop veggieShop = new VeggiePizzaShop();
        PizzaShop cheeseShop = new CheesePizzaShop();
        PizzaShop seafoodShop = new SeafoodPizzaShop();

        System.out.println("\n>>> Идем в мясную пиццерию");
        Pizza meatPizza = meatShop.orderPizza();

        System.out.println("\n>>> Идем в овощную пиццерию:");
        Pizza veggiePizza = veggieShop.orderPizza();

        System.out.println("\n>>> Идем в сырную пиццерию:");
        Pizza cheesePizza = cheeseShop.orderPizza();

        seafoodShop.orderPizza();

        System.out.println("\n=== Обрабатываем массовые заказы ===");
        PizzaShop[] shops = {
                new MeatPizzaShop(),
                new VeggiePizzaShop(),
                new CheesePizzaShop(),
                new SeafoodPizzaShop()
        };
        for (PizzaShop shop : shops) {
            // Один и тот же код работает для всех типов пиццерий!
//            Pizza pizza = shop.orderPizza();
            shop.orderPizza();
            System.out.println("Заказ выполнен!\n");
        }

    }
}
