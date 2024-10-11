package web.model;

public class Car {
    private String model;
    private String zavod;
    private int year;

    public Car() {}

    public Car(String model, String zavod, int year) {
        this.model = model;
        this.zavod = zavod;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getZavod() {
        return zavod;
    }

    public void setZavod(String zavod) {
        this.zavod = zavod;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

