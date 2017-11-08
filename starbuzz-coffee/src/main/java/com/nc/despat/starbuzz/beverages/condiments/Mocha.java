package com.nc.despat.starbuzz.beverages.condiments;

import com.nc.despat.starbuzz.beverages.Beverage;

public class Mocha extends CondimentDecorator {

    private Beverage beverage;

    public Mocha(Beverage b) {
        beverage = b;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
}
