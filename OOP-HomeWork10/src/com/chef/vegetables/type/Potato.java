package com.chef.vegetables.type;

import com.chef.characteristics.VegetableCalory;
import com.chef.characteristics.VegetableColor;
import com.chef.characteristics.VegetableName;

public class Potato extends Vegetable{
    public Potato(VegetableName potato, VegetableColor brown, VegetableCalory carrotcalory) {
        super(VegetableName.POTATO,VegetableColor.BROWN, VegetableCalory.POTATOCALORY.getCalory());
    }

    @Override
    public int compareTo(Vegetable o) {
        if (VegetableCalory.POTATOCALORY.getCalory() == o.getCalory()){
            return 0;
        }
        else if (VegetableCalory.POTATOCALORY.getCalory() > o.getCalory()){
            return 1;
        }
        else {
            return -1;
        }
    }
}
