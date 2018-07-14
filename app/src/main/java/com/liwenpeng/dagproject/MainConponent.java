package com.liwenpeng.dagproject;

import javax.inject.Inject;

import dagger.Component;
import dagger.Module;

/**
 * liwenpeng
 * 2018/7/13 17:15
 * DagProject
 * Descrobe:
 */
@Component(modules = MainModuel.class)
public interface MainConponent {
void inject(MainActivity activity);
}
