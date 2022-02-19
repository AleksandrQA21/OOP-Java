package com.chef.vegetables.type;

import com.chef.characteristics.VegetableCalory;
import com.chef.characteristics.VegetableColor;
import com.chef.characteristics.VegetableName;

public class Cucumber extends Vegetable{
    public Cucumber(VegetableName cucumber, VegetableColor green, VegetableCalory cucumbercalory) {
        super(VegetableName.CUCUMBER,VegetableColor.GREEN, VegetableCalory.CUCUMBERCALORY.getCalory());
    }

    @Override
    public int compareTo(Vegetable o) {
        if (VegetableCalory.CUCUMBERCALORY.getCalory() == o.getCalory()){
            return 0;
        }
        else if (VegetableCalory.CUCUMBERCALORY.getCalory() > o.getCalory()){
            return 1;
        }
        else {
            return -1;
        }
    }
}
