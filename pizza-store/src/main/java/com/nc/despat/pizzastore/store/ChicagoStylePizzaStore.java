package com.nc.despat.pizzastore.store;

import com.nc.despat.pizzastore.pizza.ChicagoStyleCheesePizza;
import com.nc.despat.pizzastore.pizza.ChicagoStyleClamPizza;
import com.nc.despat.pizzastore.pizza.ChicagoStylePepperoniPizza;
import com.nc.despat.pizzastore.pizza.ChicagoStyleVeggiePizza;
import com.nc.despat.pizzastore.pizza.Pizza;

public class ChicagoStylePizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        if (Pizza.CHEESE_TYPE.equals(type)) {
            return new ChicagoStyleCheesePizza();
        } else if (Pizza.CLAM_TYPE.equals(type)) {
            return new ChicagoStyleClamPizza();
        } else if (Pizza.PEPPERONI_TYPE.equals(type)) {
            return new ChicagoStylePepperoniPizza();
        } else if (Pizza.VEGGIE_TYPE.equals(type)) {
            return new ChicagoStyleVeggiePizza();
        } else {
            return null;
        }
    }
}