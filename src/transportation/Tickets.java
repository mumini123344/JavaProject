package transportation;

public class Tickets {
    private int price;
    private int amount;

    public Tickets(int price, int amount) {
        this.price = price;
        this.amount = amount;
    }

    public Tickets() {

    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
