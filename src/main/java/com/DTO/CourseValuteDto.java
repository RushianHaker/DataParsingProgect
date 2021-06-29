package com.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Valute")
@XmlAccessorType(XmlAccessType.FIELD)
public class CourseValuteDto {

    @XmlElement(name = "R01235")
    private CourseDtoOnce usd;

    public CourseDtoOnce getUsd() { return usd; }

    public void setUsd(CourseDtoOnce usd) {
        this.usd = usd;
    }
}
