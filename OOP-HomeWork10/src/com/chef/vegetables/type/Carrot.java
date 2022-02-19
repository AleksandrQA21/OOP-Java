package com.chef.vegetables.type;

import com.chef.characteristics.VegetableCalory;
import com.chef.characteristics.VegetableColor;
import com.chef.characteristics.VegetableName;

public class Carrot extends Vegetable{
    public Carrot(VegetableName carrot, VegetableColor orange, VegetableCalory carrotcalory) {
        super(VegetableName.CARROT,VegetableColor.ORANGE, VegetableCalory.CARROTCALORY.getCalory());
    }

    @Override
    public int compareTo(Vegetable o) {
        if (VegetableCalory.CARROTCALORY.getCalory() == o.getCalory()){
            return 0;
        }
        else if (VegetableCalory.CARROTCALORY.getCalory() > o.getCalory()){
            return 1;
        }
        else {
            return -1;
        }
    }
}
