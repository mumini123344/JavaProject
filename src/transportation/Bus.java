package transportation;

public class Bus extends Vehicle{
    public Bus(String typeOfVihecle, String engine, String color, String model, String capacity, String fuelType,
               double speed, int wheels, Driver driver) {
        super(typeOfVihecle, engine, color, model, capacity, fuelType, speed, wheels, driver);
    }

    public Bus() {

    }

    @Override
    public void drive() {


    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }


}
