package com.design_patterns.proxy_pattern.remote_proxy;

public class WeatherProxyLocal implements Weather {

    private Weather weather;

    public WeatherProxyLocal() {
        this.weather = new WeatherServiceServer();
    }

    @Override
    public String getWeather() {
        authenticate();
        openConnection();
        serializeRequest();

        return sendHttpRequest();
    }

    private void authenticate() {
        System.out.println("Authenticating...");
    }

    private void openConnection() {
        System.out.println("Opening Connection...");
    }

    private void serializeRequest() {
        System.out.println("Serializing Request...");
    }

    private String sendHttpRequest() {
        System.out.println("Sending HTTP Request...");
        return weather.getWeather();
    }
}
