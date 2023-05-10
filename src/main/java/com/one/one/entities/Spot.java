package com.one.one.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Spot {

    @Id
    private int id;
    //@Id
    //private String bid;
    private String sent;
    private int ans;
    private String disc;
    private int ch;
    
    public Spot() {
    }
    public Spot(int id, String sent, int ans, String disc, int ch) {
        this.id = id;
        //this.bid = bid;
        this.sent = sent;
        this.ans = ans;
        this.disc = disc;
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
    public String getDisc() {
        return disc;
    }
    public void setDisc(String disc) {
        this.disc = disc;
    }
    public int getAns() {
        return ans;
    }
    public void setAns(int ans) {
        this.ans = ans;
    }
    public String getSent() {
        return sent;
    }
    public void setSent(String sent) {
        this.sent = sent;
    }
   /* public String getBid() {
        return bid;
    }
    public void setBid(String bid) {
        this.bid = bid;
    }*/
    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "Spot [ans=" + ans + ", ch=" + ch + ", disc=" + disc + ", id=" + id + ", sent=" + sent
                + "]";
    }

}
