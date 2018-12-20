package com.zlobrynya.testkotlin.jacksonClass.forecast

import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import com.fasterxml.jackson.annotation.JsonInclude
import com.zlobrynya.testkotlin.jacksonClass.Condition

//auto generated http://www.jsonschema2pojo.org/

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
    "maxtemp_c",
    "maxtemp_f",
    "mintemp_c",
    "mintemp_f",
    "avgtemp_c",
    "avgtemp_f",
    "maxwind_mph",
    "maxwind_kph",
    "totalprecip_mm",
    "totalprecip_in",
    "avgvis_km",
    "avgvis_miles",
    "avghumidity",
    "condition",
    "uv"
)
class Day {

    @JsonProperty("maxtemp_c")
    @get:JsonProperty("maxtemp_c")
    @set:JsonProperty("maxtemp_c")
    var maxtempC: Double = 0.toDouble()
    @JsonProperty("maxtemp_f")
    @get:JsonProperty("maxtemp_f")
    @set:JsonProperty("maxtemp_f")
    var maxtempF: Double = 0.toDouble()
    @JsonProperty("mintemp_c")
    @get:JsonProperty("mintemp_c")
    @set:JsonProperty("mintemp_c")
    var mintempC: Double = 0.toDouble()
    @JsonProperty("mintemp_f")
    @get:JsonProperty("mintemp_f")
    @set:JsonProperty("mintemp_f")
    var mintempF: Double = 0.toDouble()
    @JsonProperty("avgtemp_c")
    @get:JsonProperty("avgtemp_c")
    @set:JsonProperty("avgtemp_c")
    var avgtempC: Double = 0.toDouble()
    @JsonProperty("avgtemp_f")
    @get:JsonProperty("avgtemp_f")
    @set:JsonProperty("avgtemp_f")
    var avgtempF: Double = 0.toDouble()
    @JsonProperty("maxwind_mph")
    @get:JsonProperty("maxwind_mph")
    @set:JsonProperty("maxwind_mph")
    var maxwindMph: Double = 0.toDouble()
    @JsonProperty("maxwind_kph")
    @get:JsonProperty("maxwind_kph")
    @set:JsonProperty("maxwind_kph")
    var maxwindKph: Double = 0.toDouble()
    @JsonProperty("totalprecip_mm")
    @get:JsonProperty("totalprecip_mm")
    @set:JsonProperty("totalprecip_mm")
    var totalprecipMm: Double = 0.toDouble()
    @JsonProperty("totalprecip_in")
    @get:JsonProperty("totalprecip_in")
    @set:JsonProperty("totalprecip_in")
    var totalprecipIn: Double = 0.toDouble()
    @JsonProperty("avgvis_km")
    @get:JsonProperty("avgvis_km")
    @set:JsonProperty("avgvis_km")
    var avgvisKm: Double = 0.toDouble()
    @JsonProperty("avgvis_miles")
    @get:JsonProperty("avgvis_miles")
    @set:JsonProperty("avgvis_miles")
    var avgvisMiles: Double = 0.toDouble()
    @JsonProperty("avghumidity")
    @get:JsonProperty("avghumidity")
    @set:JsonProperty("avghumidity")
    var avghumidity: Double = 0.toDouble()
    @JsonProperty("condition")
    @get:JsonProperty("condition")
    @set:JsonProperty("condition")
    var condition: Condition? = null
    @JsonProperty("uv")
    @get:JsonProperty("uv")
    @set:JsonProperty("uv")
    var uv: Double = 0.toDouble()
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