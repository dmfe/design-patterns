package com.nc.despat.simudack.ducks;

import com.nc.despat.simudack.behaviors.api.FlyBehavior;
import com.nc.despat.simudack.behaviors.api.QuackBehavior;
import org.apache.log4j.Logger;

public abstract class Duck {
    private static final Logger log = Logger.getLogger(Duck.class);

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public abstract void display();

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void swim() {
        log.info("All ducks float, even decoy.");
        System.out.println("All ducks float, even decoy.");
    }
}
