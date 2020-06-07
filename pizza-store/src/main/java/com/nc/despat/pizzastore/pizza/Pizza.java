package com.nc.despat.pizzastore.pizza;

import com.nc.despat.pizzastore.ingredients.cheese.Cheese;
import com.nc.despat.pizzastore.ingredients.clam.Clams;
import com.nc.despat.pizzastore.ingredients.dough.Dough;
import com.nc.despat.pizzastore.ingredients.pepperoni.Pepperoni;
import com.nc.despat.pizzastore.ingredients.sauce.Sauce;
import com.nc.despat.pizzastore.ingredients.veggie.Veggie;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public abstract class Pizza {

    public static final String CHEESE_TYPE  = "cheese";
    public static final String VEGGIE_TYPE  = "veggie";
    public static final String CLAM_TYPE  = "clam";
    public static final String PEPPERONI_TYPE  = "pepperoni";

    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clams clams;
    protected List<Veggie> veggies;

    public abstract void prepare();

    public void bake() {
        log.info("Bake for 25 minutes at 350");
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        log.info("Cutting pizza into diagonal slices");
        System.out.println("Cutting pizza into diagonal slices");
    }

    public void box() {
        log.info("Place pizza into official PizzaStore box");
        System.out.println("Place pizza into official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " (dough: " + dough +
                ", sauce: " + sauce +
                ", cheese: " + cheese +
                ", pepperoni: " + pepperoni +
                ", clams: " + clams +
                ", veggies: " + veggies + ")";
    }
}
