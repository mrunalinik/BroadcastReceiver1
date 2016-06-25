package com.example.b19_broadcastreceiver;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.b19_broadcastreceiver.common.BConstants;

public class MainActivity extends AppCompatActivity {

    private Button sendBroadcastBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sendBroadcastBtn = (Button) findViewById(R.id.sendBroadcastBtn);


        sendBroadcastBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(BConstants.BROADCAST_ACTION);
                sendBroadcast(intent);
            }
        });
    }
}
