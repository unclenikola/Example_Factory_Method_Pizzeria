package ru.products;

public abstract class Pizza {
    protected String name;
    protected String dough;
    protected String sauce;

    public void prepare() {
        System.out.println("Готовим " + name);
        System.out.println("Замешиваем тесто " + dough);
        System.out.println("Добавляем соус " + sauce);
    }
    public void bake() {
        System.out.println("Выпекаем  двадцать минут при температуре 200°C");
    }
    public void cut() {
        System.out.println("Режем на 8 кусуков");
    }
    public void box() {
        System.out.println("Упаковываем в коробку");
    }
    public String getName() {
        return name;
    }
}
