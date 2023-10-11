package vn.thomc.listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> dsBaiHat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findControls();
        //b1.Chuẩn bị nguồn dữ liệu, cất vào biến
        dsBaiHat = new ArrayList<String>();
        dsBaiHat.add("Tiến quân ca");
        dsBaiHat.add("Dòng máu lạc hồng");
        dsBaiHat.add("Hà Nội mùa thu");
        dsBaiHat.add("Nha Trang mùa thu");
        dsBaiHat.add("Gần lắm trường sa");
        //b2. Tạo adapter
        ArrayAdapter<String> adapterBH;
        adapterBH = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1, //bố cục
                dsBaiHat   // nguồn dữ liệu
        );
        //b3. gắn adapter
        listViewBaiHat.setAdapter(adapterBH);
    }
    public  void findControls() {
        listViewBaiHat = findViewById(R.id.lvBaiHat);
    }
    ListView listViewBaiHat;
}