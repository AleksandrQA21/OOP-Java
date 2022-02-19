package aircompany.aircrafts;

import java.util.ArrayList;
import java.util.List;

public class Boeing747 extends Aircraft{
    public Boeing747(String model, int capacity, int load, int distance, int fuel) {
        super(model, capacity, load, distance, fuel);
    }

    @Override
    public Aircraft[] getAircraftByFuel(Aircraft[] aircrafts) {
        Aircraft[] result = new Aircraft[aircrafts.length];
        List<Aircraft> list = new ArrayList<>();
        for (int i = 0; i < aircrafts.length; i++) {
            if(aircrafts[i].getFuel() > 40){
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


    @Override
    public int compareTo(Aircraft a) {
        if (this.getDisctance() == a.getDisctance()) {
            return 0;
        }
        else  if (this.getDisctance() > a.getDisctance()){
            return  1;
        }
        else {
            return -1;
        }
    }
}
