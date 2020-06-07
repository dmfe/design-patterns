package com.nc.despat.weather.displays;

import com.nc.despat.weather.api.DisplayElement;
import com.nc.despat.weather.api.Observer;
import com.nc.despat.weather.api.Subject;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StatisticsDisplay implements Observer, DisplayElement {

    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum = 0.0f;
    private int readings;
    private Subject subject;

    public StatisticsDisplay(Subject s) {
        subject = s;
        subject.registerObserver(this);
    }

    @Override
    public void update(float temp, float hum, float press) {
        tempSum += temp;
        readings++;

        if (temp > maxTemp) maxTemp = temp;
        if (temp < minTemp) minTemp = temp;
        display();
    }

    @Override
    public void display() {
        log.info("Avg/Max/Min temperature = " + (tempSum / readings) + "/" + maxTemp + "/" + minTemp);
        System.out.println("Avg/Max/Min temperature = " + (tempSum / readings) + "/" + maxTemp + "/" + minTemp);
    }
}