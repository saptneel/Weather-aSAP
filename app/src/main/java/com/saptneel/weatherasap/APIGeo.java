package com.saptneel.weatherasap;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface APIGeo {
    @GET("weather")
    Call<Weather> getData(@Query("lat") String lat, @Query("lon") String lon, @Query("appid") String apiKey);
}