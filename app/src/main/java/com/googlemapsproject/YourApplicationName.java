//package com.googlemapsproject;
//
//import android.app.Application;
//import android.content.Context;
//import android.content.pm.ActivityInfo;
//import android.os.Bundle;
//import android.view.Window;
//
//import androidx.multidex.MultiDex;
//
//public class YourApplicationName extends Application {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
////        super.onCreate(savedInstanceState);
//
////        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
////        requestWindowFeature(Window.FEATURE_NO_TITLE);
////        setContentView(R.layout.activity_splash);
//
//        //Analitycs
////        AnalyticsApplication application = (AnalyticsApplication) getApplication();
////        mTracker = application.getDefaultTracker();
////        mTracker.setScreenName("Splash");
////        mTracker.send(new HitBuilders.ScreenViewBuilder().build());
//    }
//
//    // Here you will enable Multidex
//    @Override
//    protected void attachBaseContext(Context base) {
//        super.attachBaseContext(base);
//        MultiDex.install(getBaseContext());
//    }
//
//}
