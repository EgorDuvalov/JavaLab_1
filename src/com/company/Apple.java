package com.company;

import java.util.Objects;

public class Apple extends Food {
    private String size;

    public Apple(String size) {
// Вызвать конструктор предка, передав ему имя класса
        super("Яблоко");
// Инициализировать размер яблока
        this.size = size;
    }

    // Переопределить способ употребления яблока
    public void consume() {
        System.out.println(this + " съедено");
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