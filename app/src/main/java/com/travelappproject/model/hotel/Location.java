package com.travelappproject.model.hotel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Location {
    private double lat;
    private double lon;

    public Location(double lat, double lon) {
        this.lat = lat;
        this.lon = lon;
    }

    @JsonProperty("lat")
    public double getLat() {
        return lat;
    }

    @JsonProperty("lat")
    public void setLat(double value) {
        this.lat = value;
    }

    @JsonProperty("lon")
    public double getLon() {
        return lon;
    }

    @JsonProperty("lon")
    public void setLon(double value) {
        this.lon = value;
    }
}
