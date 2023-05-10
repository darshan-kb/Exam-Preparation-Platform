package com.one.one.services;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import com.one.one.classes.IdiomQ;
import com.one.one.dao.IdiomDao;
import com.one.one.dao.IdiomViewDao;
import com.one.one.entities.Idiom;
import com.one.one.entities.Idiom_View;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IdiomServiceImpl implements IdiomService{

    @Autowired
    private IdiomDao vd;
    @Autowired
    private IdiomViewDao vvd;

    @Override
    public String addQuestion(Idiom v) {
        int count = (int)vd.count();
        count++;
        v.setId(count);
        vd.save(v);
        return vd.count() + " Saved!";
    }

    @Override
    public IdiomQ getQuestion() {
        long count = vvd.count();
        if(count < 4){
            vd.setAllchtoZero();
        }
        List<Idiom_View> ques= vvd.pickRandow4();
        String question = ques.get(0).getIdiom();
        vd.setchtoOne(ques.get(0).getId());
        String meanarr[] = new String[4];
        for(int i=0;i<4;i++){
            meanarr[i] = ques.get(i).getMean();
            //String sepmean = getRandom(sepstr);
        }
        IdiomQ vq = new IdiomQ();
        vq.setIdiom(question);
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
    
}
