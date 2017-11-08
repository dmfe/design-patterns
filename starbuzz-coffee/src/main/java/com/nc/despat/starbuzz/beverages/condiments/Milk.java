package com.nc.despat.starbuzz.beverages.condiments;

import com.nc.despat.starbuzz.beverages.Beverage;

public class Milk extends CondimentDecorator {

    private Beverage beverage;

    public Milk(Beverage b) {
        beverage = b;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return 0.10 + beverage.cost();
    }
}
