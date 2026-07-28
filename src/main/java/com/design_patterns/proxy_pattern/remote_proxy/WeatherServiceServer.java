package com.design_patterns.proxy_pattern.remote_proxy;

public class WeatherServiceServer implements Weather{
    @Override
    public String getWeather() {
        System.out.println("Fetching Weather Data...");
        return "35 Degree Celsius";
    }
}
