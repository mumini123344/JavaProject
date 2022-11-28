package transportation;

public  class Passenger extends Person{

    public Passenger(long id, String firstName, String lastName, int age, String gender) {
        super(id, firstName, lastName, age, gender);

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



