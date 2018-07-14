package com.liwenpeng.dagproject;

import android.content.Context;
import android.widget.Toast;

import javax.inject.Inject;

/**
 * liwenpeng
 * 2018/7/13 17:12
 * DagProject
 * Descrobe:
 */
public class MainPresenter {

     MainView mainView;
     Context mContext;

    @Inject
    public MainPresenter(MainView mainView, Context context) {
        this.mainView = mainView;
        this.mContext = context;
    }

    public void getData(){
        Toast.makeText(mContext,"我在执行中",Toast.LENGTH_SHORT).show();

    }
}
