package com.example.daggerfromwithouttowithstepbystep.ui;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.daggerfromwithouttowithstepbystep.R;
import com.example.daggerfromwithouttowithstepbystep.di.DependencyComponent;

public class MainActivity extends AppCompatActivity {

    public MainViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DependencyComponent.inject(this);

        TextView tvData = findViewById(R.id.tvData);
        tvData.setText(viewModel.getSomeData());
    }
}