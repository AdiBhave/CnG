package com.example.adityadesai.cng;

/**
 * Created by adityadesai on 11/02/17.
 */

public class Industry {

    private String industryName;
    private int industryId;

    Industry(String name,int id){
        industryName=name;
        industryId=id;
    }

    public String getName(){
        return industryName;
    }
    public int getId(){
        return industryId;
    }
}
