package com.example.daggerfromwithouttowithstepbystep;

import android.app.Application;

import com.example.daggerfromwithouttowithstepbystep.data.local.DatabaseService;
import com.example.daggerfromwithouttowithstepbystep.data.remote.NetworkService;
import com.example.daggerfromwithouttowithstepbystep.di.DependencyComponent;

public class MyApplication extends Application {
    public DatabaseService databaseService;
    public NetworkService networkService;

    @Override
    public void onCreate() {
        super.onCreate();

        DependencyComponent.inject(this);
    }
}
