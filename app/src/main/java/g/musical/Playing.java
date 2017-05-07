package g.musical;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class Playing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing);


        final View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.button_local:
                        switchToLocal();
                        break;
                    case R.id.button_lyrics:
                        switchToLyrics();
                        break;
                    case R.id.button_notifications:
                        switchToNotifications();
                        break;
                    case R.id.button_online:
                        switchToOnline();
                        break;
                    case R.id.button_prev:
                        // play previous song
                        break;
                    case R.id.button_next:
                        // play next song
                        break;
                    case R.id.button_play_pause:
                        // play or pause current song
                        break;
                }
            }
        };

        findViewById(R.id.button_playing).setOnClickListener(clickListener);
        findViewById(R.id.button_local).setOnClickListener(clickListener);
        findViewById(R.id.button_lyrics).setOnClickListener(clickListener);
        findViewById(R.id.button_next).setOnClickListener(clickListener);
        findViewById(R.id.button_notifications).setOnClickListener(clickListener);
        findViewById(R.id.button_online).setOnClickListener(clickListener);
        findViewById(R.id.button_play_pause).setOnClickListener(clickListener);
        findViewById(R.id.button_prev).setOnClickListener(clickListener);
    }


    public void switchToLocal() {
        Intent intent = new Intent(this, Local.class).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        startActivity(intent);
    }

    public void switchToOnline() {
        Intent intent = new Intent(this, Online.class).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        startActivity(intent);
    }

    public void switchToLyrics() {
        Intent intent = new Intent(this, Lyrics.class).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        startActivity(intent);
    }

    public void switchToNotifications() {
        Intent intent = new Intent(this, Notifications.class).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        startActivity(intent);
    }

}
