package com.example.myservlets;

import java.io.*;

public class employee implements java.io.Serializable{

    private int id;

    public employee(){}

    public int getId(){
        return this.id;
    }

    public void setId(int x){
        this.id = x;
    }

}
