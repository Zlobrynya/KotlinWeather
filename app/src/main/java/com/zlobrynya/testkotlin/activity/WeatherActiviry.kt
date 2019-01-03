package com.zlobrynya.testkotlin.activity

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import com.zlobrynya.testkotlin.R
import com.zlobrynya.testkotlin.fragments.FragmentCurrentWeather
import com.zlobrynya.testkotlin.fragments.FragmentForecastWeather

@SuppressLint("Registered")
class   WeatherActiviry : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weather)
        //textView = findViewById(R.id.textView) as TextView
        val pageView  = findViewById(R.id.view_pager) as ViewPager
        val adapter = AdapterPageView(supportFragmentManager,2)
        pageView.adapter = adapter
    }


    class AdapterPageView(val gm: FragmentManager, val countF: Int): FragmentPagerAdapter(gm) {
        override fun getItem(position: Int): Fragment? {
            when(position){
                0 -> return FragmentCurrentWeather.newInstance()
                1 -> return FragmentForecastWeather.newInstance()
            }
            return Fragment::class.java.newInstance()
            //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun getCount(): Int = countF



    }

}