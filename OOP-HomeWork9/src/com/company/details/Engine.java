package com.company.details;

public class Engine implements IEngine {
    private int power;
    private String producer;

    public Engine(int power, String producer) {
        this.power = power;
        this.producer = producer;
    }

    public String getProducer() {
        return producer;
    }

    public int getPower(){
        return power;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", producer='" + producer + '\'' +
                '}';
    }
}
