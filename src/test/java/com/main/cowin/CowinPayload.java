
package com.main.cowin;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "centers"
})

public class CowinPayload {

    @JsonProperty("centers")
    private List<Center> centers = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public CowinPayload() {
    }

    /**
     * 
     * @param centers
     */
    public CowinPayload(List<Center> centers) {
        super();
        this.centers = centers;
    }

    @JsonProperty("centers")
    public List<Center> getCenters() {
        return centers;
    }

    @JsonProperty("centers")
    public void setCenters(List<Center> centers) {
        this.centers = centers;
    }

}
