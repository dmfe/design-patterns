package com.nc.despat.simuduck;

import com.nc.despat.simuduck.behaviors.impl.FlyRocketPowered;
import com.nc.despat.simuduck.ducks.Duck;
import com.nc.despat.simuduck.ducks.MallardDuck;
import com.nc.despat.simuduck.ducks.ModelDuck;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MainDuckSimulator {

    public static void main(String[] args) {
        new MainDuckSimulator().start();
    }

    private void start() {
        log.info("Application started ...");

        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performQuack();
        mallardDuck.performFly();

        Duck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.performQuack();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
    }
}
