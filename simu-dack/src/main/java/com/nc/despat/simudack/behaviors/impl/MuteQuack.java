package com.nc.despat.simudack.behaviors.impl;

import com.nc.despat.simudack.behaviors.api.QuackBehavior;
import org.apache.log4j.Logger;

public class MuteQuack implements QuackBehavior {
    private static final Logger log = Logger.getLogger(QuackBehavior.class);

    @Override
    public void quack() {
        log.info("<Silence>");
        System.out.println("<Silence>");
    }
}
