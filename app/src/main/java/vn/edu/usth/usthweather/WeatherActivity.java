package vn.edu.usth.usthweather;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        Log.i("WeatherActivity", "onCreate");

        ForecastFragment forecastFragment = new ForecastFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.fragment_container, forecastFragment); // Add ForecastFragment to the container
        transaction.commit();
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
