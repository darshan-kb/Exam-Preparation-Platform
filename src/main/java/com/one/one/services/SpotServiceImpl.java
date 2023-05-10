package com.one.one.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.one.one.classes.SpotQuestion;
import com.one.one.dao.EnglishDao_Spot;
import com.one.one.entities.Spot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpotServiceImpl implements SpotService {

    @Autowired
    private EnglishDao_Spot sp;

    @Override
    public String addQuestion(Spot spot) {
        int count = (int)sp.count();
        System.out.println(count+"@@@");
        count++;
        System.out.println(count+"####");
        spot.setId(count);
        
        sp.save(spot);
        return spot.getId()+" Saved!";
    }

    @Override
    public SpotQuestion getQuestion() {

        List<Spot> allRecord = sp.findAll();
        List<Integer> tmp = new ArrayList<Integer>();
        long count = sp.count();

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

            sp.saveAll(allRecord);
        }

        for(int i=0;i<count;i++){
            int t1 = allRecord.get(i).getCh();
            if(t1==0){
                tmp.add(allRecord.get(i).getId());
            }
        }

        Random rand = new Random();
        int randomElement = tmp.get(rand.nextInt(tmp.size()));
        Spot req = sp.getById(randomElement);
        req.setCh(1);
        sp.save(req);
        String mans = req.getSent();
        String sarr[];
        if(mans.contains("/")){
            sarr = mans.split("/");
        }
        else{
            sarr = mans.split("\\([a-zA-Z]\\)");
        }
        SpotQuestion sq = new SpotQuestion();
        sq.setId(req.getId());
        sq.setQueop(sarr);
        sq.setAns(req.getAns());
        sq.setDisc(req.getDisc());
        return sq;
    }

    @Override
    public int wrongAns(int id) {
        Spot spo = sp.getById(id);
        spo.setCh(0);
        sp.save(spo);
        return id;
    }
    
}
