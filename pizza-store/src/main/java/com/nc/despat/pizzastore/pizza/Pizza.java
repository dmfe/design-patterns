package com.nc.despat.pizzastore.pizza;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    private static final Logger log = Logger.getLogger(Pizza.class);

    public static final String CHEESE_TYPE  = "cheese";
    public static final String VEGGIE_TYPE  = "veggie";
    public static final String CLAM_TYPE  = "clam";
    public static final String PEPPERONI_TYPE  = "pepperoni";

    protected String name;
    protected String dough;
    protected String sauce;
    protected List<String> toppings = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void prepare() {
        log.info("Preparing " + name);
        System.out.println("Preparing " + name);

        log.info("Tossing dough...");
        System.out.println("Tossing dough...");

        log.info("Adding sauce...");
        System.out.println("Adding sauce...");

        System.out.println("Adding toppings:");
        toppings.forEach(toppping -> System.out.println("  -> " + toppping));
        log.info("Adding toppings: " + toppings.stream().reduce("", (s, c) -> s + ", " +  c));
    }

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
}
