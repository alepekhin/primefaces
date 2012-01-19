package org.primefaces.examples.domain;

public class Car {

    private String model, manufacturer, color;
    private Integer year;
    
    public Car() {
        
    }
    
    public Car(String model, Integer year, String manufacturer, String color) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.year = year;
        this.color = color;
    }


    public String getModel() {
        return model;
    }


    public void setModel(String model) {
        this.model = model;
    }




    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getManufacturer() {
        return manufacturer;
    }


    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }


    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }
    
    
    
    
}
