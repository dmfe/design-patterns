package com.nc.despat.simuduck.behaviors.impl;

import com.nc.despat.simuduck.behaviors.api.FlyBehavior;
import org.apache.log4j.Logger;

public class FlyRocketPowered implements FlyBehavior {
    private static final Logger log = Logger.getLogger(FlyRocketPowered.class);

    @Override
    public void fly() {
        log.info("I'm flying with a rocket!");
        System.out.println("I'm flying with a rocket!");
    }
}
