package com.nc.despat.pizzastore.pizza;

import org.apache.log4j.Logger;

public class ChicagoStyleCheesePizza extends Pizza {
    private static final Logger log = Logger.getLogger(ChicagoStyleCheesePizza.class);

    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add("Shredded Mozzarella Cheese");
    }

    @Override
    public void cut() {
        log.info("Cutting the pizza into square slices");
        System.out.println("Cutting the pizza into square slices");
    }
}