package com.nc.despat.simudack.ducks;

import com.nc.despat.simudack.behaviors.impl.FlyingWithWings;
import com.nc.despat.simudack.behaviors.impl.Quack;
import org.apache.log4j.Logger;

public class MallardDuck extends Duck {
    private static final Logger log = Logger.getLogger(MallardDuck.class);

    // Here we are programming to a particular behavior implementation. This is not good.
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyingWithWings();
    }

    @Override
    public void display() {
        log.info("I'm a real Mallard duck");
        System.out.println("I'm a real Mallard duck");
    }
}
