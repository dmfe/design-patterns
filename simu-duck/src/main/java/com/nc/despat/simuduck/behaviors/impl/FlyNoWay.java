package com.nc.despat.simuduck.behaviors.impl;

import com.nc.despat.simuduck.behaviors.api.FlyBehavior;
import org.apache.log4j.Logger;

public class FlyNoWay implements FlyBehavior {
    private static final Logger log = Logger.getLogger(FlyNoWay.class);

    @Override
    public void fly() {
        log.info("I can't fly.");
        System.out.println("I can't fly.");
    }
}