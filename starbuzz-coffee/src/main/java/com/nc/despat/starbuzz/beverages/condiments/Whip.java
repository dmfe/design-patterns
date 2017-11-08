package com.nc.despat.starbuzz.beverages.condiments;

import com.nc.despat.starbuzz.beverages.Beverage;

public class Whip extends CondimentDecorator {

    private Beverage beverage;

    public Whip(Beverage b) {
        beverage = b;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return 0.10 + beverage.cost();
    }
}
