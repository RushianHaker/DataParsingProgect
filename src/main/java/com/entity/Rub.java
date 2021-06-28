package com.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@JsonIgnoreProperties
public class Rub {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long id;

    private String dateStart;
    private String dateEnd;
    private String date;
    private String name;
    private int nominal;
    private long count;

    public Rub(Long id, String dateStart, String dateEnd, String date, String name, Integer nominal, Long count) {
        this.id = id;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.date = date;
        this.name = name;
        this.nominal = nominal;
        this.count = count;
    }

    public Rub(Long id, String date, Integer nominal, Long count) {
        this.id = id;
        this.date = date;
        this.nominal = nominal;
        this.count = count;
    }

    public Rub() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNominal() {
        return nominal;
    }

    public void setNominal(Integer nominal) {
        this.nominal = nominal;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }
}
