package com.example.todolistapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomeActivity extends AppCompatActivity {
    Button register_button, login_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        register_button = findViewById(R.id.welcome_register_button);
        login_button = findViewById(R.id.welcome_login_button);

        register_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerButton = new Intent(WelcomeActivity.this, RegisterActivity.class);
                startActivity(registerButton);
            }
        });
        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginButton = new Intent(WelcomeActivity.this, LoginActivity.class);
                startActivity(loginButton);
            }
        });
    }
}