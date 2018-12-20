package com.zlobrynya.testkotlin.jacksonClass.forecast

import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import com.fasterxml.jackson.annotation.JsonInclude

//auto generated http://www.jsonschema2pojo.org/


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("sunrise", "sunset", "moonrise", "moonset")
class Astro {

    @JsonProperty("sunrise")
    @get:JsonProperty("sunrise")
    @set:JsonProperty("sunrise")
    var sunrise: String? = null
    @JsonProperty("sunset")
    @get:JsonProperty("sunset")
    @set:JsonProperty("sunset")
    var sunset: String? = null
    @JsonProperty("moonrise")
    @get:JsonProperty("moonrise")
    @set:JsonProperty("moonrise")
    var moonrise: String? = null
    @JsonProperty("moonset")
    @get:JsonProperty("moonset")
    @set:JsonProperty("moonset")
    var moonset: String? = null
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