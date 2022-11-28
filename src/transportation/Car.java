package transportation;

public class Car extends Vehicle{
    public Car(String typeOfVihecle, String engine, String color, String model, String capacity,
               String fuelType, double maxSpeed, int wheels, Driver driver) {
        super(typeOfVihecle, engine, color, model, capacity, fuelType, maxSpeed, wheels, driver);

    }

    public Car(String sedan, String engine, String black, String supra, String capacity, String gas, int maxSpeed, int wheels) {

    }

    @Override
    public void drive() {
        String startEngine;
        String stopEngine;

    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    //Overload
    public void drive(Speed speed){

    }
}

