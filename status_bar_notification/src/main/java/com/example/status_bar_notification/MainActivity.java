package com.example.status_bar_notification;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;

public class MainActivity extends AppCompatActivity {

     private NotificationManager manager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manager=(NotificationManager)getSystemService(NOTIFICATION_SERVICE);
    }
    public void onNotify(View view)
    {
        Intent intent=new Intent(this,notifiy.class);
        PendingIntent pendingIntent= PendingIntent.getActivity(this,123,intent,PendingIntent.FLAG_UPDATE_CURRENT);
        NotificationCompat.Builder builder=new NotificationCompat.Builder(this);
        builder.setSmallIcon(R.mipmap.ic_launcher).setContentTitle("Title")
                .setAutoCancel(true).setContentText("Text").setContentInfo("Info")
                .setOngoing(true).setDefaults(Notification.DEFAULT_ALL).setContentIntent(pendingIntent)
                .addAction(R.mipmap.ic_launcher,"IMP",pendingIntent);

        Notification notification=builder.build();
        manager.notify(4343,notification);
    }

}