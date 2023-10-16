package com.anhthu.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    EditText editHeight, editWeight;
    Button btn;
    TextView BMI, status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findControls();
    }
    public void cal_BMI(View view){
        float height = Float.parseFloat(editHeight.getText().toString());
        float weight = Float.parseFloat(editWeight.getText().toString());
        String result;
        height = height/100;
        float bmi = weight/(height * height);

        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        decimalFormat.format(bmi);

        BMI.setText(String.valueOf(bmi));
            if (bmi<=18.5)
                result = "Gầy";
            else if (bmi<=22.9)
                result = "Bình thường";
            else if (bmi==23)
                result = "Thừa cân";
            else if (bmi<=24.9)
                result = "Tiền béo phì";
            else if (bmi<=29.9)
                result = "Béo phì độ 1";
            else if (bmi==30)
                result = "Béo phì độ 2";
            else
                result = "Béo phì độ 3";
        status.setText(result);
    }
    void findControls(){
        EditText editHeight = findViewById(R.id.height);
        EditText editWeight = findViewById(R.id.weight);
        Button btn = findViewById(R.id.btn);
        TextView bmi = findViewById(R.id.bmi);
        TextView status = findViewById(R.id.status);
    }
}
