package ru.products;

public class MeatPizza extends Pizza {
    public MeatPizza() {
        this.name = "Мясная пица";
        this.dough = "Тонкое тесто";
        this.sauce = "Томатный соус";
    }

    @Override
    public void cut() {
        System.out.println("Нарезаем на 6 квадратных кусочков");
    }
}