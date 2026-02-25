package com.ironhack.IntroToTesting;

public class TDD {
    public static int[] returnArray(int n){
        int[] array = new int[n];
        for (int i=1; i<=n; i++){
            array[i-1]=i;
        }
        return array;
    }
}
