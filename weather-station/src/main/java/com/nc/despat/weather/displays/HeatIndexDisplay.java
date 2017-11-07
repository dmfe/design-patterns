package com.nc.despat.weather.displays;

import com.nc.despat.weather.api.DisplayElement;
import com.nc.despat.weather.api.Observer;
import com.nc.despat.weather.api.Subject;
import org.apache.log4j.Logger;

public class HeatIndexDisplay implements Observer, DisplayElement {
    private static final Logger log = Logger.getLogger(HeatIndexDisplay.class);
    private float heatIndex = 0.0f;
    private Subject subject;

    public HeatIndexDisplay(Subject s) {
        subject = s;
        subject.registerObserver(this);
    }

    @Override
    public void update(float temp, float rh, float press) {
        heatIndex = computeHeatIndex(temp, rh);
        display();
    }

    @Override
    public void display() {
        log.info("Heat index is " + heatIndex);
        System.out.println("Heat index is " + heatIndex);

    }

    private float computeHeatIndex(float t, float rh) {
        return (float)((16.923 + (0.185212 * t) + (5.37941 * rh) - (0.100254 * t * rh)
                + (0.00941695 * (t * t)) + (0.00728898 * (rh * rh))
                + (0.000345372 * (t * t * rh)) - (0.000814971 * (t * rh * rh)) +
                (0.0000102102 * (t * t * rh * rh)) - (0.000038646 * (t * t * t)) + (0.0000291583 *
                (rh * rh * rh)) + (0.00000142721 * (t * t * t * rh)) +
                (0.000000197483 * (t * rh * rh * rh)) - (0.0000000218429 * (t * t * t * rh * rh)) +
                0.000000000843296 * (t * t * rh * rh * rh)) -
                (0.0000000000481975 * (t * t * t * rh * rh * rh)));
    }
}
