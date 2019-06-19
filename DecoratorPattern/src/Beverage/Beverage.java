package Beverage;

public abstract class Beverage {
    String description = "Unknown Beverage.Beverage";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
