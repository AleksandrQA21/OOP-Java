package aircompany.aircrafts;

import java.util.Objects;

public abstract class Aircraft implements Comparable<Aircraft>{
    private String model;
    private  int capacity;
    private  int load;
    private  int distance;
    private  int fuel;

    public Aircraft(String model, int capacity, int load, int distance, int fuel) {
        this.model = model;
        this.capacity = capacity;
        this.load = load;
        this.distance = distance;
        this.fuel = fuel;
    }

    public String getModel() {
        return model;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getLoad() {
        return load;
    }

    public int getDisctance() {
        return distance;
    }

    public int getFuel() {
        return fuel;
    }

    public abstract Aircraft [] getAircraftByFuel(Aircraft [] aircrafts);

    @Override
    public String toString() {
        return "Aircraft{" +
                "model='" + model + '\'' +
                ", capacity=" + capacity +
                ", load=" + load +
                ", disctance=" + distance +
                ", fuel=" + fuel +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aircraft aircraft = (Aircraft) o;
        return capacity == aircraft.capacity && load == aircraft.load && distance == aircraft.distance && fuel == aircraft.fuel && model.equals(aircraft.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, capacity, load, distance, fuel);
    }

}
