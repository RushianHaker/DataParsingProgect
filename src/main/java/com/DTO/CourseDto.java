package com.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@XmlRootElement(name = "ValCurs")
@XmlAccessorType(XmlAccessType.FIELD)
public class CourseDto implements Serializable{

    @XmlElement(name = "Valute")
    private List<CourseDtoOnce> valute;
    @XmlElement(name = "Date")
    private Date date;

    // TODO: Return value
    public List<CourseDtoOnce> getValute() { return valute; }

//    public void setValute(CourseValuteDto valute) {
//        this.valute = valute;
//    }
//
//    public String getDate() {
//        return date;
//    }
//
//    public void setDate(String date) {
//        this.date = date;
//    }
}
