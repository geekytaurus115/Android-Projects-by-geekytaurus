package com.example.notificationsexample;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

public class MainActivity extends AppCompatActivity {
    private static final String CHANNEL_ID = "My Channel";
    private static final int NOTIFICATION_ID = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Drawable drawable = ResourcesCompat.getDrawable(getResources(), R.drawable.icon, null);
        BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;

        Bitmap largeIcon = bitmapDrawable.getBitmap();

        // NotificationManager instance
        NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

        // Build the notification
        Notification notification;

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            // Create a notification channel (required for Android Oreo and higher)
            NotificationChannel channel = new NotificationChannel(CHANNEL_ID, "New Channel", NotificationManager.IMPORTANCE_HIGH);
            nm.createNotificationChannel(channel);

            notification = new Notification.Builder(this, CHANNEL_ID)
                    .setLargeIcon(largeIcon) // PNG
                    .setSmallIcon(R.drawable.icon)
                    .setContentText("New Message")
                    .setSubText("New Message of Raman")
                    .setChannelId(CHANNEL_ID)
                    .build();
        } else {
            notification = new Notification.Builder(this)
                    .setLargeIcon(largeIcon) // PNG
                    .setSmallIcon(R.drawable.icon)
                    .setContentText("New Message")
                    .setSubText("New Message of Raman")
                    .build();
        }

        // Notify using the notification ID
        nm.notify(NOTIFICATION_ID, notification);
    }
}
