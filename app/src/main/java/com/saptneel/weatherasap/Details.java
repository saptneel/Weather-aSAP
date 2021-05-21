package com.saptneel.weatherasap;

import com.google.gson.annotations.SerializedName;

public class Details {
    @SerializedName("id")
    private int id;

    @SerializedName("main")
    private String main;

    @SerializedName("icon")
    private String icon;

    public String getMain() {
        return main;
    }

    public String getIcon() {
        return icon;
    }

    public int getId() {
        return id;
    }
}
