package com.learn.computer_basics;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class external_menu extends AppCompatActivity {
    Button to_monitor, to_mose, to_keyboard, to_speaker, to_webcam, to_usb, to_case, to_joystick, to_wifi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_external_menu);
        Toolbar toolbar = findViewById(R.id.tool);
        setSupportActionBar(toolbar);


        to_monitor = findViewById(R.id.to_monitor);
        to_monitor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(external_menu.this, monitor_menu.class);
                startActivity(intent);
            }
        }
        );
        to_mose = findViewById(R.id.to_mouse);
        to_mose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(external_menu.this, mouse_menu.class);
                startActivity(intent);
            }
        }
        );
        to_keyboard = findViewById(R.id.to_keyboard);
        to_keyboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(external_menu.this, keyboard_menu.class);
                startActivity(intent);
            }
        }
        );
        to_speaker = findViewById(R.id.to_speaker);
        to_speaker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(external_menu.this, speaker_menu.class);
                startActivity(intent);
            }
        }
        );
        to_webcam = findViewById(R.id.to_webcam);
        to_webcam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(external_menu.this, webcam_menu.class);
                startActivity(intent);
            }
        }
        );
        to_case = findViewById(R.id.to_case);
        to_case.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(external_menu.this, case_menu.class);
                startActivity(intent);
            }
        }
        );
        to_joystick = findViewById(R.id.to_joystick);
        to_joystick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(external_menu.this, joystick_menu.class);
                startActivity(intent);
            }
        }
        );
        to_wifi = findViewById(R.id.to_wireless);
        to_wifi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(external_menu.this, wifi_menu.class);
                startActivity(intent);
            }
        }
        );
        to_usb = findViewById(R.id.to_usb);
        to_usb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(external_menu.this, usb_menu.class);
                startActivity(intent);
            }
        }
        );

    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int itemId = item.getItemId();
        if (itemId==R.id.back_to){
            getOnBackPressedDispatcher().onBackPressed();
        }
        if (itemId==R.id.about_us){
            Intent intent = new Intent(external_menu.this, about_us_menu.class );
            startActivity(intent);
        }
        if (itemId == R.id.exit){
            moveTaskToBack(true);
            android.os.Process.killProcess(android.os.Process.myPid());
            System.exit(1);
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = new MenuInflater(this);
        menuInflater.inflate(R.menu.menu_bar, menu);
        return (true);
    }

}