package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends Car {
    private int loadCapacity;

    public Lorry(String model, String classAuto, int weight, Driver driver, Engine motor, int loadCapacity) {
        super(model, classAuto, weight, driver, motor);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void start() {
        System.out.println("Грузовик стартует");
    }

    @Override
    public void stop() {
        System.out.println("Грузовик останавливается");
    }

    @Override
    public void turnRight() {
        System.out.println("Грузовик поворачивает направо");
    }

    @Override
    public void turnLeft() {
        System.out.println("Грузовик поворачивает налево");
    }
}
