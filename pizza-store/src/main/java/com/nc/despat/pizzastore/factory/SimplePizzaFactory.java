package com.nc.despat.pizzastore.factory;

import com.nc.despat.pizzastore.pizza.NYStyleCheesePizza;
import com.nc.despat.pizzastore.pizza.NYStyleClamPizza;
import com.nc.despat.pizzastore.pizza.NYStylePepperoniPizza;
import com.nc.despat.pizzastore.pizza.Pizza;
import com.nc.despat.pizzastore.pizza.NYStyleVeggiePizza;

public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if ("cheese".equals(type)) {
            pizza = new NYStyleCheesePizza();
        } else if ("pepperoni".equals(type)) {
            pizza = new NYStylePepperoniPizza();
        } else if ("clam".equals(type)) {
            pizza = new NYStyleClamPizza();
        } else if ("veggie".equals(type)) {
            pizza = new NYStyleVeggiePizza();
        }
        return pizza;
    }
}