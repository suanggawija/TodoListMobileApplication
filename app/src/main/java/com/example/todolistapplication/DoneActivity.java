package com.example.todolistapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DoneActivity extends AppCompatActivity {
    Button upcoming_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_done);
        upcoming_btn = findViewById(R.id.upcoming_btn);

        upcoming_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent upcomingbtn = new Intent(DoneActivity.this, MainActivity.class);
                startActivity(upcomingbtn);
            }
        });
    }
}