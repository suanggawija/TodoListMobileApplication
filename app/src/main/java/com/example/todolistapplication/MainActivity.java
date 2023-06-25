package com.example.todolistapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button add_button, edit_button, done_btn, logout_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add_button = findViewById(R.id.add_button);
        edit_button = findViewById(R.id.edit);
        done_btn = findViewById(R.id.done_btn);
        logout_button = findViewById(R.id.logout_buttonn);

        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent addButton = new Intent(MainActivity.this, EditorActivity.class);
                startActivity(addButton);
            }
        });

        edit_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aditButton = new Intent(MainActivity.this, EditorActivity.class);
                startActivity(aditButton);
            }
        });

        done_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent doneBtn = new Intent(MainActivity.this, DoneActivity.class);
                startActivity(doneBtn);
            }
        });

        logout_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent logoutButton = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(logoutButton);
            }
        });


    }
}