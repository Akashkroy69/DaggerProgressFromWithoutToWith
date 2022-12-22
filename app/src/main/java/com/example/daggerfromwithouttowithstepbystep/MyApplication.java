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

        //this Dependency Component was introduced in design approach 3 lecture-1, project stage 2. Now we want to use
        //Dagger in place of Dependency Component. so we are commenting it out.
        //we will delete the dependency component class and will comment out all the lines where the dependency class and
        //its methods has been used. Maybe we will not delete it but we will move the dependency component class in
        //deprecated package.
        //As instance of ViewModel class MainViewModel was being created by Dependency component, so we will comment out every line
        // where viewModel is being used. We will later bring them back when we completely introduce Dagger in our project and
        // it creates instance of MainViewModel
        //DependencyComponent.inject(this);


    }
}
