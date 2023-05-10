package com.one.one.classes;

public class VocabQ {
    private String word;
    private String[] option;
    private String ans;
    private int id;
    public VocabQ() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public VocabQ(String word, String[] option, String ans, int id) {
        this.word = word;
        this.option = option;
        this.ans = ans;
        this.id = id;
    }
    public String getWord() {
        return word;
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
    public void setWord(String word) {
        this.word = word;
    }
}
