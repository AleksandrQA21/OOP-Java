package com.chef.tools;

import com.chef.vegetables.type.Vegetable;

import java.util.Comparator;

public class VegetableCaloryComparator implements Comparator<Vegetable> {

    //Метод для сравнения по количеству калорий в овоще
    @Override
    public int compare(Vegetable o1, Vegetable o2) {
        return o2.getCalory() - o1.getCalory();
    }
}
