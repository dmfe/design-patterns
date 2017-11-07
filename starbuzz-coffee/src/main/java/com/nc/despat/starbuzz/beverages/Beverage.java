package com.nc.despat.starbuzz.beverages;

public abstract class Beverage {
    String description;

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}