package vn.edu.tinhoc123.bookmanappsqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class BookNavigationActivity extends AppCompatActivity {
    SQLiteDatabase dbSach;
    Cursor controBanGhi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_navigation);
        // Mở Cơ sở dữ liệu
        dbSach = openOrCreateDatabase("Sach.db", MODE_PRIVATE, null);
        // Đọc toàn bộ bảng Book
        controBanGhi = dbSach.rawQuery("Select * from BOOKS", null);
        // Chuyển con trỏ về bản ghi đầu tiên
        controBanGhi.moveToFirst();
        // Hiện bản ghi đầu tiên này lên màn hình
        public void CapNhatManHinhTheoConTro() {
            // lấy dữ liệu ở dòng hiện tại đang được trỏ bởi controBanGhi
            int maSach = controBanGhi.getInt(0);
            String tenSach = controBanGhi.getString(1);
            int soTrang = controBanGhi.getInt(2);
            float gia = controBanGhi.getFloat(3);
            String mota = controBanGhi.getString(4);
            // đặt vào các điều khiển
            EditText edMaSach = findViewById(R.id.edMaSach);
            EditText edTenSach = findViewById(R.id.edTenSach);
            edMaSach.setText(String.valueOf(maSach));
            edTenSach.setText(tenSach);
        }
            Button btnFirst = findViewById(R.id.btnDauTien);
            Button btnNext = findViewById(R.id.btnTiepTheo);

            btnNext.setOnClickListener(xuLyNext);
            btnFirst.setOnClickListener(xuLyFirst);

//========================= CÁC BỘ LẮNG NGHE ========================//
        View.OnClickListener xuLyNext = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!controBanGhi.isLast()) {
                    controBanGhi.moveToNext();
                    // Lấy dữ liệu và cập nhật lên màn hình
                }
            }
        };
        View.OnClickListener xuLyFirst = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!controBanGhi.isFirst()) {
                    controBanGhi.moveToFirst();
                    // Lấy dữ liệu và cập nhật lên màn hình
                }
            }
        }
    }
}