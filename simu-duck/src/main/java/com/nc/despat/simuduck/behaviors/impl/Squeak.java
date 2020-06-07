package com.nc.despat.simuduck.behaviors.impl;

import com.nc.despat.simuduck.behaviors.api.QuackBehavior;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        log.info("Squeak");
        System.out.println("Squeak");
    }
}
