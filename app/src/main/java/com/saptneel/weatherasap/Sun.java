package com.saptneel.weatherasap;

import android.util.Log;

import com.google.gson.annotations.SerializedName;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Sun {
    @SerializedName("sunrise")
    private int sunrise;

    @SerializedName("sunset")
    private int sunset;

    private final SimpleDateFormat f;

    public Sun() {
        f = new SimpleDateFormat("hh:mm aa z");
    }

    public String getSunrise() {
        Date sunriseTime = new Date(sunrise * 1000L);
        return f.format(sunriseTime);
    }

    public String getSunset() {
        Date sunsetTime = new Date(sunset * 1000L);
        return f.format(sunsetTime);
    }
}
