package ru.products;

public class VeggiePizza extends Pizza {
    public VeggiePizza() {
        this.name = "Овощная пицца";
        this.dough = "Пышное тесто";
        this.sauce = "Сливочный соус";
    }
    @Override
    public void prepare() {
        super.prepare();
        System.out.println("Добавляем дополнительный слой сыра");
    }
}
