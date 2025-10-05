package com.example.login_profile;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    TextView txtProfileName, txtEmail, txtPhone, txtSkype, txtWeb, txtFriends, txtFollowers;
    TextView btnBack, btnSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        // Ánh xạ các thành phần
        txtProfileName = findViewById(R.id.txtProfileName);
        txtEmail = findViewById(R.id.txtEmail);
        txtPhone = findViewById(R.id.txtPhone);
        txtSkype = findViewById(R.id.txtSkype);
        txtWeb = findViewById(R.id.txtWeb);
        txtFriends = findViewById(R.id.txtFriends);
        txtFollowers = findViewById(R.id.txtFollowers);
        btnBack = findViewById(R.id.btnBack);
        btnSettings = findViewById(R.id.btnSettings);

        // Nhận dữ liệu từ LoginActivity (nếu có)
        Intent intent = getIntent();
        String username = intent.getStringExtra("username");
        if (username != null && !username.isEmpty()) {
            txtProfileName.setText(username);
        } else {
            txtProfileName.setText("Profile Name");
        }

        // Set dữ liệu mẫu
        txtEmail.setText("Email: mail@email.com");
        txtPhone.setText("Phone: +99 999 555 222");
        txtSkype.setText("Skype: me007");
        txtWeb.setText("Web: cssauthor.com");
        txtFriends.setText("125 Friends");
        txtFollowers.setText("250 Followers");

        // Nút quay lại LoginActivity
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backIntent = new Intent(ProfileActivity.this, LoginActivity.class);
                startActivity(backIntent);
                finish();
            }
        });

        // Nút Setting quay lại LoginActivity (giống yêu cầu đề)
        btnSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent settingIntent = new Intent(ProfileActivity.this, LoginActivity.class);
                startActivity(settingIntent);
                finish();
            }
        });
    }
}
