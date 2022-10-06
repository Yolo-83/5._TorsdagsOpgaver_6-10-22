import com.sun.source.tree.ReturnTree;

public class Car {

    private String make;
    private String model;
    private int year;
    private String bodyStyle;
    private String driver;


    private Car(String make, String model, int year, String bodyStyle, String driver) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.bodyStyle = bodyStyle;
    }


    private String getDriver() {
        return this.driver;
    }
    private void setDriver(String name) {
        this.driver = name;
        }


        @Override
        public String toString() {
        return "Make: " + make +
               "Model: " + model + "(" + year + ")" +
               "Body Style: " + bodyStyle;
    }


}
