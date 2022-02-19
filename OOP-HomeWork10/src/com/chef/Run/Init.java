package com.chef.Run;

import com.chef.characteristics.VegetableCalory;
import com.chef.characteristics.VegetableColor;
import com.chef.characteristics.VegetableName;
import com.chef.tools.SaladMaker;
import com.chef.tools.SaladPicker;
import com.chef.tools.VegetableCaloryComparator;
import com.chef.vegetables.type.*;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Init {
    public static void main(String[] args) {
        //Создаем объект класса VegetableCaloryComparator
        VegetableCaloryComparator  vegetableCaloryComparator = new VegetableCaloryComparator();

        //Создаем обьект класса SaladPicker, чтобы в дальнейшем использовать его метод getVegetableByBigCalory
        SaladPicker saladPicker = new SaladPicker();

        //Создаем объекты для каждого из типа овощей
        Vegetable tomato = new Tomato(VegetableName.TOMATO, VegetableColor.RED, VegetableCalory.TOMATOCALORY);
        Vegetable cucumber = new Cucumber(VegetableName.CUCUMBER, VegetableColor.GREEN, VegetableCalory.CUCUMBERCALORY);
        Vegetable salad = new Salad(VegetableName.SALAD, VegetableColor.GREEN, VegetableCalory.SALADCALORY);
        Vegetable potato = new Potato(VegetableName.POTATO,VegetableColor.BROWN,VegetableCalory.CARROTCALORY);
        Vegetable carrot = new Carrot(VegetableName.CARROT, VegetableColor.ORANGE,VegetableCalory.CARROTCALORY);

        //В процессе создания салата нам потребуется массив с овощами для него, поэтому инициализируем необходимые массивы
        Vegetable [] arr = {tomato,cucumber,carrot,salad,potato};
        Vegetable [] arr2 = {tomato,tomato,cucumber,cucumber,salad,salad,};

        //Создаем салат Veseniy
        System.out.println("SALAD - Veseniy");
        SaladMaker salad1 = new SaladMaker(arr);
        salad1.salad(arr);
        //Подсчитываем общее количество калорий в созданном салате Veseniy
        System.out.println("Calories in this salad is " + salad1.getCalories(arr));
        //Выводим подробный состав салата Veseniy
        System.out.println(salad1.toString());

        System.out.println("==============================================");

        //Создаем салат Letnyi
        System.out.println("SALAD - Letnyi");
        SaladMaker salad2 = new SaladMaker(arr2);
        salad2.salad(arr2);
        //Подсчитываем общее количество калорий в созданном салате Letnyi
        System.out.println("Calories in this salad is " + salad2.getCalories(arr2));
        //Выводим подробный состав салата Letnyi
        System.out.println(salad2.toString());

        System.out.println("==============================================");

        //Смотрю как отработали перопределенные методы equals и hashCode
        System.out.println("Invoke Equal method for 2 objects");
        System.out.println(salad1.equals(salad2));
        System.out.println(salad2.equals(salad2));
        System.out.println(salad1.hashCode());
        System.out.println(salad2.hashCode());

        System.out.println("==============================================");

        System.out.println("TESTING COMPARABLE INTERFACE");
        Set<Vegetable> vegetableSet = new TreeSet<>();
        vegetableSet.add(carrot);
        vegetableSet.add(cucumber);
        vegetableSet.add(tomato);
        vegetableSet.add(potato);
        vegetableSet.add(salad);
        vegetableSet.forEach(System.out::println);

        System.out.println("==============================================");

        System.out.println("Sort vegetables by the calori use COMPARATOR interface");
        Vegetable[]vegetables = new Vegetable[]{tomato,cucumber,carrot,salad,potato};
        Arrays.sort(vegetables, vegetableCaloryComparator);
        for (Vegetable o: vegetables) {
            System.out.println(o.getName());
        }

        System.out.println("==============================================");

        System.out.println("Pick vegetables by specific range of calory: ");
        Vegetable[] bigCalory = saladPicker.getVegetableByBigCalory(new Vegetable[]{tomato,cucumber,carrot,salad,potato});
        for (Vegetable v: bigCalory) {
            System.out.println(v.getName());
        }
    }
}
