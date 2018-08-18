package ru.golden.kotlin_weather_station.dto;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

class Wind implements Serializable {

    @SerializedName("speed")
    private Float speed;

    @SerializedName("deg")
    private Float deg;
}
