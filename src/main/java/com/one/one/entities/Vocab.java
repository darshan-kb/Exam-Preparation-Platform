package com.one.one.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vocab {
    
    @Id
    private int id;
    private String word;
    private String mean;
    private int ch;
    public Vocab() {
    }
    public Vocab(int id, String word, String mean, int ch) {
        this.id = id;
        this.word = word;
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
