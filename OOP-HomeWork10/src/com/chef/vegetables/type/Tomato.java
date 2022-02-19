package com.chef.vegetables.type;

import com.chef.characteristics.VegetableCalory;
import com.chef.characteristics.VegetableColor;
import com.chef.characteristics.VegetableName;

public class Tomato extends Vegetable {
    public Tomato(VegetableName tomato, VegetableColor red, VegetableCalory tomatocalory) {
        super(VegetableName.TOMATO, VegetableColor.RED, VegetableCalory.TOMATOCALORY.getCalory());
    }

    @Override
    public int compareTo(Vegetable o) {
        if (VegetableCalory.TOMATOCALORY.getCalory() == o.getCalory()){
            return 0;
        }
        else if (VegetableCalory.TOMATOCALORY.getCalory() > o.getCalory()){
            return 1;
        }
        else {
            return -1;
        }
    }
}
