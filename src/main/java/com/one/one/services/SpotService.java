package com.one.one.services;

import com.one.one.classes.SpotQuestion;
import com.one.one.entities.Spot;

public interface SpotService {
    public String addQuestion(Spot spot);
    public SpotQuestion getQuestion();
    public int wrongAns(int id);
}
