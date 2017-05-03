package g.musical;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    final FragmentManager fragmentManager = getSupportFragmentManager();

    final Fragment fragment1 = new Lyrics();
    final Fragment fragment2 = new Notifications();
    final Fragment fragment3 = new Offline();
    final Fragment fragment4 = new Online();
    final Fragment fragment5 = new Playing();

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_local:
                    fragmentManager.beginTransaction().replace(R.id.content, fragment3).commit();
                    return true;
                case R.id.navigation_online:
                    fragmentManager.beginTransaction().replace(R.id.content, fragment4).commit();
                    return true;
                case R.id.navigation_playing:
                    fragmentManager.beginTransaction().replace(R.id.content, fragment5).commit();
                    return true;
                case R.id.navigation_lyrics:
                    fragmentManager.beginTransaction().replace(R.id.content, fragment1).commit();
                    return true;
                case R.id.navigation_notifications:
                    fragmentManager.beginTransaction().replace(R.id.content, fragment2).commit();
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        fragmentManager.beginTransaction().replace(R.id.content, fragment3).commit();
    }
}
