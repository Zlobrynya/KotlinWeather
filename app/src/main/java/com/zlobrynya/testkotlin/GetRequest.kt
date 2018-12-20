package com.zlobrynya.testkotlin

import com.zlobrynya.testkotlin.jacksonClass.current.Weather
import com.zlobrynya.testkotlin.jacksonClass.forecast.ResponseForecast
import retrofit2.http.GET
import retrofit2.http.Query
import rx.Observable

interface GetRequest {
    @GET("v1/current.json")
    fun getCurrentWeather(@Query("key") key: String, @Query("q") location: String, @Query("lang") lang: String = "ru"): Observable<Weather>

    @GET("v1/current.json")
    fun getForecastdayWeather(@Query("key") key: String, @Query("q") location: String, @Query("days") days: Int, @Query("lang") lang: String = "ru"): Observable<ResponseForecast>

}