package com.example.notification;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import android.app.NotificationManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=findViewById(R.id.clickedBtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NotificationCompat.Builder mbuilder=(NotificationCompat.Builder)
                        new NotificationCompat.Builder(getApplicationContext())
                                .setSmallIcon(R.drawable.trendy)
                                .setContentTitle("Notification")
                                .setContentText("This is a notification for you");
                NotificationManager notificationManager=(NotificationManager)getSystemService(NOTIFICATION_SERVICE);
                notificationManager.notify(0,mbuilder.build());

            }
        });

    }
}