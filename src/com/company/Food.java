package com.company;

import com.company.Consumable;
import java.util.Objects;

public abstract class Food implements Consumable {

    String name = null;

    public Food(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Food)) return false;
        if (name == null || ((Food) o).name == null) return false;
        return name.equals(((Food) o).name);
    }

    @Override
    public String toString() {
        return name;
    }
}