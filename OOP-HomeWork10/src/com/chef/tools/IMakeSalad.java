package com.chef.tools;

import com.chef.vegetables.type.Vegetable;

public interface IMakeSalad {
    //Метод для "создания" салата
    public void salad(Vegetable[]vegetables);
    //Метод для подсчета общего количества калорий в салате
    public int getCalories(Vegetable[]vegetables);
}
