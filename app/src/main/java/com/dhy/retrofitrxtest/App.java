package com.dhy.retrofitrxtest;

import android.app.Application;
import android.content.Context;

import com.dhy.retrofitrxutil.DisposableHandler;
import com.dhy.retrofitrxutil.IDisposableHandler;
import com.dhy.retrofitrxutil.ObserverX;
import com.dhy.retrofitrxutil.SampleErrorHandler;
import com.dhy.retrofitrxutil.SampleStyledProgressGenerator;

public class App extends Application {
    public IDisposableHandler disposableHandler;

    @Override
    public void onCreate() {
        super.onCreate();
        disposableHandler = new DisposableHandler();
        ObserverX.setDefaultStyledProgressGenerator(new SampleStyledProgressGenerator());
        ObserverX.setDefaultErrorHandler(new SampleErrorHandler());
    }

    public static App getInstance(Context context) {
        return (App) context.getApplicationContext();
    }
}
