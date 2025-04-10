package com.learn.computer_basics;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Delay for 3 seconds (3000 milliseconds) and then go to the next activity
        new Handler().postDelayed(() -> {
            // Intent to navigate to NextActivity
            Intent intent = new Intent(MainActivity.this, main_menu.class);
            startActivity(intent);
            finish(); // Close the current activity
        }, 3000); // 3000 milliseconds = 3 seconds
    }
}