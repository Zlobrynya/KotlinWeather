package com.zlobrynya.testkotlin.jacksonClass.current


import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import com.fasterxml.jackson.annotation.JsonInclude
import com.zlobrynya.testkotlin.jacksonClass.current.Condition

//auto generated http://www.jsonschema2pojo.org/

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
    "last_updated_epoch",
    "last_updated",
    "temp_c",
    "temp_f",
    "is_day",
    "condition",
    "wind_mph",
    "wind_kph",
    "wind_degree",
    "wind_dir",
    "pressure_mb",
    "pressure_in",
    "precip_mm",
    "precip_in",
    "humidity",
    "cloud",
    "feelslike_c",
    "feelslike_f",
    "vis_km",
    "vis_miles",
    "uv"
)
class Current: Any() {

    @JsonProperty("last_updated_epoch")
    @get:JsonProperty("last_updated_epoch")
    @set:JsonProperty("last_updated_epoch")
    var lastUpdatedEpoch: Long = 0
    @JsonProperty("last_updated")
    @get:JsonProperty("last_updated")
    @set:JsonProperty("last_updated")
    var lastUpdated: String? = null
    @JsonProperty("temp_c")
    @get:JsonProperty("temp_c")
    @set:JsonProperty("temp_c")
    var tempC: Double = 0.toDouble()
    @JsonProperty("temp_f")
    @get:JsonProperty("temp_f")
    @set:JsonProperty("temp_f")
    var tempF: Double = 0.toDouble()
    @JsonProperty("is_day")
    @get:JsonProperty("is_day")
    @set:JsonProperty("is_day")
    var isDay: Long = 0
    @JsonProperty("condition")
    @get:JsonProperty("condition")
    @set:JsonProperty("condition")
    var condition: Condition? = null
    @JsonProperty("wind_mph")
    @get:JsonProperty("wind_mph")
    @set:JsonProperty("wind_mph")
    var windMph: Double = 0.toDouble()
    @JsonProperty("wind_kph")
    @get:JsonProperty("wind_kph")
    @set:JsonProperty("wind_kph")
    var windKph: Double = 0.toDouble()
    @JsonProperty("wind_degree")
    @get:JsonProperty("wind_degree")
    @set:JsonProperty("wind_degree")
    var windDegree: Long = 0
    @JsonProperty("wind_dir")
    @get:JsonProperty("wind_dir")
    @set:JsonProperty("wind_dir")
    var windDir: String? = null
    @JsonProperty("pressure_mb")
    @get:JsonProperty("pressure_mb")
    @set:JsonProperty("pressure_mb")
    var pressureMb: Double = 0.toDouble()
    @JsonProperty("pressure_in")
    @get:JsonProperty("pressure_in")
    @set:JsonProperty("pressure_in")
    var pressureIn: Double = 0.toDouble()
    @JsonProperty("precip_mm")
    @get:JsonProperty("precip_mm")
    @set:JsonProperty("precip_mm")
    var precipMm: Double = 0.toDouble()
    @JsonProperty("precip_in")
    @get:JsonProperty("precip_in")
    @set:JsonProperty("precip_in")
    var precipIn: Double = 0.toDouble()
    @JsonProperty("humidity")
    @get:JsonProperty("humidity")
    @set:JsonProperty("humidity")
    var humidity: Long = 0
    @JsonProperty("cloud")
    @get:JsonProperty("cloud")
    @set:JsonProperty("cloud")
    var cloud: Long = 0
    @JsonProperty("feelslike_c")
    @get:JsonProperty("feelslike_c")
    @set:JsonProperty("feelslike_c")
    var feelslikeC: Double = 0.toDouble()
    @JsonProperty("feelslike_f")
    @get:JsonProperty("feelslike_f")
    @set:JsonProperty("feelslike_f")
    var feelslikeF: Double = 0.toDouble()
    @JsonProperty("vis_km")
    @get:JsonProperty("vis_km")
    @set:JsonProperty("vis_km")
    var visKm: Double = 0.toDouble()
    @JsonProperty("vis_miles")
    @get:JsonProperty("vis_miles")
    @set:JsonProperty("vis_miles")
    var visMiles: Double = 0.toDouble()
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