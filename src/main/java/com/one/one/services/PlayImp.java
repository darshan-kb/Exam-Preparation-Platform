package com.one.one.services;


import java.util.ArrayList;
import java.util.List;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.stereotype.Service;

import com.one.one.entities.Players;
import com.one.one.entities.Slot;

@Service
public class PlayImp implements PlayService{

    static void shuffleArray(int[][] ar)
    {
    // If running on Java 6 or older, use `new Random()` on RHS here
        Random rnd = ThreadLocalRandom.current();
            for (int i = ar.length - 1; i > 0; i--)
            {
                int index = rnd.nextInt(i + 1);
                // Simple swap
                int[] a = ar[index];
                ar[index] = ar[i];
                ar[i] = a;
            }
    }

    @Override
    public Slot playGame(Players[] p) {
        // TODO Auto-generated method stub
        int total=0;
        int[][] comb = new int[9][9];
        int[][] reqcomb;
        double usem=0;
        List<List<Integer>> group = new ArrayList<List<Integer>>();
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> b1 = new ArrayList<>();
        ArrayList<Integer> c1 = new ArrayList<>();
        int[] reward = new int[]{10,20,50,100};
        ArrayList<int[]> lose = new ArrayList<>();
        ArrayList<int[]> tmpcomb = new ArrayList<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                comb[i][j]=0;
            }
        }
        for(Players ptr : p){
            int x = ptr.getVal1();
            int y = ptr.getVal2();
            int m = ptr.getMoney();
            comb[x][y]+=m;
            total+=m;
        }
        
        usem = total*(0.88);
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(comb[i][j]!=0){
                    for(int k : reward){
                        
                        double pos = comb[i][j] + (comb[i][j]*(k/100.0));
                        
                        if(pos<=usem){
                            System.out.println(pos+" "+usem+" "+comb[i][j]+" "+k);
                            tmpcomb.add(new int[]{i,j,k});
                        }
                    }
                }
                else{
                    lose.add(new int[]{i,j});
                }
            }
        }
        reqcomb = new int[tmpcomb.size()][3];
        int w=0;
        for(int[] t : tmpcomb){
            reqcomb[w] = t;
            w++;
        }
        
        if(reqcomb.length>1){
            shuffleArray(reqcomb);
            int[] winner = reqcomb[0];
            int ct=0;
            int c=0;
            for(int i=0;i<9;i++){
                if(winner[0]!=i){
                    a1.add(i);
                }
            }
            for(int i=0;i<9;i++){
                if(winner[1]!=i){
                    b1.add(i);
                }
            }
            while(c<8){
                if(winner[2]!=reward[ct%4]){
                    c1.add(reward[ct%4]);
                    c++;
                }
                ct++;
            }
            a1.add(winner[0]);
            b1.add(winner[1]);
            c1.add(winner[2]);
        }
        else{
            Random rnd = ThreadLocalRandom.current();
            int r = rnd.nextInt(lose.size());
            int rl = rnd.nextInt(reward.length);
            int[] loser = lose.get(r);
            int ct=0;
            int c=0;
            for(int i=0;i<9;i++){
                if(loser[0]!=i){
                    a1.add(i);
                }
            }
            for(int i=0;i<9;i++){
                if(loser[1]!=i){
                    b1.add(i);
                }
            }
            while(c<8){
                if(ct!=rl%4){
                    c1.add(reward[ct%4]);
                    c++;
                }
                ct++;
            }
            a1.add(loser[0]);
            b1.add(loser[1]);
            c1.add(reward[rl%4]);
        }
        
        group.add(a1);
        group.add(b1);
        group.add(c1);
        Slot slot = new Slot(group);
        return slot;
        
    }
    
    static class Pair{
        int a;
        int b;
        Pair(int a, int b){
            this.a = a;
            this.b = b;
        }
    }
}

