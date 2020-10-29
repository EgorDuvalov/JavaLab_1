package com.company;

import java.util.Objects;

public class Cake extends Food implements Consumable, Nutritious {
    private String icing;

    public Cake(String icing) {
        super("Cake");
        this.icing = icing;
    }

    public String getIcing() {
        return icing;
    }

    public void setIcing(String icing) {
        this.icing = icing;
    }

    public void consume() {
        System.out.println(icing+ this +" is consumed");
    }

    public int calculate_Calories(){
        if (icing.equals("Chocolate")) return 550;
        else if (icing.equals("Cream")) return 450;
        else if (icing.equals("Caramel")) return 350;
        System.out.println("Icing is inappropriate");
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Cake cake = (Cake) obj;
        return Objects.equals(icing, cake.icing);
    }

    @Override
    public int hashCode() {
        return Objects.hash(icing);
    }
}
