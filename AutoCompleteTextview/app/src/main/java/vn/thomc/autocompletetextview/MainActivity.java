package vn.thomc.autocompletetextview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> dsQuocGia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findControls();  //b0
        //b1.Chuẩn bị nguồn dữ liệu, cất vào biến
        dsQuocGia = new ArrayList<String>();
        dsQuocGia.add("VietNam");        dsQuocGia.add("England");
        dsQuocGia.add("Australia");        dsQuocGia.add("Albania");
        dsQuocGia.add("USA");        dsQuocGia.add("Algeria");
        //b2. Tạo adapter
        ArrayAdapter<String> adapterQG;
        adapterQG = new ArrayAdapter<String>(
                       this,
                       android.R.layout.simple_dropdown_item_1line, //bố cục
                       dsQuocGia   // nguồn dữ liệu
                       );
        //b3. gắn adapter
        autoQUOCGIA.setAdapter(adapterQG);
    }
    public  void findControls() {
        autoQUOCGIA = findViewById(R.id.autoCompleteQUOCGIA);
    }
    AutoCompleteTextView autoQUOCGIA;
}