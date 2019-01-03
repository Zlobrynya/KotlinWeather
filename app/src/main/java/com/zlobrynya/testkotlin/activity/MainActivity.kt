package com.zlobrynya.testkotlin.activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.zlobrynya.testkotlin.R
import com.zlobrynya.testkotlin.rxbus.RxBus
import com.zlobrynya.testkotlin.WeatherClient
import com.zlobrynya.testkotlin.jacksonClass.ResponseForecast
import com.zlobrynya.testkotlin.rxbus.RxEvent
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.Observer
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

//   www.apixu.com/doc/current.aspx

class MainActivity : AppCompatActivity() {
    private var disposable: Disposable? = null
    lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.textView) as TextView
    }

    fun OnClick(view :View){
        val activity : Intent = Intent(this, WeatherActiviry::class.java)
        startActivity(activity)
        getStarredRepos("fca70d378f7b4068bcf161344181912", "Petrozavodsk",7)
    }

    override fun onDestroy() {

        super.onDestroy()
    }

    private fun getStarredRepos(key: String, loc: String = "", day: Int) {
        /*subscription = WeatherClient.getInstance()
            .getStarredRepos(key, loc)?.subscribe(object : Observer<Weather> {
                override fun onError(e: Throwable?) {
                    e?.fillInStackTrace()
                    println(e.toString())
                }

                override fun onNext(t: Weather?) {
                    println(t!!.location!!.country)
                    RxBus.send(RxEvent.EventForecastWeather(t.current!!))
                }

                override fun onCompleted() {
                    println("Complited")
                }
            })
        subscription = WeatherClient.getInstance().getStarredRepos(key,loc)?.subscribeOn(Schedulers.newThread())
        ?.observeOn(AndroidSchedulers.mainThread())?.subscribe(object : Observer<Weather> {

            })*/
        WeatherClient.getInstance().getStarredRepos(key,loc,day)?.subscribeOn(Schedulers.io())
            ?.observeOn(AndroidSchedulers.mainThread())?.subscribe(object : Observer<ResponseForecast>{
                override fun onComplete() {

                }

                override fun onSubscribe(d: Disposable) {

                }

                override fun onNext(t: ResponseForecast) {
                    RxBus.send(RxEvent.EventForecastWeather(t))
                }

                override fun onError(e: Throwable) {
                    println(e.toString())
                }

            })
    }
}

