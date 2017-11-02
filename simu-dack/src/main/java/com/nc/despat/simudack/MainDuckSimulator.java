package com.nc.despat.simudack;

import com.nc.despat.simudack.behaviors.impl.FlyRocketPowered;
import com.nc.despat.simudack.ducks.Duck;
import com.nc.despat.simudack.ducks.MallardDuck;
import com.nc.despat.simudack.ducks.ModelDuck;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class MainDuckSimulator {
    private static final Logger log = Logger.getLogger(MainDuckSimulator.class);

    public static void main(String[] args) {
        PropertyConfigurator.configure(MainDuckSimulator.class.getClassLoader().getResourceAsStream("log4j.properties"));
        new MainDuckSimulator().start();
    }

    private void start() {
        log.info("Application started ...");

        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performQuack();
        mallardDuck.performFly();

        Duck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.performQuack();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
    }
}
