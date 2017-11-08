package com.nc.despat.starbuzz;

import com.nc.despat.starbuzz.beverages.Beverage;
import com.nc.despat.starbuzz.beverages.DarkRoast;
import com.nc.despat.starbuzz.beverages.Espresso;
import com.nc.despat.starbuzz.beverages.HouseBlend;
import com.nc.despat.starbuzz.beverages.condiments.Mocha;
import com.nc.despat.starbuzz.beverages.condiments.Soy;
import com.nc.despat.starbuzz.beverages.condiments.Whip;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class StarbuzzCoffe {
    private static final Logger log = Logger.getLogger(StarbuzzCoffe.class);

    public static void main(String[] args) {
        PropertyConfigurator.configure(StarbuzzCoffe.class.getClassLoader().getResourceAsStream("log4j.properties"));
        new StarbuzzCoffe().run();
    }

    private void run() {
        log.info("Starrbuzz coffee application started...");

        Beverage beverage1 = new Espresso();
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }
}