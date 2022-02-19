package aircompany.tools;

import aircompany.aircrafts.Aircraft;

import java.util.ArrayList;
import java.util.List;

public class AircraftCompany {
    private Aircraft[] aircrafts;

    public AircraftCompany(Aircraft[] aircrafts) {
        this.aircrafts = aircrafts;
    }

    //Реализуем метод, который "создает" авиакомпанию.
    public void setAircraftCompany(Aircraft[]aircrafts) {
        System.out.println("Aircraft company is ready. It contain: ");
        for (Aircraft a : aircrafts) {
            System.out.print(a.getModel() + ", ");
        }
        System.out.println("");
    }

    //Реализуем метод, который подсчитывает общую вместимость всех самолетов авиакомпании.
    public int countCapacity(Aircraft[] aircrafts) {
        int result = 0;
        for (int i = 0; i < aircrafts.length; i++) {
            result += aircrafts[i].getCapacity();
        }
        return result;
    }

    //Реализуем метод, который подсчитывает общую грузоподьемность всех самолетов авиакомпании.
    public int countLoad(Aircraft[]aircrafts) {
        int res = 0;
        for (int i = 0; i < aircrafts.length; i++) {
            res += aircrafts[i].getLoad();
        }
        return res;
    }

    public Aircraft[] getAircraftByFuel(Aircraft[]aircrafts) {
        Aircraft[] result = new Aircraft[aircrafts.length];
        List<Aircraft> list = new ArrayList<>();
        for (int i = 0; i < aircrafts.length; i++) {
            if(aircrafts[i].getFuel() > 200000){
                result[i] = aircrafts[i];
            }
        }

        for (Aircraft aircraft:result) {
            if(aircraft != null){
                list.add(aircraft);
            }
        }
        return list.toArray(new Aircraft[0]);
    }
}
