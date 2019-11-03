package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button = (Button) findViewById(R.id.output);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText edWeight = (EditText) findViewById(R.id.weight);
                EditText edHeight = (EditText) findViewById(R.id.Height);
                float weight = Float.parseFloat(edWeight.getText().toString());
                float height = Float.parseFloat(edHeight.getText().toString());
                float bmi =weight/((height/100)*(height/100));
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("BMI_EXTRA", bmi);
                startActivity(intent);
            }
        });
    }
}