package com.example.belief.coolweather.gson;

/**
 * Created by Belief on 2018/1/3.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
