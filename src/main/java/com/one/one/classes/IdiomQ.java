package com.one.one.classes;

public class IdiomQ {
    
    private String idiom;
    private String[] option;
    private String ans;
    public IdiomQ() {
    }
    public IdiomQ(String idiom, String[] option, String ans) {
        this.idiom = idiom;
        this.option = option;
        this.ans = ans;
    }
    public String getIdiom() {
        return idiom;
    }
    public String getAns() {
        return ans;
    }
    public void setAns(String ans) {
        this.ans = ans;
    }
    public String[] getOption() {
        return option;
    }
    public void setOption(String[] option) {
        this.option = option;
    }
    public void setIdiom(String idiom) {
        this.idiom = idiom;
    }
}
