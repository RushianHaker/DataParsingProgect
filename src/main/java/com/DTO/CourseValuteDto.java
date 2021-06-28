package com.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CourseValuteDto {
    @JsonProperty("USD")
    private CourseDtoOnce usd;

    public CourseDtoOnce getUsd() {
        return usd;
    }

    public void setUsd(CourseDtoOnce usd) {
        this.usd = usd;
    }
}
