package com.company.run;

import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehicles.Car;
import com.company.vehicles.Lorry;
import com.company.vehicles.SportCar;

import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        Car track = new Lorry("Камаз", "Грузовик",10000, new Driver("Максим", "Быстрый",45, 12), new Engine(10,"Богдан"), 150000);
        System.out.println(track.toString());
        track.start();
        track.stop();
        track.turnRight();
        track.turnLeft();

        System.out.println("========================================================================================================================================================");

        Car ferrary = new SportCar("LaFerrary", "Sport Car", 1200, new Driver("Иван", "Ибрагимович", 22,7),new Engine(5,"Ferrary"),330);
        System.out.println(ferrary.toString());
        ferrary.start();
        ferrary.stop();
        ferrary.turnLeft();
        ferrary.turnRight();
        System.out.println("========================================================================================================================================================");


        ArrayList<Car> car = new ArrayList<>();
        car.add(track);
        car.add(ferrary);
        for (Car a: car) {
            a.start();
        }
    }
}
