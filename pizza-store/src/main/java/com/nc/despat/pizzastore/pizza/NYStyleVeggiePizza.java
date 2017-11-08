package com.nc.despat.pizzastore.pizza;

import java.util.Collections;

public class NYStyleVeggiePizza extends Pizza {

    public NYStyleVeggiePizza() {
        name = "NY Style Veggie Pizza";
        dough = "Thin Crust Dough";
        sauce = "Celery and Cilantro sauce";
        Collections.addAll(toppings,
                "Sliced Mushrooms",
                "Sliced Tomatoes",
                "Grated Parmezan Cheese");
    }
}