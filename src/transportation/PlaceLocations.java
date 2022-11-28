package transportation;

public class PlaceLocations {
    private String placeA;
    private String placeB;

    public PlaceLocations(String placeA, String placeB) {
        this.placeA = placeA;
        this.placeB = placeB;
    }

    public PlaceLocations() {

    }

    public String getPlaceA(){
        return placeA;
    }
    public void setPlaceA(String placeA){
        this.placeA = placeA;
    }
    public String getPlaceB(){
        return placeB;
    }
    public void setPlaceB(String placeA){
        this.placeB = placeB;

    }
}
