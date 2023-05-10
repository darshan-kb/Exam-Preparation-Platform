package com.one.one.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Immutable;

@Entity
@Immutable
public class Vocab_View {
    @Id
    private int id;
    private String word;
    private String mean;
    public int getId() {
        return id;
    }
    public String getMean() {
        return mean;
    }
    public void setMean(String mean) {
        this.mean = mean;
    }
    public String getWord() {
        return word;
    }
    public void setWord(String word) {
        this.word = word;
    }
    public void setId(int id) {
        this.id = id;
    }
}
