package ru.golden.kotlin_weather_station.dto;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

class Weather implements Serializable {

    @SerializedName("id")
    private Integer id;

    @SerializedName("main")
    private String main;

    @SerializedName("description")
    private String description;

    @SerializedName("icon")
    private String icon;
}
