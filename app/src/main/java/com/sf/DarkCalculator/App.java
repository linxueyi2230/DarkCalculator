package com.sf.DarkCalculator;

import android.app.Application;

import com.ego.shadow.Shadow;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Shadow.layout(R.layout.activity_splash);
        Shadow.init("michael20180920dark",MainActivity.class);
    }
}
