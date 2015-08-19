package com.example.sdm.cybk.model.bean;

/**
 * Created by sdm on 2015/8/14.
 */
public class NewStudent {
    private int pictrue;
    private String name;

    public NewStudent(int Pc,String Name){
        pictrue = Pc;
        name = Name;
    }

    public int getPictrue() {
        return pictrue;
    }

    public String getName() {
        return name;
    }
}
