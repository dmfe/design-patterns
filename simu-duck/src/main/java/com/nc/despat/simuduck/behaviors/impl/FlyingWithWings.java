package com.nc.despat.simuduck.behaviors.impl;

import com.nc.despat.simuduck.behaviors.api.FlyBehavior;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FlyingWithWings implements FlyBehavior {

    @Override
    public void fly() {
        log.info("I'm flying by my wings!");
        System.out.println("I'm flying by my wings!");
    }
}
