package com.DTO;

import lombok.Data;

import java.util.List;


public class CourseDto {
    private List<CourseDtoOnce> usd;

    public List<CourseDtoOnce> getUsd() {
        return usd;
    }

    public void setUsd(List<CourseDtoOnce> usd) {
        this.usd = usd;
    }
}
