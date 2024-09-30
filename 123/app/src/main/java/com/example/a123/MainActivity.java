package com.example.a123;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.graphics.Color;



public class MainActivity extends AppCompatActivity {

    TextView tvChangeText;
    Button btnChangeText;
    TextView tvChangeColor;
    Button btnChangeColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        this.tvChangeText = findViewById(R.id.tvChangeText);
        this.btnChangeText = findViewById(R.id.btnChangeText);
        this.btnChangeText.setOnClickListener(view -> tvChangeText.setText("Result"));


        TextView textView = findViewById(R.id.tvChangeText);
        Button button = findViewById(R.id.btnChangeColor);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Change the color of the TextVew text
                textView.setTextColor(Color.RED); // Change to red


            }
        });
    }}