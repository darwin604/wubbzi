
public class Fruit {

    // Can't access from outside of class
    private String type;
    private String color;
    private Boolean seedless;

    // Accessible from outside of class - use these to set Fruit's variables
    public void setColor(String color) {
        this.color = color;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSeedless(Boolean seedless) {
        this.seedless = seedless;
    }

    // Accessible from outside of class - use these to set Fruit's variables
    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    public Boolean getSeedless() {
        return seedless;
    }
}