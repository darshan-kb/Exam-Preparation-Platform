package com.one.one.services;



import com.one.one.classes.VocabQ;
import com.one.one.entities.Vocab;


public interface VocabService {
    public String addQuestion(Vocab v);
    public VocabQ getQuestion();
    public int wrongAns(int id);
}
