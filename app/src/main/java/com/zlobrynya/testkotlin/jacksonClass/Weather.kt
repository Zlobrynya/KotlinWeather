package com.zlobrynya.testkotlin.jacksonClass

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.zlobrynya.testkotlin.jacksonClass.current.Current
import com.zlobrynya.testkotlin.jacksonClass.current.Location

//auto generated http://www.jsonschema2pojo.org/


class Weather(): Any() {

    @SerializedName("location")
    @Expose
    var location: Location? = null
    @SerializedName("current")
    @Expose
    var current: Current? = null
}