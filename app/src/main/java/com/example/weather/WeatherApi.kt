package com.example.weather

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {

    @GET("data/2.5/forecast")
    fun getWeather(
        @Query("q") city:String = "Bishkek",
        @Query("appid") appid:String = "bdb2917eb8179d50d760b162dcdc2e24",
        @Query("units") units:String = "metric"
    ) : Call<WeatherModel>
}



//https://api.openweathermap.org/data/2.5/forecast?q=Bishkek&appid=bdb2917eb8179d50d760b162dcdc2e24&units=metric