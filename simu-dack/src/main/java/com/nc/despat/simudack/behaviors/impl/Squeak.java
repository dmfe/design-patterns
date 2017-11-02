package com.nc.despat.simudack.behaviors.impl;

import com.nc.despat.simudack.behaviors.api.QuackBehavior;
import org.apache.log4j.Logger;

public class Squeak implements QuackBehavior {
    private static final Logger log = Logger.getLogger(Squeak.class);

    @Override
    public void quack() {
        log.info("Squeak");
        System.out.println("Squeak");
    }
}
