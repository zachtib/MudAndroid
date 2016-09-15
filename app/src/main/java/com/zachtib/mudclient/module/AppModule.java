package com.zachtib.mudclient.module;

import android.app.Application;

import com.zachtib.mudclient.interfaces.ITelnetClient;
import com.zachtib.mudclient.telnet.TelnetClient;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
    Application application;

    public AppModule(Application application) {
        this.application = application;
    }

    @Provides
    public ITelnetClient provideTelnetClient() {
        return new TelnetClient("localhost", 1234);
    }

}
