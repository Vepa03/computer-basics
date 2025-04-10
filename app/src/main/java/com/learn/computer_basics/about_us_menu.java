package com.learn.computer_basics;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class about_us_menu extends AppCompatActivity {

    TextView to_gmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us_menu);
        Toolbar toolbar = findViewById(R.id.tool);
        setSupportActionBar(toolbar);
        TextView textView = findViewById(R.id.about_text_link_1);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        to_gmail =findViewById(R.id.about_text_link_2);
        to_gmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(about_us_menu.this, gmail_menu.class);
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
            Intent intent = new Intent(about_us_menu.this, about_us_menu.class );
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