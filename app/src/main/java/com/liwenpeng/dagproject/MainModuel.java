package com.liwenpeng.dagproject;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * liwenpeng
 * 2018/7/13 17:18
 * DagProject
 * Descrobe:
 */
@Module
public class MainModuel {
    private MainView mainView;
    private Context mContext;

    public MainModuel(MainView mainView, Context context) {
        this.mainView = mainView;
        this.mContext  = context;
    }
    @Provides
    public MainView provideMainView(){
        return mainView;
    }

    @Provides Context provideContext(){
        return mContext;
    }
}
