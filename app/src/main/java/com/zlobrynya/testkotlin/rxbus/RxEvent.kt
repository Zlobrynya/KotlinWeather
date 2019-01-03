package com.zlobrynya.testkotlin.rxbus

import com.zlobrynya.testkotlin.jacksonClass.ResponseForecast
import com.zlobrynya.testkotlin.jacksonClass.current.Current

class RxEvent {
    public class EventForecastWeather(val responseForecast: ResponseForecast)
}