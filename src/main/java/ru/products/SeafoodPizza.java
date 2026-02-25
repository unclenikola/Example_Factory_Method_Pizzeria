package ru.products;

public class SeafoodPizza extends Pizza {
    public SeafoodPizza() {
        this.name = "Пицца с морепродуктами";
        this.dough = "Тонкое тесто";
        this.sauce = "Белый соус";
    }

    @Override
    public void prepare() {
        super.prepare();
        System.out.println("Добавляем креветки и мидии");
    }
}
