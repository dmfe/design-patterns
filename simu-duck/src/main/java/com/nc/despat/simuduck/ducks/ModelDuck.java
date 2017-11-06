package com.nc.despat.simuduck.ducks;

import com.nc.despat.simuduck.behaviors.impl.FlyNoWay;
import com.nc.despat.simuduck.behaviors.impl.Quack;
import org.apache.log4j.Logger;

public class ModelDuck extends Duck {
    private static final Logger log = Logger.getLogger(ModelDuck.class);

    public ModelDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        log.info("I'm a model duck");
        System.out.println("I'm a model duck");
    }
}
