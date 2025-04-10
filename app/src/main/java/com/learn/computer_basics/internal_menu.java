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

public class internal_menu extends AppCompatActivity {

    Button to_motherboard, to_cpu, to_hardware, to_ram, to_ssd, to_graphics, to_dvd_drive, to_power_supply, to_cooling_system;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internal_menu);
        Toolbar toolbar = findViewById(R.id.tool);
        setSupportActionBar(toolbar);

        to_motherboard = findViewById(R.id.to_motherboard);
        to_motherboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(internal_menu.this, mother_board_menu.class);
                startActivity(intent);
            }
        }
        );
        to_cpu = findViewById(R.id.to_cpu);
        to_cpu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(internal_menu.this, cpu_menu.class);
                startActivity(intent);
            }
        }
        );
        to_hardware = findViewById(R.id.to_hard_drive);
        to_hardware.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(internal_menu.this, hard_drive_menu.class);
                startActivity(intent);
            }
        }
        );
        to_ram = findViewById(R.id.to_ram);
        to_ram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(internal_menu.this, ram_menu.class);
                startActivity(intent);
            }
        }
        );
        to_ssd = findViewById(R.id.to_ssd);
        to_ssd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(internal_menu.this, ssd_menu.class);
                startActivity(intent);
            }
        }
        );
        to_graphics = findViewById(R.id.to_graphic_card);
        to_graphics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(internal_menu.this, graphic_card_menu.class);
                startActivity(intent);
            }
        }
        );
        to_dvd_drive = findViewById(R.id.to_dvd);
        to_dvd_drive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(internal_menu.this, dvd_menu.class);
                startActivity(intent);
            }
        }
        );
        to_power_supply = findViewById(R.id.to_power_supply);
        to_power_supply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(internal_menu.this, power_supply.class);
                startActivity(intent);
            }
        }
        );
        to_cooling_system = findViewById(R.id.to_cooler);
        to_cooling_system.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(internal_menu.this, cooling_system_menu.class);
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
            Intent intent = new Intent(internal_menu.this, about_us_menu.class );
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