package com.nc.despat.simudack.behaviors.impl;

import com.nc.despat.simudack.behaviors.api.FlyBehavior;
import org.apache.log4j.Logger;

public class FlyingWithWings implements FlyBehavior {
    private static final Logger log = Logger.getLogger(FlyingWithWings.class);

    @Override
    public void fly() {
        log.info("I'm flying by my wings!");
        System.out.println("I'm flying by my wings!");
    }
}
