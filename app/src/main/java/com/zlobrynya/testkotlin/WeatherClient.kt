package com.zlobrynya.testkotlin

import com.google.gson.FieldNamingPolicy
import com.google.gson.GsonBuilder
import com.zlobrynya.testkotlin.jacksonClass.current.Weather
import retrofit2.Retrofit
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import retrofit2.converter.jackson.JacksonConverterFactory
import rx.Observable

class WeatherClient private constructor() {
    val GITHUB_BASE_URL = "https://api.apixu.com/" //https://api.github.com/users/{user}/starred
    private var getRequest: GetRequest? = null

    init {
        val gson = GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create()

        val retrofit = Retrofit.Builder().baseUrl(GITHUB_BASE_URL)
            .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
            .addConverterFactory(JacksonConverterFactory.create())
            .build()
        getRequest = retrofit.create(GetRequest::class.java)
    }

    fun getStarredRepos(key: String, loc: String = ""): Observable<Weather>? {
        return getRequest?.getCurrentWeather(key,loc)
    }

    //???????????????????????????????? --->  companion
    companion object {
        private var instance: WeatherClient? = null
        fun getInstance(): WeatherClient{
            if (instance == null)
                instance = WeatherClient()
            return instance as WeatherClient
        }
    }
}