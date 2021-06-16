
package com.swagger.model;

import java.util.HashMap;
import java.util.List;
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
    "session_id",
    "date",
    "available_capacity",
    "min_age_limit",
    "vaccine",
    "slots",
    "available_capacity_dose1",
    "available_capacity_dose2"
})
@Generated("jsonschema2pojo")
public class Session {

    @JsonProperty("session_id")
    private String sessionId;
    @JsonProperty("date")
    private String date;
    @JsonProperty("available_capacity")
    private int availableCapacity;
    @JsonProperty("min_age_limit")
    private int minAgeLimit;
    @JsonProperty("vaccine")
    private String vaccine;
    @JsonProperty("slots")
    private List<String> slots = null;
    @JsonProperty("available_capacity_dose1")
    private int availableCapacityDose1;
    @JsonProperty("available_capacity_dose2")
    private int availableCapacityDose2;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("session_id")
    public String getSessionId() {
        return sessionId;
    }

    @JsonProperty("session_id")
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    @JsonProperty("available_capacity")
    public int getAvailableCapacity() {
        return availableCapacity;
    }

    @JsonProperty("available_capacity")
    public void setAvailableCapacity(int availableCapacity) {
        this.availableCapacity = availableCapacity;
    }

    @JsonProperty("min_age_limit")
    public int getMinAgeLimit() {
        return minAgeLimit;
    }

    @JsonProperty("min_age_limit")
    public void setMinAgeLimit(int minAgeLimit) {
        this.minAgeLimit = minAgeLimit;
    }

    @JsonProperty("vaccine")
    public String getVaccine() {
        return vaccine;
    }

    @JsonProperty("vaccine")
    public void setVaccine(String vaccine) {
        this.vaccine = vaccine;
    }

    @JsonProperty("slots")
    public List<String> getSlots() {
        return slots;
    }

    @JsonProperty("slots")
    public void setSlots(List<String> slots) {
        this.slots = slots;
    }

    @JsonProperty("available_capacity_dose1")
    public int getAvailableCapacityDose1() {
        return availableCapacityDose1;
    }

    @JsonProperty("available_capacity_dose1")
    public void setAvailableCapacityDose1(int availableCapacityDose1) {
        this.availableCapacityDose1 = availableCapacityDose1;
    }

    @JsonProperty("available_capacity_dose2")
    public int getAvailableCapacityDose2() {
        return availableCapacityDose2;
    }

    @JsonProperty("available_capacity_dose2")
    public void setAvailableCapacityDose2(int availableCapacityDose2) {
        this.availableCapacityDose2 = availableCapacityDose2;
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
        sb.append(Session.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sessionId");
        sb.append('=');
        sb.append(((this.sessionId == null)?"<null>":this.sessionId));
        sb.append(',');
        sb.append("date");
        sb.append('=');
        sb.append(((this.date == null)?"<null>":this.date));
        sb.append(',');
        sb.append("availableCapacity");
        sb.append('=');
        sb.append(this.availableCapacity);
        sb.append(',');
        sb.append("minAgeLimit");
        sb.append('=');
        sb.append(this.minAgeLimit);
        sb.append(',');
        sb.append("vaccine");
        sb.append('=');
        sb.append(((this.vaccine == null)?"<null>":this.vaccine));
        sb.append(',');
        sb.append("slots");
        sb.append('=');
        sb.append(((this.slots == null)?"<null>":this.slots));
        sb.append(',');
        sb.append("availableCapacityDose1");
        sb.append('=');
        sb.append(this.availableCapacityDose1);
        sb.append(',');
        sb.append("availableCapacityDose2");
        sb.append('=');
        sb.append(this.availableCapacityDose2);
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
