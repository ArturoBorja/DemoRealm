package com.example.demorealm;

import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;

public class RealmAplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
        RealmConfiguration configuration =
                new RealmConfiguration.Builder().deleteRealmIfMigrationNeeded().build();
        Realm.setDefaultConfiguration(configuration);
    }
}
