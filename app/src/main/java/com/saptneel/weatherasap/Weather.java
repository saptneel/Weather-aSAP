package com.saptneel.weatherasap;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Weather {
    @SerializedName("main")
    private Main main;

    @SerializedName("weather")
    private ArrayList<Details> details;

    @SerializedName("wind")
    private Wind wind;

    @SerializedName("sys")
    private Sun sun;

    @SerializedName("cod")
    private int err_cod;

    public int getErr_cod() {
        return err_cod;
    }

    public Main getMain() {
        return main;
    }

    public Details getDetails() {
        return details.get(0);
    }

    public Wind getWind() {
        return wind;
    }

    public Sun getSun() {
        return sun;
    }
}
