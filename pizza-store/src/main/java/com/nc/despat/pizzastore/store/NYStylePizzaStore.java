package com.nc.despat.pizzastore.store;

import com.nc.despat.pizzastore.pizza.NYStyleCheesePizza;
import com.nc.despat.pizzastore.pizza.NYStyleClamPizza;
import com.nc.despat.pizzastore.pizza.NYStylePepperoniPizza;
import com.nc.despat.pizzastore.pizza.NYStyleVeggiePizza;
import com.nc.despat.pizzastore.pizza.Pizza;

public class NYStylePizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        if (Pizza.CHEESE_TYPE.equals(type)) {
            return new NYStyleCheesePizza();
        } else if (Pizza.CLAM_TYPE.equals(type)) {
            return new NYStyleClamPizza();
        } else if (Pizza.PEPPERONI_TYPE.equals(type)) {
            return new NYStylePepperoniPizza();
        } else if (Pizza.VEGGIE_TYPE.equals(type)) {
            return new NYStyleVeggiePizza();
        } else {
            return null;
        }
    }
}