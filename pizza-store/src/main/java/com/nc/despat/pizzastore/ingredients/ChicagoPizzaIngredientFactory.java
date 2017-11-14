package com.nc.despat.pizzastore.ingredients;

import com.nc.despat.pizzastore.ingredients.cheese.Cheese;
import com.nc.despat.pizzastore.ingredients.cheese.Mozzarella;
import com.nc.despat.pizzastore.ingredients.clam.Clams;
import com.nc.despat.pizzastore.ingredients.clam.FrozenClams;
import com.nc.despat.pizzastore.ingredients.dough.Dough;
import com.nc.despat.pizzastore.ingredients.dough.ThickCrustDough;
import com.nc.despat.pizzastore.ingredients.pepperoni.Pepperoni;
import com.nc.despat.pizzastore.ingredients.pepperoni.SlicedPepperoni;
import com.nc.despat.pizzastore.ingredients.sauce.PlumTomatoSauce;
import com.nc.despat.pizzastore.ingredients.sauce.Sauce;
import com.nc.despat.pizzastore.ingredients.veggie.BlackOlives;
import com.nc.despat.pizzastore.ingredients.veggie.EggPlant;
import com.nc.despat.pizzastore.ingredients.veggie.Oregano;
import com.nc.despat.pizzastore.ingredients.veggie.Spinach;
import com.nc.despat.pizzastore.ingredients.veggie.Veggie;

import java.util.Arrays;
import java.util.List;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new Mozzarella();
    }

    @Override
    public List<Veggie> createVeggies() {
        return Arrays.asList(new Spinach(), new BlackOlives(), new EggPlant(), new Oregano());
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }
}
