package com.design_patterns.proxy_pattern.remote_proxy;

public class Main {

    public static void main(String[] args) {
        // -> Proxy Design Pattern
        // Remote Proxy
        Weather weather = new WeatherProxyLocal();
        System.out.println(weather.getWeather());
    }
}
