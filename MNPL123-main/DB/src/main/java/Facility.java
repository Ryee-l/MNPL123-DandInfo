package DB.src.main.java;

public class Facility {
    private int number;
    private int quantity;
    private String status;
    private double cost;
    public Facility(int number,int quantity,String status){
        this.number=number;
        this.quantity=quantity;
        this.status=status;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
