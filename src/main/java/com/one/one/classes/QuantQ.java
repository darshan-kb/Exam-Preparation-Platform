package com.one.one.classes;

import org.springframework.web.multipart.MultipartFile;

public class QuantQ {
    
    private MultipartFile ansByte;
    private MultipartFile queByte;
    private int ans;
    private int ch;
    private String disc;
    public MultipartFile getAnsByte() {
        return ansByte;
    }
    public String getDisc() {
        return disc;
    }
    public void setDisc(String disc) {
        this.disc = disc;
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
    public MultipartFile getQueByte() {
        return queByte;
    }
    public void setQueByte(MultipartFile queByte) {
        this.queByte = queByte;
    }
    public void setAnsByte(MultipartFile ansByte) {
        this.ansByte = ansByte;
    }

}
