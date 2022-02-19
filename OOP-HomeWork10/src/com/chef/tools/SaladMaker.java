package com.chef.tools;

import com.chef.characteristics.VegetableCalory;
import com.chef.vegetables.type.Vegetable;

import java.util.Arrays;

public class SaladMaker implements IMakeSalad{

    private Vegetable [] vegetables;

    public SaladMaker(Vegetable[] vegetables) {
        this.vegetables = vegetables;
    }

    //Реализуем метод, который "создает" салат. В моем пониманиии, под созданием салата имеется ввиду создание массива
    @Override
    public void salad(Vegetable[] vegetables) {
        System.out.println("Salad is ready. It contain: ");
        for (Vegetable v: vegetables) {
            System.out.print(v.getName() + ", ");
        }
        System.out.println();
    }
    // Реализуем метод подсчета общей калорийности салата
    @Override
    public int getCalories(Vegetable[] vegetables) {
        int result = 0;
        for (int i = 0; i < vegetables.length; i++) {
            result += vegetables[i].getCalory();
        }
        return result;
    }

    @Override
    public String toString() {
        return "Salad consist from the next " +
                "vegetables: " + Arrays.toString(vegetables) +
                '}';
    }
}
