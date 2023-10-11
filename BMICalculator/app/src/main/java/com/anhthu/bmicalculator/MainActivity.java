package com.anhthu.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn.setOnClickListener {
            val h = (height.text).toString().toFloat() / 100;
            val w = weight.text.toString().toFloat();
            val res = w/(h*h);
            result.text = "%.2f".format(res);
        }
    }
}
