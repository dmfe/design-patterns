package com.nc.despat.starbuzz.beverages.condiments;

import com.nc.despat.starbuzz.beverages.Beverage;

public class Soy extends CondimentDecorator {

    private Beverage beverage;

    public Soy(Beverage b) {
        beverage = b;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return 0.15 + beverage.cost();
    }
}
