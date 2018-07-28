package com.liwenpeng.dagproject;

import javax.inject.Inject;

import dagger.Component;

/**
 * liwenpeng
 * 2018/7/26 18:21
 * DagProject
 * Descrobe:
 */
@Component
public interface MyComponent {
    public void  inject(MainActivity mainActivity);
    //void inject(MainPresenter mainPresenter);
}
