package com.nc.despat.pizzastore.pizza;

import java.util.Collections;

public class NYStylePepperoniPizza extends Pizza {

    public NYStylePepperoniPizza() {
        name = "NY Style Pepperoni Pizza";
        dough = "Thin Crust Dough";
        sauce = "Barbecue Sauce";
        Collections.addAll(toppings,
                "Smoked Sliced Pepperoni",
                "Shredded Cheddar Cheese");
    }
}