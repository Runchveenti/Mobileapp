package com.maicuongtho.vidubolangngheandanh;

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
        // cài đặt bộ lắng nghe + xử lý sự kiện cho mỗi nút
        buttonSayHi.setOnClickListener(boLangNgheHello);
        buttonXinChao.setOnClickListener(boLangNgheXinChao);
    }






    View.OnClickListener boLangNgheHello = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

        }
    };
    View.OnClickListener boLangNgheXinChao = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            // code ở đây
            String strName =  editText_Name.getText().toString();
            String strThongBao = "Xin chào \n" + strName;
            Toast.makeText(MainActivity.this, strThongBao, Toast.LENGTH_LONG).show();
        }
    };
    void findControls() {
        editText_Name= findViewById(R.id.edtName);
        buttonSayHi = findViewById(R.id.btnHello);
        buttonXinChao = findViewById(R.id.btnXinChao);
    }
}