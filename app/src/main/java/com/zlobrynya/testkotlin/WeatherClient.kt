package com.zlobrynya.testkotlin

import com.zlobrynya.testkotlin.jacksonClass.ResponseForecast
import com.zlobrynya.testkotlin.jacksonClass.Weather
import io.reactivex.Observable
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.jackson.JacksonConverterFactory

class WeatherClient private constructor() {
    val GITHUB_BASE_URL = "https://api.apixu.com/"
    private var getRequest: GetRequest? = null

    init {
        //val gson = GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create()

        val retrofit = Retrofit.Builder().baseUrl(GITHUB_BASE_URL)
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(JacksonConverterFactory.create())
            .build()
        getRequest = retrofit.create(GetRequest::class.java)
    }

    fun getStarredRepos(key: String, loc: String = "", day: Int): Observable<ResponseForecast>? {
        return getRequest?.getForecastdayWeather(key, loc, day)
    }

    companion object {
        private var instance: WeatherClient? = null
        fun getInstance(): WeatherClient{
            if (instance == null)
                instance = WeatherClient()
            return instance as WeatherClient
        }
    }
}