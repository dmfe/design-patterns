package com.nc.despat.simuduck.behaviors.impl;

import com.nc.despat.simuduck.behaviors.api.QuackBehavior;
import org.apache.log4j.Logger;

public class Squeak implements QuackBehavior {
    private static final Logger log = Logger.getLogger(Squeak.class);

    @Override
    public void quack() {
        log.info("Squeak");
        System.out.println("Squeak");
    }
}
