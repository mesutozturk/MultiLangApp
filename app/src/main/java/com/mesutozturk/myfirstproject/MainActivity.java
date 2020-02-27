package com.mesutozturk.myfirstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView txtGreeting;
    Button btnMagic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtGreeting = findViewById(R.id.textViewGreeting);
        btnMagic = findViewById(R.id.buttonMagic);

        btnMagic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // context is the main activity
                Toast.makeText(MainActivity.this, R.string.magic_text, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
