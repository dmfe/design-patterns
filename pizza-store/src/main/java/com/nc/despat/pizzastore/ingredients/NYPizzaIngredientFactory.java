package com.nc.despat.pizzastore.ingredients;

import com.nc.despat.pizzastore.ingredients.cheese.Cheese;
import com.nc.despat.pizzastore.ingredients.cheese.ReggianoCheese;
import com.nc.despat.pizzastore.ingredients.clam.Clams;
import com.nc.despat.pizzastore.ingredients.clam.FreshClams;
import com.nc.despat.pizzastore.ingredients.dough.Dough;
import com.nc.despat.pizzastore.ingredients.dough.ThinCrustDough;
import com.nc.despat.pizzastore.ingredients.pepperoni.Pepperoni;
import com.nc.despat.pizzastore.ingredients.pepperoni.SlicedPepperoni;
import com.nc.despat.pizzastore.ingredients.sauce.MarinaraSauce;
import com.nc.despat.pizzastore.ingredients.sauce.Sauce;
import com.nc.despat.pizzastore.ingredients.veggie.Garlic;
import com.nc.despat.pizzastore.ingredients.veggie.Mushroom;
import com.nc.despat.pizzastore.ingredients.veggie.Onion;
import com.nc.despat.pizzastore.ingredients.veggie.RedPepper;
import com.nc.despat.pizzastore.ingredients.veggie.Veggie;

import java.util.Arrays;
import java.util.List;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public List<Veggie> createVeggies() {
        return Arrays.asList(new Garlic(), new Mushroom(), new Onion(), new RedPepper());
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
