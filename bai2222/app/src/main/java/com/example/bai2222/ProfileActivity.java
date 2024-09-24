package com.example.bai2222;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView; // Nhập ImageView
import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m001_act_profile); // Hiển thị giao diện 2

        // Tìm kiếm ImageView và thiết lập sự kiện click
        ImageView callIcon = findViewById(R.id.call_icon);
        callIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Tạo Intent để mở ứng dụng gọi điện
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:123456789")); // Thay thế bằng số điện thoại bạn muốn gọi
                startActivity(intent);
            }
        });
    }
}

