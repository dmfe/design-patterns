package com.nc.despat.pizzastore;

import com.nc.despat.pizzastore.pizza.Pizza;
import com.nc.despat.pizzastore.store.ChicagoStylePizzaStore;
import com.nc.despat.pizzastore.store.NYStylePizzaStore;
import com.nc.despat.pizzastore.store.PizzaStore;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PizzaTest {

    public static void main(String[] args) {
        new PizzaTest().run();
    }

    private void run() {
        log.trace("Run pizza test");
        log.info("Pizza Store application started...");
        PizzaStore nyStore = new NYStylePizzaStore();
        Pizza nyPizza = nyStore.orderPizza(Pizza.CHEESE_TYPE);
        log.info(nyPizza.toString());

        PizzaStore chicagoStore = new ChicagoStylePizzaStore();
        Pizza chPizza = chicagoStore.orderPizza(Pizza.VEGGIE_TYPE);
        log.info(chPizza.toString());
    }
}
