package com.zlobrynya.testkotlin.jacksonClass

import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import com.fasterxml.jackson.annotation.JsonInclude
//auto generated http://www.jsonschema2pojo.org/


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("text", "icon", "code")
class Condition {

    @JsonProperty("text")
    @get:JsonProperty("text")
    @set:JsonProperty("text")
    var text: String? = null
    @JsonProperty("icon")
    @get:JsonProperty("icon")
    @set:JsonProperty("icon")
    var icon: String? = null
    @JsonProperty("code")
    @get:JsonProperty("code")
    @set:JsonProperty("code")
    var code: Long = 0
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