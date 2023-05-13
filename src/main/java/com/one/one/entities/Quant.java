package com.one.one.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="Quant")
public class Quant {
    
    @Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int ans;
    private int ch;

    @Column(name = "queByte", length = 1000)
    private byte[] queByte;

    @Column(name = "ansByte", length = 1000)
    private byte[] ansByte;
    private String disc;
    public Quant(int ans, int ch, byte[] queByte, byte[] ansByte, String disc) {
        this.ans = ans;
        this.ch = ch;
        this.queByte = queByte;
        this.ansByte = ansByte;
        this.disc = disc;
    }
    public Quant() {
    }
    public Quant(Long id, int ans, int ch, byte[] queByte, byte[] ansByte, String disc) {
        this.id = id;
        this.ans = ans;
        this.ch = ch;
        this.queByte = queByte;
        this.ansByte = ansByte;
        this.disc = disc;
    }
    public Long getId() {
        return id;
    }
    public String getDisc() {
        return disc;
    }
    public void setDisc(String disc) {
        this.disc = disc;
    }
    public byte[] getAnsByte() {
        return ansByte;
    }
    public void setAnsByte(byte[] ansByte) {
        this.ansByte = ansByte;
    }
    public byte[] getQueByte() {
        return queByte;
    }
    public void setQueByte(byte[] queByte) {
        this.queByte = queByte;
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
    public void setId(Long id) {
        this.id = id;
    }
}
