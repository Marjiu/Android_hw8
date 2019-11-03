package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.NumberFormat;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main2);
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(2);
        final Button button = (Button) findViewById(R.id.reset);
        Intent intent = getIntent();
        float bmi = intent.getFloatExtra("BMI_EXTRA", 0);
        TextView result = (TextView) findViewById(R.id.textView_1);
        result.setText("您的BMI值為:"+nf.format(bmi));
        TextView dia = (TextView)findViewById(R.id.textView_2);

        if (bmi<18.5)
            dia.setText("診斷結果為: 體重過輕");
        else if (18.5 <= bmi && bmi< 24)
            dia.setText("診斷結果為: 正常範圍");
        else if (24 <=bmi && bmi < 27)
            dia.setText("診斷結果為: 過重");
        else if (27 <=bmi && bmi < 30)
            dia.setText("診斷結果為: 輕度肥胖");
        else if (30 <= bmi && bmi < 35)
            dia.setText("診斷結果為: 中度肥胖");
        else if (bmi >= 35)
            dia.setText("診斷結果為: 重度肥胖");
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}