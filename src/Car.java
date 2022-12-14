public class Car {

    //this - reference variable that refers to the current object
    //       of a method or a constructor. Remove the confusion
    //       between class attributes and parameters that have same names.

    private int year;
    private String make;
    private String model;


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
