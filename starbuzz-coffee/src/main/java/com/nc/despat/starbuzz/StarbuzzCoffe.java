package com.nc.despat.starbuzz;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class StarbuzzCoffe {
    private static final Logger log = Logger.getLogger(StarbuzzCoffe.class);

    public static void main(String[] args) {
        PropertyConfigurator.configure(StarbuzzCoffe.class.getClassLoader().getResourceAsStream("log4j.properties"));
        new StarbuzzCoffe().run();
    }

    private void run() {
        log.info("Starrbuzz coffee application started...");
    }
}