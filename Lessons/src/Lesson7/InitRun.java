package Lesson7;

import Lesson7.Phone;

public class InitRun {
    public static void main(String[] args) {
        Phone xiaomi = new Phone();
        Phone samsung = new Phone("Galaxy");
        Phone iPhone = new Phone("iPhone", "+38 (099) 234 67 56");
        Phone oppo = new Phone("iPhone", "+38 (063) 111 00 00", 135.8);

        System.out.println(oppo.getNumber());
        oppo.setNumber("+38 (050) 111 11 11");
        System.out.println(oppo.getNumber());
    }
}
