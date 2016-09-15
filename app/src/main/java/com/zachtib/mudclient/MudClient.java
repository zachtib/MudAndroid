package com.zachtib.mudclient;

import android.app.Application;

import com.zachtib.mudclient.module.AppComponent;
import com.zachtib.mudclient.module.AppModule;
import com.zachtib.mudclient.module.DaggerAppComponent;

public class MudClient extends Application {
    private AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    public AppComponent getAppComponent() {
        return component;
    }
}
