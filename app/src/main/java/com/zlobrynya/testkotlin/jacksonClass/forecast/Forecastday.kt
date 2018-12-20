package com.zlobrynya.testkotlin.jacksonClass.forecast

import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import com.fasterxml.jackson.annotation.JsonInclude

//auto generated http://www.jsonschema2pojo.org/

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("date", "date_epoch", "day", "astro")
class Forecastday {

    @JsonProperty("date")
    @get:JsonProperty("date")
    @set:JsonProperty("date")
    var date: String? = null
    @JsonProperty("date_epoch")
    @get:JsonProperty("date_epoch")
    @set:JsonProperty("date_epoch")
    var dateEpoch: Long = 0
    @JsonProperty("day")
    @get:JsonProperty("day")
    @set:JsonProperty("day")
    var day: Day? = null
    @JsonProperty("astro")
    @get:JsonProperty("astro")
    @set:JsonProperty("astro")
    var astro: Astro? = null
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