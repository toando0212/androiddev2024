package vn.edu.usth.usthweather;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;


public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        Log.i("WeatherActivity", "onCreate");

        ViewPager viewPager = findViewById(R.id.viewPager);
        TabLayout tabLayout = findViewById(R.id.tabLayout);

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new WeatherAndForecastFragment(), "HANOI, VIETNAM");
        adapter.addFragment(new WeatherAndForecastFragment(), "PARIS, FRANCE");
        adapter.addFragment(new WeatherAndForecastFragment(), "TOULOUSE, FRANCE");
        viewPager.setAdapter(adapter);

        tabLayout.setupWithViewPager(viewPager);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("WeatherActivity", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("WeatherActivity", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("WeatherActivity", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("WeatherActivity", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("WeatherActivity", "onDestroy");
    }
}
