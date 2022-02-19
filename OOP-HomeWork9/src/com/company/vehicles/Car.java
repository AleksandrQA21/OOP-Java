package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car implements ICar {
    private String model;
    private String classAuto;
    private int weight;
    private Driver driver;
    private Engine motor;

    public Car(String model, String classAuto, int weight, Driver driver, Engine motor) {
        this.model = model;
        this.classAuto = classAuto;
        this.weight = weight;
        this.driver = driver;
        this.motor = motor;
    }


    public void start (){
        System.out.println("Поехали");
    }

    public void stop(){
        System.out.println("Останавливаемся");
    }

    public void turnRight(){
        System.out.println("Поворот направо");
    }

    public void turnLeft(){
        System.out.println("Поворт налево");
    }

    public String getModel() {
        return model;
    }

    public String getClassAuto() {
        return classAuto;
    }

    public int getWeight() {
        return weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public Engine getMotor() {
        return motor;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model = '" + model + '\'' +
                ", classAuto = '" + classAuto + '\'' +
                ", weight = " + weight +
                ", driver = " + driver +
                ", motor = " + motor +
                '}';
    }
}
