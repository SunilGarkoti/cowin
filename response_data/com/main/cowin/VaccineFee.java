
package com.main.cowin;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "vaccine",
    "fee"
})

public class VaccineFee {

    @JsonProperty("vaccine")
    private String vaccine;
    @JsonProperty("fee")
    private String fee;

    /**
     * No args constructor for use in serialization
     * 
     */
    public VaccineFee() {
    }

    /**
     * 
     * @param vaccine
     * @param fee
     */
    public VaccineFee(String vaccine, String fee) {
        super();
        this.vaccine = vaccine;
        this.fee = fee;
    }

    @JsonProperty("vaccine")
    public String getVaccine() {
        return vaccine;
    }

    @JsonProperty("vaccine")
    public void setVaccine(String vaccine) {
        this.vaccine = vaccine;
    }

    @JsonProperty("fee")
    public String getFee() {
        return fee;
    }

    @JsonProperty("fee")
    public void setFee(String fee) {
        this.fee = fee;
    }

}
