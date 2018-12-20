package com.zlobrynya.testkotlin.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.zlobrynya.testkotlin.R
import com.zlobrynya.testkotlin.WeatherClient
import com.zlobrynya.testkotlin.jacksonClass.current.Weather
import rx.Observer
import rx.Subscription
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers

//https://darksky.net/dev/account
//61.79,34.39/
//b90f6a39e440417da359ad73549ae4d2
//https://api.darksky.net/forecast/b90f6a39e440417da359ad73549ae4d2/61.79,34.39/?units=si&lang=ru

class MainActivity : AppCompatActivity() {
    private var subscription: Subscription? = null
    lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.textView) as TextView
    }

    fun OnClick(view :View){
        getStarredRepos("fca70d378f7b4068bcf161344181912", "Petrozavodsk")
    }

    override fun onDestroy() {
        if (subscription != null && !subscription!!.isUnsubscribed()) {
            subscription!!.unsubscribe()
        }
        super.onDestroy()
    }

    private fun getStarredRepos(key: String, loc: String = "") {
        subscription = WeatherClient.getInstance()
            .getStarredRepos(key, loc)?.subscribeOn(Schedulers.io())
            ?.observeOn(AndroidSchedulers.mainThread())
            ?.subscribe(object : Observer<Weather> {
                override fun onError(e: Throwable?) {
                    e?.fillInStackTrace()
                    println(e.toString())
                }

                override fun onNext(t: Weather?) {
                    println(t?.location?.name)
                }

                override fun onCompleted() {
                    println("Complited")
                }
            })
    }
}
