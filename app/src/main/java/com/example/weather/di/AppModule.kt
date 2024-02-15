package com.example.weather.di

import com.example.weather.RetrofitService
import com.example.weather.WeatherApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)

class AppModule {
    @Provides
    fun provideWeatherApi(): WeatherApi {
        return RetrofitService().api
    }
}