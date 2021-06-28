package com.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;


public class CourseDto implements Serializable {
    @JsonProperty("Valute")
    private CourseValuteDto valute;
    @JsonProperty("Date")
    private String date;

    public CourseValuteDto getValute() {
        return valute;
    }

    public void setValute(CourseValuteDto valute) {
        this.valute = valute;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
