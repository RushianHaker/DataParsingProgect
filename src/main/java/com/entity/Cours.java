package com.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@JsonIgnoreProperties
public class Cours {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public String id;
    private Integer numCode;
    private String charCode;
    private String name;
    private Integer nominal;
    private Long value;
    private Long previous;



    public Cours(String id, Integer numCode, String charCode, String name, Integer nominal, Long value, Long previous) {
        this.id = id;
        this.numCode = numCode;
        this.charCode = charCode;
        this.name = name;
        this.nominal = nominal;
        this.value = value;
        this.previous = previous;
    }

    public Cours(String id, String name, Integer nominal, Long value) {
        this.id = id;
        this.name = name;
        this.nominal = nominal;
        this.value = value;
    }

    public Cours() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }

    public Integer getNumCode() {
        return numCode;
    }

    public void setNumCode(Integer numCode) {
        this.numCode = numCode;
    }

    public String getCharCode() {
        return charCode;
    }

    public void setCharCode(String charCode) {
        this.charCode = charCode;
    }

    public Long getPrevious() {
        return previous;
    }

    public void setPrevious(Long previous) {
        this.previous = previous;
    }
}
