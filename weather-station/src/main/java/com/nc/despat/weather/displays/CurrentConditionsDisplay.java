package com.nc.despat.weather.displays;

import com.nc.despat.weather.api.DisplayElement;
import com.nc.despat.weather.api.Observer;
import com.nc.despat.weather.api.Subject;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject subject;

    public CurrentConditionsDisplay(Subject s) {
        subject = s;
        subject.registerObserver(this);
    }

    @Override
    public void display() {
        log.info("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity.");
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity.");
    }

    @Override
    public void update(float temp, float hum, float press) {
        temperature = temp;
        humidity = hum;
        display();
    }

}
