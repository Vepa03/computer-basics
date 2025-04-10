package com.learn.computer_basics;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class gmail_menu extends AppCompatActivity {
    Button send_email;
    EditText to_email, subject_email, about_email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gmail_menu);
        Toolbar toolbar = findViewById(R.id.tool);
        setSupportActionBar(toolbar);
        send_email = findViewById(R.id.send_gmail_id);
        subject_email = findViewById(R.id.subject_name_id);
        about_email = findViewById(R.id.compose_email_id);
        to_email = findViewById(R.id.send_to_gmail_name);

        send_email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String subject_name_id = subject_email.getText().toString().trim();
                String compose_email_id = about_email.getText().toString().trim();
                String send_to_gmail_name = to_email.getText().toString().trim();

                if (subject_name_id.isEmpty() || compose_email_id.isEmpty() || send_to_gmail_name.isEmpty()) {
                    Toast.makeText(gmail_menu.this, "All fields are required", Toast.LENGTH_SHORT).show();
                } else {
                    sendEmail(subject_name_id, compose_email_id, send_to_gmail_name);
                }
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
            Intent intent = new Intent(gmail_menu.this, about_us_menu.class );
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
    public void sendEmail(String subject_name_id, String compose_email_id, String send_to_gmail_name ) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{send_to_gmail_name});
        intent.putExtra(Intent.EXTRA_SUBJECT, subject_name_id);
        intent.putExtra(Intent.EXTRA_TEXT, compose_email_id);
        intent.setType("message/rfc822");

        try {
            startActivity(Intent.createChooser(intent, "Choose please"));
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(gmail_menu.this, "No email client is installed.", Toast.LENGTH_SHORT).show();
        }
    }
}