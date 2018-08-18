package ru.golden.kotlin_weather_station.dto;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

class Clouds implements Serializable {

    @SerializedName("all")
    private Integer all;
}

