package com.example.daggerfromwithouttowithstepbystep.di;


import com.example.daggerfromwithouttowithstepbystep.MyApplication;
import com.example.daggerfromwithouttowithstepbystep.data.local.DatabaseService;
import com.example.daggerfromwithouttowithstepbystep.data.remote.NetworkService;
import com.example.daggerfromwithouttowithstepbystep.ui.MainActivity;
import com.example.daggerfromwithouttowithstepbystep.ui.MainViewModel;

public class DependencyComponent {

    public static void inject(MyApplication application) {
        application.networkService = new NetworkService(application, "SOME_API_KEY:abc");
        application.databaseService = new DatabaseService(application, "dummy_db:xyz", 1);
    }

    public static void inject(MainActivity activity) {
        MyApplication app = (MyApplication) activity.getApplication();
        activity.viewModel = new MainViewModel(app.databaseService, app.networkService);
    }
}
