package com.nc.despat.simudack.behaviors.impl;

import com.nc.despat.simudack.behaviors.api.FlyBehavior;
import org.apache.log4j.Logger;

public class FlyRocketPowered implements FlyBehavior {
    private static final Logger log = Logger.getLogger(FlyRocketPowered.class);

    @Override
    public void fly() {
        log.info("I'm flying with a rocket!");
        System.out.println("I'm flying with a rocket!");
    }
}
