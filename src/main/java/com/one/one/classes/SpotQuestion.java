package com.one.one.classes;

public class SpotQuestion {
   
   private int id;
   private String disc;
   private String[] queop;
   private int ans;
public SpotQuestion() {
}
public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}
public SpotQuestion(String disc, String[] queop, int ans, int id) {
    this.disc = disc;
    this.queop = queop;
    this.ans = ans;
    this.id = id;
}
public String getDisc() {
    return disc;
}
public int getAns() {
    return ans;
}
public void setAns(int ans) {
    this.ans = ans;
}
public String[] getQueop() {
    return queop;
}
public void setQueop(String[] queop) {
    this.queop = queop;
}
public void setDisc(String disc) {
    this.disc = disc;
}
}
