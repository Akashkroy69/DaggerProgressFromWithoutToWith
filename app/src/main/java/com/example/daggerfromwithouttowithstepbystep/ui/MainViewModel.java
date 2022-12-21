package com.example.daggerfromwithouttowithstepbystep.ui;

import com.example.daggerfromwithouttowithstepbystep.data.local.DatabaseService;
import com.example.daggerfromwithouttowithstepbystep.data.remote.NetworkService;

public class MainViewModel {

    private DatabaseService databaseService;
    private NetworkService networkService;

    public MainViewModel(DatabaseService databaseService, NetworkService networkService) {
        this.databaseService = databaseService;
        this.networkService = networkService;
    }

    public String getSomeData() {
        return databaseService.getDummyData() + " : " + networkService.getDummyData();
    }
}
