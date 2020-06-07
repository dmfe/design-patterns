package com.nc.despat.simuduck.ducks;

import com.nc.despat.simuduck.behaviors.api.FlyBehavior;
import com.nc.despat.simuduck.behaviors.api.QuackBehavior;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class Duck {

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
