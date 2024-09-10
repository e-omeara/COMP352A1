package com.example;

public class Exponential {

    public static int exponential(int n){
        //do something here
        int result = 0;
        int number = 1;
        if(n <= 3){
            result = 1;
        } else {

            result = exponential(n-1) + exponential(n-2) + exponential(n-3);
        }

        return result;
    }
}
