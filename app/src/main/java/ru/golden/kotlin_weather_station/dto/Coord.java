package ru.golden.kotlin_weather_station.dto;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

class Coord implements Serializable {

    @SerializedName("lon")
    public Float lon;

    @SerializedName("lat")
    public Float lat;
}
