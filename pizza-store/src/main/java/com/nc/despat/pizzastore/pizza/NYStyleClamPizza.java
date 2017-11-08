package com.nc.despat.pizzastore.pizza;

import java.util.Collections;

public class NYStyleClamPizza extends Pizza {

    public NYStyleClamPizza() {
        name = "NY Style Clam Pizza";
        dough = "Thin Crust Dough";
        sauce = "Tuna Sauce";
        Collections.addAll(toppings,
                "Boiled Clams",
                "Grated Cheddar Cheese");
    }
}