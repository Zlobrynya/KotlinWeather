package com.zlobrynya.testkotlin.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.text.format.DateFormat
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.zlobrynya.testkotlin.R
import com.zlobrynya.testkotlin.jacksonClass.forecast.Forecastday
import java.text.SimpleDateFormat

class AdapterForecastWeather(context: Context?, resource: Int) :
    ArrayAdapter<Forecastday>(context, resource) {

    class Holder{
        var data: TextView? = null
        var day: TextView? = null
        var tempMin: TextView? = null
        var tempMax: TextView?  = null
    }

    @SuppressLint("SetTextI18n", "SimpleDateFormat")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view = convertView
        var holder = Holder()
        if (view != null){
            holder = view.tag as Holder
        }else{
            val vi = getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            view = vi.inflate(R.layout.item_list_view, null)
            holder.data = view.findViewById(R.id.item_data)
            holder.day = view.findViewById(R.id.item_day)
            holder.tempMin = view.findViewById(R.id.item_min_temperature)
            holder.tempMax = view.findViewById(R.id.item_max_temperature)
            view.tag = holder
        }
        val forecastWeather = getItem(position)
        //Разобраться с ДАТОЙ
        var day = DateFormat.format("EEEE", SimpleDateFormat("dd-MM-yyyy").parse(forecastWeather.date)) as String
        when(position){
            0 -> day = context.getString(R.string.today)
            1 -> day = context.getString(R.string.tomorrow)
        }

        holder.day!!.setText(day)
        holder.data!!.setText(forecastWeather.date)
        holder.tempMin!!.setText(forecastWeather.day!!.mintempC.toString() + " \u2103")
        holder.tempMax!!.setText(forecastWeather.day!!.maxtempC.toString() + " \u2103")
        return view!!
    }
}