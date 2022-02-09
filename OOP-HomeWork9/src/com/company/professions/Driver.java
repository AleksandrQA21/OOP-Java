package com.company.professions;

public class Driver extends Person {
    private int expirience;

    public Driver(String firstName, String lastName, int age, int expirience) {
        super(firstName, lastName, age);
        this.expirience = expirience;
    }



    @Override
    public String toString() {
        return "Driver{" +
                "firstName = '" + super.getFirstName() + '\'' +
                ", lastName = '" + super.getLastName() + '\'' +
                ", age = " + super.getAge() +
                ", expirience ="  + expirience +
                '}';
    }
}
