package DB.src.main.java;

public class Facility {
    private int number;
    private boolean[] time;
    private String name;
    private double fee;
    public Facility(int number,boolean[] time,String name,double fee){
        this.number=number;
        this.time=time;
        this.name=name;
        this.fee=fee;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean[] getTime() {
        return time;
    }

    /* index=0, 10:00-11:00
     * index=0, 11:00-12:00
     * index=2, 12:00-13:00
     * index=3, 13:00-14:00
     * index=4, 14:00-15:00
     * index=5, 15:00-16:00
     * index=6, 16:00-17:00
     * index=7, 17:00-18:00
     * index=8, 18:00-19:00
     * index=9, 19:00-20:00
     * index=10, 20:00-21:00
     * index=11, 21:00-22:00
     * */
    public void setTime(int index, boolean available) {
        if (index >= 0 && index < time.length) {
            time[index] = available;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
}
