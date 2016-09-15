package com.zachtib.mudclient.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zachtib.mudclient.MudClient;
import com.zachtib.mudclient.R;
import com.zachtib.mudclient.interfaces.ITelnetClient;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    ITelnetClient telnetClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((MudClient )getApplication()).getAppComponent().inject(this);
    }
}
