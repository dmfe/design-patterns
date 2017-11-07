package com.nc.despat.weather;

import com.nc.despat.weather.api.DisplayElement;
import com.nc.despat.weather.beans.WeatherData;
import com.nc.despat.weather.displays.CurrentConditionsDisplay;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class WeatherStation {
    private static final Logger log = Logger.getLogger(WeatherStation.class);

    public static void main(String[] args) {
        PropertyConfigurator.configure(WeatherStation.class.getClassLoader().getResourceAsStream("log4j.properties"));
        new WeatherStation().start();
    }

    private void start() {
        log.info("Weather application started...");
        WeatherData data = new WeatherData();
        DisplayElement currentConditionsDisplay = new CurrentConditionsDisplay(data);

        data.setMeasurments(80, 65, 30.4f);
        data.setMeasurments(82, 70, 29.2f);
        data.setMeasurments(78, 90, 30.2f);
    }
}
