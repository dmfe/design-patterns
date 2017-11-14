package com.nc.despat.pizzastore.store;

import com.nc.despat.pizzastore.ingredients.ChicagoPizzaIngredientFactory;
import com.nc.despat.pizzastore.ingredients.PizzaIngredientFactory;
import com.nc.despat.pizzastore.pizza.CheesePizza;
import com.nc.despat.pizzastore.pizza.ClamPizza;
import com.nc.despat.pizzastore.pizza.PepperoniPizza;
import com.nc.despat.pizzastore.pizza.VeggiePizza;
import com.nc.despat.pizzastore.pizza.Pizza;

public class ChicagoStylePizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        if (Pizza.CHEESE_TYPE.equals(type)) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        } else if (Pizza.CLAM_TYPE.equals(type)) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago Style Clam Pizza");
        } else if (Pizza.PEPPERONI_TYPE.equals(type)) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Chicago Style Pepperoni Pizza");
        } else if (Pizza.VEGGIE_TYPE.equals(type)) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Chicago Style Veggie Pizza");
        }

        return pizza;
    }
}