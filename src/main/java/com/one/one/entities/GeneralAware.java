package com.one.one.entities;

import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;

import javax.persistence.Id;

@Entity
public class GeneralAware {

    @Id
    private int id;
    
    private String que;
    private String opa;
    private String opb;
    private String opc;
    private String opd;
    private int ans;
    private int ch;
    private String exp;

    public GeneralAware() {
    }
    public String getExp() {
        return exp;
    }
    public void setExp(String exp) {
        this.exp = exp;
    }
    public GeneralAware(int id, String que, String opa, String opb, String opc, String opd, int ans, int ch, String exp) {
        this.id = id;
        this.que = que;
        this.opa = opa;
        this.opb = opb;
        this.opc = opc;
        this.opd = opd;
        this.ans = ans;
        this.ch = ch;
        this.exp = exp;
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
    public int getAns() {
        return ans;
    }
    public void setAns(int ans) {
        this.ans = ans;
    }
    public String getOpd() {
        return opd;
    }
    public void setOpd(String opd) {
        this.opd = opd;
    }
    public String getOpc() {
        return opc;
    }
    public void setOpc(String opc) {
        this.opc = opc;
    }
    public String getOpb() {
        return opb;
    }
    public void setOpb(String opb) {
        this.opb = opb;
    }
    public String getOpa() {
        return opa;
    }
    public void setOpa(String opa) {
        this.opa = opa;
    }
    public String getQue() {
        return que;
    }
    public void setQue(String que) {
        this.que = que;
    }
    public void setId(int id) {
        this.id = id;
    }

    
}
