package com.zlobrynya.testkotlin.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.zlobrynya.testkotlin.R
import com.zlobrynya.testkotlin.jacksonClass.forecast.Forecastday

class AdapterForecastWeather(context: Context?, resource: Int) :
    ArrayAdapter<Forecastday>(context, resource) {

    class Holder{
        var data: TextView? = null
        var tempMin: TextView? = null
        var tempMax: TextView?  = null
    }

    @SuppressLint("SetTextI18n")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view = convertView
        var holder = Holder()
        if (view != null){
            holder = view.tag as Holder
        }else{
            val vi = getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            view = vi.inflate(R.layout.item_list_view, null)
            holder.data = view.findViewById(R.id.item_data)
            holder.tempMin = view.findViewById(R.id.item_min_temperature)
            holder.tempMax = view.findViewById(R.id.item_max_temperature)
            view.tag = holder
        }
        val forecastWeather = getItem(position)
        holder.data!!.setText(forecastWeather.date.toString())
        holder.tempMin!!.setText(forecastWeather.day!!.mintempC.toString() + "\u2103")
        holder.tempMax!!.setText(forecastWeather.day!!.maxtempC.toString() + "\u2103")
        return view!!
    }
}