package com.nc.despat.weather;

import com.nc.despat.weather.api.DisplayElement;
import com.nc.despat.weather.beans.WeatherData;
import com.nc.despat.weather.displays.CurrentConditionsDisplay;
import com.nc.despat.weather.displays.ForecastDisplay;
import com.nc.despat.weather.displays.HeatIndexDisplay;
import com.nc.despat.weather.displays.StatisticsDisplay;
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
        DisplayElement statisticsDisplay = new StatisticsDisplay(data);
        DisplayElement forecastDisplay = new ForecastDisplay(data);
        DisplayElement heatIndexDisplay = new HeatIndexDisplay(data);

        data.setMeasurements(80, 65, 30.4f);
        data.setMeasurements(82, 70, 29.2f);
        data.setMeasurements(78, 90, 30.2f);
    }
}
