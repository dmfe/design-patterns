package com.nc.despat.pizzastore;

import com.nc.despat.pizzastore.pizza.Pizza;
import com.nc.despat.pizzastore.store.ChicagoStylePizzaStore;
import com.nc.despat.pizzastore.store.NYStylePizzaStore;
import com.nc.despat.pizzastore.store.PizzaStore;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class PizzaTest {
    private static final Logger log = Logger.getLogger(PizzaTest.class);

    public static void main(String[] args) {
        PropertyConfigurator.configure(PizzaStore.class.getClassLoader().getResourceAsStream("log4j.properties"));
        new PizzaTest().run();
    }

    private void run() {
        log.info("Pizza Store application started...");
        PizzaStore nyStore = new NYStylePizzaStore();
        Pizza nyPizza = nyStore.orderPizza(Pizza.CHEESE_TYPE);
        log.info(nyPizza);

        PizzaStore chicagoStore = new ChicagoStylePizzaStore();
        Pizza chPizza = chicagoStore.orderPizza(Pizza.VEGGIE_TYPE);
        log.info(chPizza);
    }
}
