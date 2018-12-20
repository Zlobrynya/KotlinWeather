package com.zlobrynya.testkotlin.jacksonClass.current

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.zlobrynya.testkotlin.jacksonClass.Current
import com.zlobrynya.testkotlin.jacksonClass.Location

//auto generated http://www.jsonschema2pojo.org/


class Weather(){

    @SerializedName("location")
    @Expose
    var location: Location? = null
    @SerializedName("current")
    @Expose
    var current: Current? = null
}