package com.example.b19_broadcastreceiver.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by chethan on 11/25/2015.
 */
public class MyReceiver extends BroadcastReceiver{

    private final String TAG = "MyReceiver";

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i(TAG, "broadcast is received");
    }
}
