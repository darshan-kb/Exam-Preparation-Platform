package com.one.one.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Idiom {
    
    @Id
    private int id;
    private String idiom;
    private String mean;
    private int ch;
    public Idiom() {
    }
    public Idiom(int id, String idiom, String mean, int ch) {
        this.id = id;
        this.idiom = idiom;
        this.mean = mean;
        this.ch = ch;
    }
    public int getId() {
        return id;
    }
    public int getCh() {
        return ch;
    }
    public void setCh(int ch) {
        this.ch = ch;
    }
    public String getMean() {
        return mean;
    }
    public void setMean(String mean) {
        this.mean = mean;
    }
    public String getIdiom() {
        return idiom;
    }
    public void setIdiom(String idiom) {
        this.idiom = idiom;
    }
    public void setId(int id) {
        this.id = id;
    }
}
