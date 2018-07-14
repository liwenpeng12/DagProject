package com.liwenpeng.dagproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements MainView{

    @Inject
    MainPresenter mainPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerMainConponent.builder().mainModuel(new MainModuel(this,this)).build().inject(this);
        mainPresenter.getData();
    }

    @Override
    public void onSuccess() {

    }
}
