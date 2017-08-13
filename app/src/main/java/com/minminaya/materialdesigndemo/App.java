package com.minminaya.materialdesigndemo;

import android.app.Application;

import com.blankj.utilcode.util.Utils;

/**
 * Created by Niwa on 2017/8/12.
 */

public class App extends Application {
    private static App INSTANCE;

    public static App getINSTANCE() {
        return INSTANCE;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Utils.init(this);
        INSTANCE = this;
    }
}
