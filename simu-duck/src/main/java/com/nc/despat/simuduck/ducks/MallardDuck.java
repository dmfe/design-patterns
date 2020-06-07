package com.nc.despat.simuduck.ducks;

import com.nc.despat.simuduck.behaviors.impl.FlyingWithWings;
import com.nc.despat.simuduck.behaviors.impl.Quack;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MallardDuck extends Duck {

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
