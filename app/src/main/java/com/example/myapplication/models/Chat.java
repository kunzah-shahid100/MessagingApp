package com.example.myapplication.models;

import java.util.Date;
import java.util.UUID;

public class Chat {
    private String senderID;
    private String message;
    private Date dateTime;

    public Chat(String message){
        this.message=message;
    }

    private void init(){
        this.senderID=UUID.randomUUID().toString();
        this.dateTime=new Date();
    }

    public void setContent(String message){
        this.message=message;
    }
}
