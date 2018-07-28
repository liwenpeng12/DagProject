package com.liwenpeng.dagproject;

import android.content.Intent;
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
        DaggerMyComponent.builder().build().inject(this);
    //    mainPresenter = new MainPresenter();
        mainPresenter.getData();
        startActivity(new Intent(this,SecondActivity.class));
    }

    @Override
    public void onSuccess() {

    }
}
