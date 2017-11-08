package com.nc.despat.pizzastore.pizza;

import org.apache.log4j.Logger;

import java.util.Collections;

public class ChicagoStylePepperoniPizza extends Pizza {
    private static final Logger log = Logger.getLogger(ChicagoStyleCheesePizza.class);

    public ChicagoStylePepperoniPizza() {
        name = "Chicago Style Pepperoni Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        Collections.addAll(toppings,
                "Shredded Mozzarella Cheese",
                "Sliced Pepperoni");
    }

    @Override
    public void cut() {
        log.info("Cutting the pizza into square slices");
        System.out.println("Cutting the pizza into square slices");
    }
}