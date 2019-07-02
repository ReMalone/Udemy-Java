package app;

import java.awt.Dimension;

public class Case{
    private String model;
    private String manufacturers;
    private String powerSupply;
    private Dimensions dimensions;

    public Case(String model, String manufacturers, String powerSupply, Dimensions dimensions){
        this.model = model;
        this.manufacturers = manufacturers;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }

    public void pressPowerButton(){
        System.out.println("Power button pressed");
    }

    public String getModel(){
        return model;
    }

    public String getManufacturers(){
        return manufacturers;
    }

    public String getPowerSupply(){
        return powerSupply;
    }

    public Dimensions getDimensions(){
        return dimensions;
    }


}