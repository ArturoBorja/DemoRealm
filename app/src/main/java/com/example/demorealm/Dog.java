package com.example.demorealm;

import io.realm.RealmObject;

public class Dog extends RealmObject {
    String name;
    int age;

    public Dog (){}
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
