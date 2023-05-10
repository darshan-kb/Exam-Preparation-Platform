package com.one.one.services;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import com.one.one.classes.VocabQ;
import com.one.one.dao.VocabDao;
import com.one.one.dao.VocabViewDao;
import com.one.one.entities.Vocab;
import com.one.one.entities.Vocab_View;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VocabServiceImpl implements VocabService{
    @Autowired
    private VocabDao vd;
    @Autowired
    private VocabViewDao vvd;

    @Override
    public String addQuestion(Vocab v) {
        
        int count = (int)vd.count();
        count++;
        v.setId(count);
        vd.save(v);
        return vd.count() + " Saved!";
    }

    @Override
    public VocabQ getQuestion() {
        long count = vvd.count();
        if(count < 4){
            vd.setAllchtoZero();
        }
        List<Vocab_View> ques= vvd.pickRandow4();
        String question = ques.get(0).getWord();
        int ind = ques.get(0).getId();
        vd.setchtoOne(ques.get(0).getId());
        String[] meanarr = new String[4];
        for(int i=0;i<4;i++){
            String [] sepstr = ques.get(i).getMean().split(",");
            String sepmean = getRandom(sepstr);
            meanarr[i] = sepmean;
        }
        VocabQ vq = new VocabQ();
        vq.setWord(question);
        vq.setId(ind);
        vq.setAns(meanarr[0]);
        shuffleArray(meanarr);
        vq.setOption(meanarr);
        return vq;
    }

    static void shuffleArray(String[] ar){
        // If running on Java 6 or older, use `new Random()` on RHS here
        Random rnd = ThreadLocalRandom.current();

        for (int i = ar.length - 1; i > 0; i--){
            int index = rnd.nextInt(i + 1);
            // Simple swap
            String a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
     }
    public static String getRandom(String[] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }

    @Override
    public int wrongAns(int id) {
        System.out.println(id);
        Vocab v = vd.getById(id);
        v.setCh(0);
        vd.save(v);
        return id;
    }
    
}
