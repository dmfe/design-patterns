package com.nc.despat.simuduck.behaviors.impl;

import com.nc.despat.simuduck.behaviors.api.QuackBehavior;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        log.info("<Silence>");
        System.out.println("<Silence>");
    }
}
