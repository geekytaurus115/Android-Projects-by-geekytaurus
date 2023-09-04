package com.example.recyclerviewlearn;

public class ContactModel {

    int img;
    String name, number;

    public ContactModel(int image, String name, String number){
        this.name = name;
        this.number = number;
        this.img = image;
    }

    public ContactModel(String name, String number){
        this.name = name;
        this.number = number;
    }
}
