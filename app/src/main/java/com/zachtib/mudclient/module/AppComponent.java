package com.zachtib.mudclient.module;

import com.zachtib.mudclient.ui.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {
    void inject(MainActivity target);
}
