package com.zlobrynya.testkotlin.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import com.zlobrynya.testkotlin.R
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View

import android.view.ViewGroup
import android.widget.TextView
import com.zlobrynya.testkotlin.jacksonClass.current.Current
import com.zlobrynya.testkotlin.rxbus.RxBus
import com.zlobrynya.testkotlin.rxbus.RxEvent
import io.reactivex.disposables.Disposable

// Цельсия \u2103
// Фарингейт \u2109

class FragmentCurrentWeather @SuppressLint("ValidFragment")
private constructor(): Fragment() {
    private lateinit var v: View
    private var disposable: Disposable? = null
    private lateinit var location: TextView
    private lateinit var condition: TextView
    private lateinit var temperature: TextView
    private lateinit var fellslike: TextView
    private lateinit var wind: TextView
    private lateinit var windDesignation: TextView
    private lateinit var windDerection: TextView
    private lateinit var pressure: TextView
    private lateinit var pressureDesignation: TextView
    private lateinit var precipitation: TextView
    private lateinit var precipitationDesignation: TextView
    private lateinit var humidity: TextView
    private lateinit var overcast: TextView

    private var bSI = true;

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        v = inflater.inflate(R.layout.fragment_current,null)
        location = v.findViewById(R.id.location) as TextView
        condition = v.findViewById(R.id.condition) as TextView
        temperature = v.findViewById(R.id.temperature) as TextView
        fellslike = v.findViewById(R.id.fellslike) as TextView
        wind = v.findViewById(R.id.wind_value) as TextView
        windDesignation = v.findViewById(R.id.wind_designation) as TextView
        windDerection = v.findViewById(R.id.wind_derection) as TextView
        pressure = v.findViewById(R.id.pressure_value) as TextView
        precipitation = v.findViewById(R.id.precipitation) as TextView
        pressureDesignation = v.findViewById(R.id.pressure_designation) as TextView
        precipitationDesignation = v.findViewById(R.id.precipitation_designation) as TextView
        humidity = v.findViewById(R.id.humidity) as TextView
        overcast = v.findViewById(R.id.overcast) as TextView

        disposable = RxBus.listen(RxEvent.EventForecastWeather::class.java).subscribe({
            println("Testing")
            setTextView(it.responseForecast.current!!)
        })
        return v
    }

    @SuppressLint("SetTextI18n")
    fun setTextView(current: Current){
        condition.text = current.condition?.text
        windDerection.text = current.windDir.toString()
        humidity.text = current.humidity.toString()
        overcast.text = current.cloud.toString()
        location.text = "Петрозаводск"
        if (bSI){
            temperature.text = current.tempC.toString() + " \u2103"
            fellslike.text = current.feelslikeC.toString() + " \u2103"
            pressure.text = current.pressureMb.toString()
            precipitation.text = current.precipMm.toString()
            wind.text = current.windKph.toString()
            windDesignation.text = getString(R.string.km_h)
            pressureDesignation.text = getString(R.string.mb)
            precipitationDesignation.text = getString(R.string.mm)
        }else{
            temperature.text = current.tempF.toString() + " \u2109"
            fellslike.text = current.feelslikeF.toString() + " \u2109"
            pressure.text = current.precipIn.toString()
            precipitation.text = current.precipIn.toString()
            wind.text = current.windMph.toString()
            windDesignation.text = getString(R.string.mp_h)
            precipitationDesignation.text = getString(R.string.`in`)
            pressureDesignation.text = getString(R.string.`in`)

        }
    }

    companion object {
        fun newInstance(): Fragment{
            val fragment = FragmentCurrentWeather()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }
}