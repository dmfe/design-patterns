package com.nc.despat.simudack.behaviors.impl;

import com.nc.despat.simudack.behaviors.api.QuackBehavior;
import org.apache.log4j.Logger;

public class Quack implements QuackBehavior {
    private static final Logger log = Logger.getLogger(Quack.class);

    @Override
    public void quack() {
        log.info("Quack");
        System.out.println("Quack");
    }
}
