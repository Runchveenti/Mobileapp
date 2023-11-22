package vn.edu.tinhoc123.bookmanappsqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Tạo cơ sở dữ liệu
        SQLiteDatabase dbSach;
        dbSach = openOrCreateDatabase("QuanLySach.db", MODE_PRIVATE, null);

        // Tạo bảng BOOKS
            // chú ý xoá bảng nếu tồn tại
            dbSach.execSQL("DROP TABLE IF EXISTS BOOKS");
        String sqlTaoBangBook="CREATE TABLE BOOKS(BookID integer PRIMARY KEY," +
                                                            "BookName text, " +
                                                            "Page integer, " +
                                                            "Price Float, " +
                                                            "Description text)";
        dbSach.execSQL(sqlTaoBangBook);

        dbSach.close();

        // Chèn 1 bản ghi

        String sqlThem = "INSERT INTO BOOKS VALUES(1," +
                                                    "'Lập trình Java'," +
                                                    "100, " +
                                                    "9.99, " +
                                                    "'Lập trình Java của NXB ABC'"+")";
        dbSach.execSQL(sqlThem);

        String sqlThem1 = "INSERT INTO BOOKS VALUES(2," +
                                                    "'Lập trình Java'," +
                                                    "108, " +
                                                    "12.09, " +
                                                    "'Lập trình Android toàn tập'"+")";
        dbSach.execSQL(sqlThem1);
        dbSach.close();
    }
    public void SangManHinhDuyet(View v){
        Intent intent = new Intent( getBaseContext(),
                                    BookNavigationActivity.class);
    }
}