package com.one.one.services;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.stereotype.Service;

import com.one.one.entities.Slot;

@Service
public class SlotMachineImp {

    static void shuffleArray(int[] ar)
    {
    // If running on Java 6 or older, use `new Random()` on RHS here
        Random rnd = ThreadLocalRandom.current();
            for (int i = ar.length - 1; i > 0; i--)
            {
                int index = rnd.nextInt(i + 1);
                // Simple swap
                int a = ar[index];
                ar[index] = ar[i];
                ar[i] = a;
            }
    }
    public ArrayList generateSlot(int n,double per){
        int arr[] = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        int na[] = new int[14];
        Random rd = new Random();

        double nno = (arr.length)*(per/100);
        int no = (int)nno;
        for(int i=0;i<no;i++){
            na[i]=n;
        }
        shuffleArray(arr);
        for(int i=no, j=0;i<arr.length;j++){
            if(arr[j]!=n){
                na[i]=arr[j];
                i++;
            }
        }
        shuffleArray(na);
        ArrayList<Integer> intList = new ArrayList<Integer>(arr.length);
        for(int i=0;i<14;i++){
            if(arr[i]==na[13]){
                int tmp = arr[13];
                arr[13] = arr[i];
                arr[i] = arr[13];
            }
        }
        for (int i : arr)
        {
            intList.add(i);
        }
        return intList;
    }
    public Slot getSlot(){
        List<List<Integer>> group = new ArrayList<List<Integer>>();
        group.add(generateSlot(8, 10));
        group.add(generateSlot(9, 50));
        group.add(generateSlot(9, 100));
        Slot slot = new Slot(group);
        return slot;

    }
}
