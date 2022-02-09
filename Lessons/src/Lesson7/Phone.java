package Lesson7;

import java.util.Arrays;

public class Phone {

    private String model;
    private String number;
    private double weight;

    public Phone(){

    }
    public Phone(String model){
        this.model=model;
    }

    public Phone(String model, String number){
        this.model = model;
        this.number = number;
    }

    public Phone(String model, String number, double weight){
        this.model = model;
        this.number = number;
        this.weight = weight;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void receiveCall(String name) {
        System.out.println("Hey it's " + name + "  is calling");
    }

    public void receiveCall(String name, String phoneNumber) {
        System.out.println("Hey it's " + name + "  is calling " + phoneNumber);
    }

    public void sendMessage(String ... phoneNumber) {
        System.out.println(Arrays.toString(phoneNumber));
    }
}
