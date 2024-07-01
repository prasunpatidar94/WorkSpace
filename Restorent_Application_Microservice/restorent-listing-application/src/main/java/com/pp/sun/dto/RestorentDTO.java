package com.pp.sun.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class RestorentDTO {
    private String id;
    private String restName;
    private String restAddress;
    private String restRating;
    private String restOwner;
    private String restPinCode;

    public String getId() {
        return id;
    }

    public String getRestName() {
        return restName;
    }

    public String getRestAddress() {
        return restAddress;
    }

    public String getRestRating() {
        return restRating;
    }

    public String getRestOwner() {
        return restOwner;
    }

    public String getRestPinCode() {
        return restPinCode;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setRestName(String restName) {
        this.restName = restName;
    }

    public void setRestAddress(String restAddress) {
        this.restAddress = restAddress;
    }

    public void setRestRating(String restRating) {
        this.restRating = restRating;
    }

    public void setRestOwner(String restOwner) {
        this.restOwner = restOwner;
    }

    public void setRestPinCode(String restPinCode) {
        this.restPinCode = restPinCode;
    }
}
