
package com.main.cowin;

import java.util.List;

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
    private Integer availableCapacityDose1;
    @JsonProperty("available_capacity_dose2")
    private Integer availableCapacityDose2;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Session() {
    }

    /**
     * 
     * @param date
     * @param availableCapacity
     * @param minAgeLimit
     * @param availableCapacityDose1
     * @param vaccine
     * @param slots
     * @param availableCapacityDose2
     * @param sessionId
     */
    public Session(String sessionId, String date, Integer availableCapacity, Integer minAgeLimit, String vaccine, List<String> slots, Integer availableCapacityDose1, Integer availableCapacityDose2) {
        super();
        this.sessionId = sessionId;
        this.date = date;
        this.availableCapacity = availableCapacity;
        this.minAgeLimit = minAgeLimit;
        this.vaccine = vaccine;
        this.slots = slots;
        this.availableCapacityDose1 = availableCapacityDose1;
        this.availableCapacityDose2 = availableCapacityDose2;
    }

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
    public void setAvailableCapacity(int
            availableCapacity) {
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

}
