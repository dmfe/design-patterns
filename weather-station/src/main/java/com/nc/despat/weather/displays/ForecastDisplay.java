package com.nc.despat.weather.displays;

import com.nc.despat.weather.api.DisplayElement;
import com.nc.despat.weather.api.Observer;
import com.nc.despat.weather.api.Subject;
import org.apache.log4j.Logger;

public class ForecastDisplay implements Observer, DisplayElement {
    private static final Logger log = Logger.getLogger(ForecastDisplay.class);

    private float currentPressure = 29.92f;
    private float lastPressure;
    private Subject subject;

    public ForecastDisplay(Subject s) {
        subject = s;
        subject.registerObserver(this);
    }

    @Override
    public void update(float temp, float hum, float press) {
        lastPressure = currentPressure;
        currentPressure = press;

        display();
    }

    @Override
    public void display() {
        String output = "Forecast: ";
        if (currentPressure > lastPressure) output += "Improving weather on the way!";
        else if (currentPressure == lastPressure) output += "More of the same.";
        else if (currentPressure < lastPressure) output += "Watch out for cooler, rainy weather.";

        log.info(output);
        System.out.println(output);
    }
}
