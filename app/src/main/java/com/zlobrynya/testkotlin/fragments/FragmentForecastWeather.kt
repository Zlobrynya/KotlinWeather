package com.zlobrynya.testkotlin.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import com.zlobrynya.testkotlin.R
import com.zlobrynya.testkotlin.adapter.AdapterForecastWeather
import com.zlobrynya.testkotlin.jacksonClass.forecast.Forecastday
import com.zlobrynya.testkotlin.rxbus.RxBus
import com.zlobrynya.testkotlin.rxbus.RxEvent
import io.reactivex.disposables.Disposable

class FragmentForecastWeather @SuppressLint("ValidFragment")
private constructor(): Fragment() {
    private var v: View? = null
    private var disposable: Disposable? = null
    private lateinit var adapterForecastWeather: AdapterForecastWeather

    override fun onCreate(savedInstanceState: Bundle?) = super.onCreate(savedInstanceState)

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        v = inflater.inflate(R.layout.fragment_forecast,null)
        val listView = v!!.findViewById(R.id.forecast_list_view) as ListView
        adapterForecastWeather = AdapterForecastWeather(context,R.id.forecast_list_view)
        listView.adapter = adapterForecastWeather

        disposable = RxBus.listen(RxEvent.EventForecastWeather::class.java).subscribe({
            println(it.responseForecast.forecast?.forecastday)
            //setTextView(it.responseForecast.current!!)
            adapterForecastWeather.addAll(it.responseForecast.forecast!!.forecastday)
            adapterForecastWeather.notifyDataSetChanged()
        })

        listView.setOnItemClickListener  { parent, view, position, id ->
            val forecastWeather = adapterForecastWeather.getItem(position)
            forecastWeather.visibility = !forecastWeather.visibility
            adapterForecastWeather.notifyDataSetChanged()
        }

        return v
    }


    companion object {
        fun newInstance(): Fragment{
            val fragment = FragmentForecastWeather()
            val args = Bundle()
            fragment.setArguments(args);
            return fragment;
        }
    }
}