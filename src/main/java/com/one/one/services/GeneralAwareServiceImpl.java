package com.one.one.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.one.one.dao.GeneralAwareDao;
import com.one.one.entities.GeneralAware;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GeneralAwareServiceImpl implements GeneralAwareService{

    @Autowired
    private GeneralAwareDao gad;

    @Override
    public String addQuestion(GeneralAware ga) {
        int count = (int)gad.count();
        count++;
        ga.setId(count);
        System.out.println(ga);
        gad.save(ga);
        return gad.count() + " Saved!";
    }

    @Override
    public GeneralAware getQuestion() {
        List<GeneralAware> allRecord = gad.findAll();
        List<Integer> tmp = new ArrayList<Integer>();
        long count = gad.count();

        int check=0;
        for(int i=0;i<count;i++){
            if(allRecord.get(i).getCh() == 0){
                check++;
                break;
            }
        }

        if(check == 0){
            for(int i=0;i<count;i++){
                allRecord.get(i).setCh(0);
            }

            gad.saveAll(allRecord);
        }

        for(int i=0;i<count;i++){
            int t1 = allRecord.get(i).getCh();
            if(t1==0){
                tmp.add(allRecord.get(i).getId());
            }
        }

        Random rand = new Random();
        int randomElement = tmp.get(rand.nextInt(tmp.size()));
        GeneralAware req = gad.getById(randomElement);
        req.setCh(1);
        gad.save(req);

        return req;
    }
    
}
