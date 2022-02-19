package com.chef.tools;

import com.chef.vegetables.type.Vegetable;

import java.util.ArrayList;
import java.util.List;

public class SaladPicker {
    public Vegetable[] getVegetableByBigCalory (Vegetable[]vegetables){

        Vegetable[] result = new Vegetable[vegetables.length];
        List<Vegetable> list = new ArrayList<>();
        for (int i = 0; i < vegetables.length; i++) {
            if(vegetables[i].getCalory() > 40){
                result[i] = vegetables[i];
            }
        }

        for (Vegetable vegetable:result) {
            if(vegetable != null){
                list.add(vegetable);
            }
        }
        return list.toArray(new Vegetable[0]);
    }
}

