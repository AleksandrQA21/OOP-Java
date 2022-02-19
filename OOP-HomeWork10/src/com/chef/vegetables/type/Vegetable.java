package com.chef.vegetables.type;

import com.chef.characteristics.VegetableCalory;
import com.chef.characteristics.VegetableColor;
import com.chef.characteristics.VegetableName;
import com.chef.tools.IMakeSalad;

import java.util.Objects;

public abstract class Vegetable implements Comparable<Vegetable> {
    private VegetableName name;
    private VegetableColor color;
    private int  calory;

    public Vegetable(VegetableName name, VegetableColor color, int calory ) {
        this.name = name;
        this.color = color;
        this.calory = calory;
    }

    public VegetableName getName() {
        return name;
    }

    public VegetableColor getColor() {
        return color;
    }

    public int getCalory() {
        return calory;
    }

    @Override
    public String toString() {
        return "Vegetable{" +
                "name=" + name +
                ", color=" + color +
                ", calory=" + calory +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vegetable vegetable = (Vegetable) o;
        return calory == vegetable.calory && name == vegetable.name && color == vegetable.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, calory);
    }
}
