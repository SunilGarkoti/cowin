
package com.main.cowin;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "center_id",
    "name",
    "address",
    "state_name",
    "district_name",
    "block_name",
    "pincode",
    "lat",
    "long",
    "from",
    "to",
    "fee_type",
    "sessions",
    "vaccine_fees"
})

public class Center {

    @JsonProperty("center_id")
    private Integer centerId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("address")
    private String address;
    @JsonProperty("state_name")
    private String stateName;
    @JsonProperty("district_name")
    private String districtName;
    @JsonProperty("block_name")
    private String blockName;
    @JsonProperty("pincode")
    private Integer pincode;
    @JsonProperty("lat")
    private Integer lat;
    @JsonProperty("long")
    private Integer _long;
    @JsonProperty("from")
    private String from;
    @JsonProperty("to")
    private String to;
    @JsonProperty("fee_type")
    private String feeType;
    @JsonProperty("sessions")
    private List<Session> sessions = null;
    @JsonProperty("vaccine_fees")
    private List<VaccineFee> vaccineFees = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Center() {
    }

    /**
     * 
     * @param centerId
     * @param pincode
     * @param sessions
     * @param address
     * @param districtName
     * @param blockName
     * @param feeType
     * @param stateName
     * @param _long
     * @param name
     * @param from
     * @param to
     * @param lat
     * @param vaccineFees
     */
    public Center(Integer centerId, String name, String address, String stateName, String districtName, String blockName, Integer pincode, Integer lat, Integer _long, String from, String to, String feeType, List<Session> sessions, List<VaccineFee> vaccineFees) {
        super();
        this.centerId = centerId;
        this.name = name;
        this.address = address;
        this.stateName = stateName;
        this.districtName = districtName;
        this.blockName = blockName;
        this.pincode = pincode;
        this.lat = lat;
        this._long = _long;
        this.from = from;
        this.to = to;
        this.feeType = feeType;
        this.sessions = sessions;
        this.vaccineFees = vaccineFees;
    }

    @JsonProperty("center_id")
    public Integer getCenterId() {
        return centerId;
    }

    @JsonProperty("center_id")
    public void setCenterId(Integer centerId) {
        this.centerId = centerId;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("address")
    public String getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(String address) {
        this.address = address;
    }

    @JsonProperty("state_name")
    public String getStateName() {
        return stateName;
    }

    @JsonProperty("state_name")
    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    @JsonProperty("district_name")
    public String getDistrictName() {
        return districtName;
    }

    @JsonProperty("district_name")
    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    @JsonProperty("block_name")
    public String getBlockName() {
        return blockName;
    }

    @JsonProperty("block_name")
    public void setBlockName(String blockName) {
        this.blockName = blockName;
    }

    @JsonProperty("pincode")
    public Integer getPincode() {
        return pincode;
    }

    @JsonProperty("pincode")
    public void setPincode(Integer pincode) {
        this.pincode = pincode;
    }

    @JsonProperty("lat")
    public Integer getLat() {
        return lat;
    }

    @JsonProperty("lat")
    public void setLat(Integer lat) {
        this.lat = lat;
    }

    @JsonProperty("long")
    public Integer getLong() {
        return _long;
    }

    @JsonProperty("long")
    public void setLong(Integer _long) {
        this._long = _long;
    }

    @JsonProperty("from")
    public String getFrom() {
        return from;
    }

    @JsonProperty("from")
    public void setFrom(String from) {
        this.from = from;
    }

    @JsonProperty("to")
    public String getTo() {
        return to;
    }

    @JsonProperty("to")
    public void setTo(String to) {
        this.to = to;
    }

    @JsonProperty("fee_type")
    public String getFeeType() {
        return feeType;
    }

    @JsonProperty("fee_type")
    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    @JsonProperty("sessions")
    public List<Session> getSessions() {
        return sessions;
    }

    @JsonProperty("sessions")
    public void setSessions(List<Session> sessions) {
        this.sessions = sessions;
    }

    @JsonProperty("vaccine_fees")
    public List<VaccineFee> getVaccineFees() {
        return vaccineFees;
    }

    @JsonProperty("vaccine_fees")
    public void setVaccineFees(List<VaccineFee> vaccineFees) {
        this.vaccineFees = vaccineFees;
    }

}
