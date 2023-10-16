package com.anhthu.exercise13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText soA, soB;
    Button cong, tru, nhan, chia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findControls();

        cong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
    void findControls(){
        EditText soA = findViewById(R.id.editA);
        EditText soB = findViewById(R.id.editB);
        Button cong = findViewById(R.id.cong);
        Button nhan = findViewById(R.id.nhan);
        Button tru = findViewById(R.id.tru);
        Button chia = findViewById(R.id.chia);
    }
}