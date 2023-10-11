package com.anhthu.vidubolangngheandanh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText_Name;
    Button buttonSayHi, buttonXinChao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findControls();
        // cai dat bo lang nghe + xu ly su kien moi nut
        buttonSayHi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // code o day
                String strName = editText_Name.getText().toString();

                // Xuat theo yeu cau
                String strThongBao = "Nice to see you \n" + strName;
                Toast.makeText(getBaseContext(), strThongBao, Toast.LENGTH_LONG).show();

            }
        });
        buttonXinChao.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                );
            }
        });
        View.OnClickListener boLangNgheXinChao = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strName = editText_Name.getText().toString();
                String strThongBao = "Xin chao ban \n" + strName;
                Toast.makeText(MainActivity.this, strThongBao, Toast.LENGTH_LONG).show();
            }
        }
    }
        void findControls(){
            editText_Name = findViewById(R.id.editName);
            buttonSayHi = findViewById(R.id.btnHello);
            buttonXinChao = findViewById(R.id.btnXinChao);
        }
}
