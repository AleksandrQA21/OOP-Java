package com.chef.vegetables.type;

import com.chef.characteristics.VegetableCalory;
import com.chef.characteristics.VegetableColor;
import com.chef.characteristics.VegetableName;

public class Salad extends Vegetable{
    public Salad(VegetableName salad, VegetableColor green, VegetableCalory saladcalory) {
        super(VegetableName.SALAD,VegetableColor.GREEN, VegetableCalory.SALADCALORY.getCalory());
    }

    @Override
    public int compareTo(Vegetable o) {
        if (VegetableCalory.SALADCALORY.getCalory() == o.getCalory()){
            return 0;
        }
        else if (VegetableCalory.SALADCALORY.getCalory() > o.getCalory()){
            return 1;
        }
        else {
            return -1;
        }
    }
}
