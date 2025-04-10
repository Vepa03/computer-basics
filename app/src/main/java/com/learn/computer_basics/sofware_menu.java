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

public class sofware_menu extends AppCompatActivity {
    Button to_def_software, to_system_software, to_app_software, to_programming_software, to_function_software, software_vs_hardware, to_example_software;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sofware_menu);
        Toolbar toolbar = findViewById(R.id.tool);
        setSupportActionBar(toolbar);

        to_def_software = findViewById(R.id.to_software_def);
        to_def_software.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sofware_menu.this, definition_software.class);
                startActivity(intent);
            }
        }
        );
        to_system_software = findViewById(R.id.to_system_software);
        to_system_software.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sofware_menu.this, system_software.class);
                startActivity(intent);
            }
        }
        );
        to_app_software = findViewById(R.id.to_application_software);
        to_app_software.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sofware_menu.this, application_software.class);
                startActivity(intent);
            }
        }
        );
        to_programming_software = findViewById(R.id.to_programming_software);
        to_programming_software.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sofware_menu.this, programming_software.class);
                startActivity(intent);
            }
        }
        );
        to_function_software = findViewById(R.id.to_functions_software);
        to_function_software.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sofware_menu.this, function_software.class);
                startActivity(intent);
            }
        }
        );
        software_vs_hardware = findViewById(R.id.to_software_hardware);
        software_vs_hardware.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sofware_menu.this, software_hardware.class);
                startActivity(intent);
            }
        }
        );
        to_example_software = findViewById(R.id.to_examples_software);
        to_example_software.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sofware_menu.this, example_software.class);
                startActivity(intent);
            }
        }
        );

    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int itemId = item.getItemId();
        if (itemId==R.id.back_to) {
            getOnBackPressedDispatcher().onBackPressed();
        }
        if (itemId==R.id.about_us){
            Intent intent = new Intent(sofware_menu.this, about_us_menu.class );
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