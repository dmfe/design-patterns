package com.nc.despat.pizzastore.pizza;

import com.nc.despat.pizzastore.ingredients.PizzaIngredientFactory;
import org.apache.log4j.Logger;

public class VeggiePizza extends Pizza {
    private static final Logger log = Logger.getLogger(CheesePizza.class);

    private PizzaIngredientFactory ingredientFactory;

    public VeggiePizza(PizzaIngredientFactory ingredientFact) {
        ingredientFactory = ingredientFact;
    }

    @Override
    public void prepare() {
        log.info("Preparing " + name);
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        veggies = ingredientFactory.createVeggies();
    }
}