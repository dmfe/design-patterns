package com.nc.despat.weather.beans;

import com.nc.despat.weather.api.Observer;
import com.nc.despat.weather.api.Subject;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private static final Logger log = Logger.getLogger(WeatherData.class);

    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temp, float hum, float press) {
        temperature = temp;
        humidity = hum;
        pressure = press;
        measurementsChanged();
    }
}
