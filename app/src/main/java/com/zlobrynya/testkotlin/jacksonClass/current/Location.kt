package com.zlobrynya.testkotlin.jacksonClass.current

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import com.fasterxml.jackson.annotation.JsonInclude

//auto generated http://www.jsonschema2pojo.org/

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("name", "region", "country", "lat", "lon", "tz_id", "localtime_epoch", "localtime")
class Location {

    @JsonProperty("name")
    @get:JsonProperty("name")
    @set:JsonProperty("name")
    var name: String? = null
    @JsonProperty("region")
    @get:JsonProperty("region")
    @set:JsonProperty("region")
    var region: String? = null
    @JsonProperty("country")
    @get:JsonProperty("country")
    @set:JsonProperty("country")
    var country: String? = null
    @JsonProperty("lat")
    @get:JsonProperty("lat")
    @set:JsonProperty("lat")
    var lat: Double = 0.toDouble()
    @JsonProperty("lon")
    @get:JsonProperty("lon")
    @set:JsonProperty("lon")
    var lon: Double = 0.toDouble()
    @JsonProperty("tz_id")
    @get:JsonProperty("tz_id")
    @set:JsonProperty("tz_id")
    var tzId: String? = null
    @JsonProperty("localtime_epoch")
    @get:JsonProperty("localtime_epoch")
    @set:JsonProperty("localtime_epoch")
    var localtimeEpoch: Long = 0
    @JsonProperty("localtime")
    @get:JsonProperty("localtime")
    @set:JsonProperty("localtime")
    var localtime: String? = null
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