package transportation;

public class Driver extends Person {
    public Driver(long id, String firstName, String lastName, int age, String gender) {
        super(id, firstName, lastName, age, gender);

    }
//driver1 constructor
    public Driver(String firstName, String lastName, int age, String gender) {

    }

    public Driver() {

    }


    @Override
    public long getId() {
        return super.getId();
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


