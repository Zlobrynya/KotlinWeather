package com.zlobrynya.testkotlin.jacksonClass.forecast

import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import com.fasterxml.jackson.annotation.JsonInclude
import com.zlobrynya.testkotlin.jacksonClass.Current
import com.zlobrynya.testkotlin.jacksonClass.Location

//auto generated http://www.jsonschema2pojo.org/

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("location", "current", "forecast")
class ResponseForecast {

    @JsonProperty("location")
    @get:JsonProperty("location")
    @set:JsonProperty("location")
    var location: Location? = null
    @JsonProperty("current")
    @get:JsonProperty("current")
    @set:JsonProperty("current")
    var current: Current? = null
    @JsonProperty("forecast")
    @get:JsonProperty("forecast")
    @set:JsonProperty("forecast")
    var forecast: Forecast? = null
    @JsonIgnore
    private val additionalProperties = HashMap<String, Any>()

    @JsonAnyGetter
    fun getAdditionalProperties(): Map<String, Any> {
        return this.additionalProperties
    }

    @JsonAnySetter
    fun setAdditionalProperty(name: String, value: Any) {
        this.additionalProperties[name] = value
    }

}