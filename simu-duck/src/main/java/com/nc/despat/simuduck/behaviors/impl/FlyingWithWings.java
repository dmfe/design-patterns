package com.nc.despat.simuduck.behaviors.impl;

import com.nc.despat.simuduck.behaviors.api.FlyBehavior;
import org.apache.log4j.Logger;

public class FlyingWithWings implements FlyBehavior {
    private static final Logger log = Logger.getLogger(FlyingWithWings.class);

    @Override
    public void fly() {
        log.info("I'm flying by my wings!");
        System.out.println("I'm flying by my wings!");
    }
}
