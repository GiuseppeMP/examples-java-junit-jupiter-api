package model;

public class Car {

    public Car(String model, String year) {
        this.model = model;
        this.year = year;
    }

    private String model;

    private String year;

    public String getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }
}
