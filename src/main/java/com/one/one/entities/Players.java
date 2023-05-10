package com.one.one.entities;

public class Players {
    private String text;
    private int money;
    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
        this.money = money;
    }
    private int val1;
    private int val2;
    private String id;

    public Players(String text, int val1, int val2, String id,int money) {
        this.text = text;
        this.val1 = val1;
        this.val2 = val2;
        this.id = id;
        this.money = money;
    }
    public Players(){

    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public int getVal1() {
        return val1;
    }
    public void setVal1(int val1) {
        this.val1 = val1;
    }
    public int getVal2() {
        return val2;
    }
    public void setVal2(int val2) {
        this.val2 = val2;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    
    
}
