package com.example;

public class Linear {

    public static int linearodd(int n){
        int result = 1;
        int oneBack = 1;
        int twoBack = 1;
        int oneBackup = 1;
        int twoBackup = 1;

        if(n <= 3){
            result = 1;
        } else {
            for(int i = 4; i <= n; i++){
                oneBackup = result;
                twoBackup = oneBack;

                result = result + oneBack + twoBack;
                oneBack = oneBackup;
                twoBack = twoBackup;


            }


        }
        //do something here
        return result;
    }
}
