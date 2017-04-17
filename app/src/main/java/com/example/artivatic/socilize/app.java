package com.example.artivatic.socilize;

import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Created by artivatic on 30/3/17.
 */

public class app extends Application {
    BookResponse.Info[] info;


    @Override
    public void onCreate() {



        super.onCreate();

        RealmConfiguration config=new RealmConfiguration.Builder(this).deleteRealmIfMigrationNeeded().build();
        Realm.setDefaultConfiguration(config);



    }




}
