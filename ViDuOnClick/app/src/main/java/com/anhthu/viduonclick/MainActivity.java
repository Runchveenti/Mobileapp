package com.anhthu.viduonclick;

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
        //,...
    }
    void findControls(){
        editText_Name = findViewById(R.id.editName);
        buttonSayHi = findViewById(R.id.btnHello);
        buttonXinChao = findViewById(R.id.btnXinChao);
    }

    //Viết hàm xử ly sự kiện ở đây
    public void XuLyNoiHello(View v ){
        // Buoc 1. Tim dieu khien
        EditText editText_Name = findViewById(R.id.editName);
            // tu day, ta dung bien editText_Name de lam viec
        // Buoc 2.
           // lay chuoi user nhap
        String strName = editText_Name.getText().toString();

        // Xuat theo yeu cau
        String strThongBao = "Nice to see you \n" + strName;
        Toast.makeText(this, strThongBao, Toast.LENGTH_LONG).show();
    }
    public void XuLyNoiXinChao(View v){
        String strName = editText_Name.getText().toString();
        String strThongBao = "Xin chao ban \n" + strName;
        Toast.makeText(this, strThongBao, Toast.LENGTH_LONG).show();
    }
}

