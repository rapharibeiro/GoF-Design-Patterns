package com.patterns.observer.data;

public class Inventory {

    private String productName;
    private Float productValue;
    private Integer productUnits;
    private String owner;

    public Inventory(String productName, Float productValue, Integer productUnits) {
        this.productName = productName;
        this.productValue = productValue;
        this.productUnits = productUnits;
        this.owner = "Programmer";
    }

    public String productName() {
        return productName;
    }

    public Float productValue() {
        return productValue;
    }

    public Integer productUnits() {
        return productUnits;
    }

    public String owner() {
        return owner;
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "productName='" + productName + '\'' +
                ", productValue=" + productValue +
                ", productUnits=" + productUnits +
                ", owner='" + owner + '\'' +
                '}';
    }
}
