package com.example.kilometerstomiles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void buttonPressed(View view) {

        TextView milesText = findViewById(R.id.milesTextbox);
        TextView kilometersText = findViewById(R.id.kilometerTextbox);
        if(!kilometersText.getText().toString().isEmpty() && !milesText.getText().toString().isEmpty()) {
            Toast.makeText(MainActivity.this, "Please use one text box.",
                    (int)3).show();
            return;
        }

        if(!kilometersText.getText().toString().isEmpty() && !(kilometersText.getText().toString() == "0")) {
            double kilometers = Double.parseDouble(kilometersText.getText().toString());
            double kilometersConverted = kilometers / 1.609;
            milesText.setText("");
            Toast.makeText(MainActivity.this, "Miles: " + kilometersConverted,
                    (int)3).show();
        }

        if(!milesText.getText().toString().isEmpty() && !(milesText.getText().toString() == "0")) {
            double miles = Double.parseDouble(milesText.getText().toString());
            double milesConverted = miles * 1.609;
            kilometersText.setText("");
            Toast.makeText(MainActivity.this, "Kilometers: " + milesConverted,
                    (int)3).show();
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}