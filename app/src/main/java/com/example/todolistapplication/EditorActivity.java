package com.example.todolistapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EditorActivity extends AppCompatActivity {
    Button save_button, kembali;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editor);
        save_button = findViewById(R.id.save_button);
        kembali = findViewById(R.id.kembali);
        save_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent saveButton = new Intent(EditorActivity.this, MainActivity.class);
                startActivity(saveButton);
            }
        });

        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kembaliButton = new Intent(EditorActivity.this, MainActivity.class);
                startActivity(kembaliButton);
            }
        });
    }
}