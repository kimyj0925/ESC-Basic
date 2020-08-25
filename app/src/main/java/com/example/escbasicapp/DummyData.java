package com.example.escbasicapp;

import java.util.ArrayList;

public class DummyData {
    public static ArrayList<contact> contacts = new ArrayList<>();

    static {
        contacts.add(new contact("곽용우", "010-3744-0644", "kkolbuyw@gmail.com"));
        contacts.add(new contact("윤무원", "010-5510-3499", "sample@gmail.com"));
        contacts.add(new contact("김윤중", "010-5109-7017", "klaybsjnd@naver.com"));
    }
}
