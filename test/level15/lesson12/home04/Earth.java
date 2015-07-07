package com.javarush.test.level15.lesson12.home04;

/**
 * Created by dtv on 30.06.2015.
 */
public class Earth implements Planet
{
    private static Earth instance;
    private Earth(){
    }
    public static synchronized Earth getInstance(){
        if(instance == null){
            instance = new Earth();
        }
        return instance;
    }
}
