package com.nc.despat.simuduck.ducks;

import com.nc.despat.simuduck.behaviors.impl.FlyNoWay;
import com.nc.despat.simuduck.behaviors.impl.Quack;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ModelDuck extends Duck {

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
