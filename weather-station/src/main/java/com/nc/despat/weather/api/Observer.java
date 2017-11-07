package com.nc.despat.weather.api;

public interface Observer {
    void update(float temperature, float humidity, float pressure);
}
