
package com.swagger.model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "NewConfirmed",
    "TotalConfirmed",
    "NewDeaths",
    "TotalDeaths",
    "NewRecovered",
    "TotalRecovered"
})
@Generated("jsonschema2pojo")
public class Global__1 {

    @JsonProperty("NewConfirmed")
    private int newConfirmed;
    @JsonProperty("TotalConfirmed")
    private int totalConfirmed;
    @JsonProperty("NewDeaths")
    private int newDeaths;
    @JsonProperty("TotalDeaths")
    private int totalDeaths;
    @JsonProperty("NewRecovered")
    private int newRecovered;
    @JsonProperty("TotalRecovered")
    private int totalRecovered;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("NewConfirmed")
    public int getNewConfirmed() {
        return newConfirmed;
    }

    @JsonProperty("NewConfirmed")
    public void setNewConfirmed(int newConfirmed) {
        this.newConfirmed = newConfirmed;
    }

    @JsonProperty("TotalConfirmed")
    public int getTotalConfirmed() {
        return totalConfirmed;
    }

    @JsonProperty("TotalConfirmed")
    public void setTotalConfirmed(int totalConfirmed) {
        this.totalConfirmed = totalConfirmed;
    }

    @JsonProperty("NewDeaths")
    public int getNewDeaths() {
        return newDeaths;
    }

    @JsonProperty("NewDeaths")
    public void setNewDeaths(int newDeaths) {
        this.newDeaths = newDeaths;
    }

    @JsonProperty("TotalDeaths")
    public int getTotalDeaths() {
        return totalDeaths;
    }

    @JsonProperty("TotalDeaths")
    public void setTotalDeaths(int totalDeaths) {
        this.totalDeaths = totalDeaths;
    }

    @JsonProperty("NewRecovered")
    public int getNewRecovered() {
        return newRecovered;
    }

    @JsonProperty("NewRecovered")
    public void setNewRecovered(int newRecovered) {
        this.newRecovered = newRecovered;
    }

    @JsonProperty("TotalRecovered")
    public int getTotalRecovered() {
        return totalRecovered;
    }

    @JsonProperty("TotalRecovered")
    public void setTotalRecovered(int totalRecovered) {
        this.totalRecovered = totalRecovered;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Global__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("newConfirmed");
        sb.append('=');
        sb.append(this.newConfirmed);
        sb.append(',');
        sb.append("totalConfirmed");
        sb.append('=');
        sb.append(this.totalConfirmed);
        sb.append(',');
        sb.append("newDeaths");
        sb.append('=');
        sb.append(this.newDeaths);
        sb.append(',');
        sb.append("totalDeaths");
        sb.append('=');
        sb.append(this.totalDeaths);
        sb.append(',');
        sb.append("newRecovered");
        sb.append('=');
        sb.append(this.newRecovered);
        sb.append(',');
        sb.append("totalRecovered");
        sb.append('=');
        sb.append(this.totalRecovered);
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
