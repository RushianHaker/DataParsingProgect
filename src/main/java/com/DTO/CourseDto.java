package com.DTO;


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

    public List<CourseDtoOnce> getValute() { return valute; }

    public Date getDate() { return date; }
}
