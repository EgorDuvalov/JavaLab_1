package com.company;

import java.util.Objects;

public class Apple extends Food implements Consumable, Nutritious {
    private String size;

    public Apple(String size) {
        super("Яблоко");
        this.size = size;
    }

    // Переопределить способ употребления яблока
    public void consume() {
        System.out.println(this.name + " of " + this.size + " size is consumed");
    }

    public int calculate_Calories() {
        if (size.equals("Big")) return 250;
        if (size.equals("Medium")) return 200;
        if (size.equals("Small")) return 150;
        System.out.println("Apple size is inappropriate");
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Apple apple = (Apple) o;
        return size.equals(apple.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size);
    }

    @Override
    public String toString() {
        return "Apple{" +
                "size='" + size + '\'' +
                '}';
    }

    // Селектор для доступа к полю данных РАЗМЕР
    public String getSize() {
        return size;
    }

    // Модификатор для изменения поля данных РАЗМЕР
    public void setSize(String size) {
        this.size = size;
    }
}