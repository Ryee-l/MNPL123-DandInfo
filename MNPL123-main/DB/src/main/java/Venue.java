package DB.src.main.java;

public class Venue {
    private String name;
    private String openingTime;
    public Venue(String name,String openingTime){
        this.name=name;
        this.openingTime=openingTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOpeningTime(String openingTime) {
        this.openingTime = openingTime;
    }

    public String getOpeningTime() {
        return openingTime;
    }
}
