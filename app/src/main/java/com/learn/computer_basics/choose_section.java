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

public class choose_section extends AppCompatActivity {
    Button to_hardware, to_software;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_section);
        Toolbar toolbar = findViewById(R.id.tool);
        setSupportActionBar(toolbar);
        to_software=findViewById(R.id.software_button);
        to_software.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(choose_section.this, sofware_menu.class);
                startActivity(intent);
            }
        });
        to_hardware=findViewById(R.id.hardware_button);
        to_hardware.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(choose_section.this, hardware_menu.class);
                startActivity(intent);
            }
        });
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int itemId = item.getItemId();
        if (itemId==R.id.back_to){
            getOnBackPressedDispatcher().onBackPressed();
        }
        if (itemId==R.id.about_us){
            Intent intent = new Intent(choose_section.this, about_us_menu.class );
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