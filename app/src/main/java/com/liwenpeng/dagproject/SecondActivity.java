package com.liwenpeng.dagproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

public class SecondActivity extends AppCompatActivity {

    @Inject
    SecondPresenter secondActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        DaggerSecondComponent.builder().build().inject(this);
        secondActivity.testSecondActivity();
    }
}
