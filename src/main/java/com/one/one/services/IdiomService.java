package com.one.one.services;

import com.one.one.classes.IdiomQ;
import com.one.one.entities.Idiom;

public interface IdiomService {
    public String addQuestion(Idiom v);
    public IdiomQ getQuestion();
}
