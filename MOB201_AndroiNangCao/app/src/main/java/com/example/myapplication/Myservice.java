package com.example.myapplication;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.Nullable;

public class Myservice extends Service {

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("TAG >>>>>>>>>>> ", "onCreate: ");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        Bundle bundle = intent.getExtras();
        String data = bundle.getString("data");
        int tuoi = bundle.getInt("tuoi");
        Log.d("TAG>>>>>>>>>>>>>>>>>>", "onStartCommand: ");
        return super.onStartCommand(intent, flags, startId);

    }

    @Override
    public void onDestroy() {

        Log.d("TAG>>>>>>>>>>>>>>>>>", "onDestroy: ");
        super.onDestroy();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Log.d("TAG>>>>>>>>>>>>>>>>", "onBind: ");
        return null;
    }

}
