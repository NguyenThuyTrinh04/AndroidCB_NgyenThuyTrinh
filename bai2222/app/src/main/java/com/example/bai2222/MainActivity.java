package com.example.bai2222;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.content.Intent;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.LinearLayout;
import android.os.Bundle; // Thư viện để sử dụng Bundle
import android.os.Handler; // Thư viện để sử dụng Handler
import android.view.View;


public class MainActivity extends AppCompatActivity {
    private LinearLayout layoutActivity1;
    private LinearLayout layoutActivity2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Kiểm tra xem activity_main.xml có tồn tại


        // Sử dụng Handler để trì hoãn việc chuyển đổi giao diện
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Chuyển sang giao diện 2
                Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(intent);
                finish(); // Kết thúc MainActivity nếu không muốn quay lại
            }
        }, 3000); // 3000 ms = 3 giây
}}
