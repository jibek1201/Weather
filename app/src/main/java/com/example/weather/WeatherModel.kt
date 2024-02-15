package com.example.weather

data class WeatherInfo (
    val dt: Int,
    val main: Main,
    val weather: List<Weather>,
    val visibility: Int,
)

data class WeatherModel(
    val list: List<WeatherInfo>
)

data class Weather(
    val main: String,
    val description: String,
)

data class Main(
    val temp: Double,
    val feels_like: Double,

)