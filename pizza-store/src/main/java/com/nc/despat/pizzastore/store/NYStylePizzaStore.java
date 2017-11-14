package com.nc.despat.pizzastore.store;

import com.nc.despat.pizzastore.ingredients.NYPizzaIngredientFactory;
import com.nc.despat.pizzastore.ingredients.PizzaIngredientFactory;
import com.nc.despat.pizzastore.pizza.CheesePizza;
import com.nc.despat.pizzastore.pizza.ClamPizza;
import com.nc.despat.pizzastore.pizza.PepperoniPizza;
import com.nc.despat.pizzastore.pizza.Pizza;
import com.nc.despat.pizzastore.pizza.VeggiePizza;

public class NYStylePizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (Pizza.CHEESE_TYPE.equals(type)) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("NY Style Cheese Pizza");
        } else if (Pizza.CLAM_TYPE.equals(type)) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("NY Style Clam Pizza");
        } else if (Pizza.PEPPERONI_TYPE.equals(type)) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("NY Style Pepperoni Pizza");
        } else if (Pizza.VEGGIE_TYPE.equals(type)) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("NY Style Veggie Pizza");
        }

        return pizza;
    }
}