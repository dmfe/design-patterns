package com.nc.despat.pizzastore.ingredients;

import com.nc.despat.pizzastore.ingredients.cheese.Cheese;
import com.nc.despat.pizzastore.ingredients.clam.Clams;
import com.nc.despat.pizzastore.ingredients.dough.Dough;
import com.nc.despat.pizzastore.ingredients.pepperoni.Pepperoni;
import com.nc.despat.pizzastore.ingredients.sauce.Sauce;
import com.nc.despat.pizzastore.ingredients.veggie.Veggie;

import java.util.List;

public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    List<Veggie> createVeggies();
    Pepperoni createPepperoni();
    Clams createClam();
}
