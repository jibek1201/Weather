package com.example.weather

import android.util.Log
import androidx.lifecycle.MutableLiveData
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class Repository @Inject constructor(val api: WeatherApi) {
    fun getWeather(): MutableLiveData<WeatherModel> {
        val data = MutableLiveData<WeatherModel>()
        api.getWeather().enqueue(object : Callback<WeatherModel>{
            override fun onResponse(call: Call<WeatherModel>, response: Response<WeatherModel>) {
                if (response.isSuccessful) {
                    response.body()?.let {
                        data.value = it
                    }
                }
            }

            override fun onFailure(call: Call<WeatherModel>, t: Throwable) {
                Log.e("ololo", "onFailure: ${t.message}", )
            }
        })
            return data
        }
    }
