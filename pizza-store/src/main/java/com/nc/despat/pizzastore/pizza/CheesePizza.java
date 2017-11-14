package com.nc.despat.pizzastore.pizza;

import com.nc.despat.pizzastore.ingredients.PizzaIngredientFactory;
import org.apache.log4j.Logger;

public class CheesePizza extends Pizza {
    private static final Logger log = Logger.getLogger(CheesePizza.class);

    private PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFact) {
        ingredientFactory = ingredientFact;
    }

    @Override
    public void prepare() {
        log.info("Preparing " + name);
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}