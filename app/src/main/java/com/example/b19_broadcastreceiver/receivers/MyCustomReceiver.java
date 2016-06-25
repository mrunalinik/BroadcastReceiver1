package com.example.b19_broadcastreceiver.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by chethan on 11/25/2015.
 */
public class MyCustomReceiver extends BroadcastReceiver{

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Received custom broadcast", Toast.LENGTH_LONG).show();
    }
}
