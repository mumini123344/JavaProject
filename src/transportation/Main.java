package transportation;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Sedan", "Rb25", "blue", "Nissan GT-R r35", "4",
                "gas", 270, 4,
                new Driver("noe", "Vu", 30, "Male"));

        Car car2 = new Car("Sedan", "2Jz", "Black", "Supra", "2", "Gas",
                250, 4);


        Driver driver1 = new Driver ("John", "Senna", 35, "Male");
        Driver driver2 = new Driver(1241215155L, "Roy", "Charles", 20,"Male");



        System.out.println(car1.equals(car2));
        System.out.println(driver1.equals(driver2));



    }
}