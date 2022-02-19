package com.chef.characteristics;

public enum VegetableCalory {
    TOMATOCALORY(50),
    SALADCALORY (5),
    POTATOCALORY (100),
    CUCUMBERCALORY (35),
    CARROTCALORY (40);

    private int calory;

    public int getCalory(){
        return calory;
    }

    VegetableCalory(int colory) {
        this.calory = colory;
    }
}
