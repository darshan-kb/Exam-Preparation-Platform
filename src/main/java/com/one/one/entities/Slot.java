package com.one.one.entities;

import java.util.ArrayList;
import java.util.List;

public class Slot {
    public Slot(List<List<Integer>> arr) {
        this.arr = arr;
    }

    private List<List<Integer>> arr = new ArrayList<List<Integer>>();

    public List<List<Integer>> getArr() {
        return this.arr;
    }

    public void setArr(List<List<Integer>> arr) {
        this.arr = arr;
    }
    

}
