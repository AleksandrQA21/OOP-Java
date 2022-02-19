package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends Car{
    private int maxSpeed;

    public SportCar(String model, String classAuto, int weight, Driver driver, Engine motor, int maxSpeed) {
        super(model, classAuto, weight, driver, motor);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void start() {
        System.out.println("Спорткар стартует");
    }

    @Override
    public void stop() {
        System.out.println("Спорткар останавливается");
    }

    @Override
    public void turnRight() {
        System.out.println("Спорткар поворачивает направо");
    }

    @Override
    public void turnLeft() {
        System.out.println("Спорткар поворачивает налево");
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "model ='" + super.getModel() + '\'' +
                ", classAuto ='" + super.getClassAuto() + '\'' +
                ", weight =" + super.getWeight() +
                ", driver =" + super.getDriver() +
                ", motor =" + super.getMotor() +
                "maxSpeed =" + maxSpeed +
                '}';
    }
}
