package com.example.demorealm;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Person extends RealmObject {
    @PrimaryKey
    long id;
    String name;
    RealmList<Dog> dogs;
    public Person(){}

    public Person(long id, String name, RealmList<Dog> dogs) {
        this.id = id;
        this.name = name;
        this.dogs = dogs;
    }
}
