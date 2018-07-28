package com.liwenpeng.dagproject;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import javax.inject.Inject;

/**
 * liwenpeng
 * 2018/7/13 17:12
 * DagProject
 * Descrobe:
 */
public class MainPresenter {

    @Inject
    MainRepotority mainRepotority;

    @Inject
    public MainPresenter() {

    }

    public void getData(){
        Log.d("lwp","调用成功");
       // mainRepotority.fuckSs();
    }
}
