package com.one.one.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.data.annotation.Immutable;

@Entity
@Immutable
public class Idiom_View {
    @Id
    private int id;
    private String idiom;
    private String mean;
    public Idiom_View() {
    }
    public Idiom_View(int id, String idiom, String mean) {
        this.id = id;
        this.idiom = idiom;
        this.mean = mean;
    }
    public int getId() {
        return id;
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
