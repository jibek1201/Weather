package com.example.weather

import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
@HiltViewModel
class WeatherViewModel @Inject constructor (val repository: Repository)  : ViewModel() {
    fun getWeather() : LiveData<String>{
        val result= MutableLiveData<String>()
    repository.getWeather().observeForever{
        var data= ""
        it.let {
            it.list.forEach{
                data += "temp: ${it.main.temp} \n feels like\n ${it.main.feels_like}\n ${it.weather[0].main}\n${it.weather[0].description}\n"

            }
        }
        result.postValue(data)
    }
        return result
    }
}