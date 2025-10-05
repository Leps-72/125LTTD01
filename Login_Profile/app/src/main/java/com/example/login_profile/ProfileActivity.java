package com.example.login_profile; // sửa theo package của bạn

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.ImageView;

public class ProfileActivity extends AppCompatActivity {

    TextView txtProfileName, txtFriends, txtFollowers, txtEmail, txtPhone, txtSkype, txtWeb;
    ImageView imgProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        txtProfileName = findViewById(R.id.txtProfileName);
        txtFriends = findViewById(R.id.txtFriends);
        txtFollowers = findViewById(R.id.txtFollowers);
        txtEmail = findViewById(R.id.txtEmail);
        txtPhone = findViewById(R.id.txtPhone);
        txtSkype = findViewById(R.id.txtSkype);
        txtWeb = findViewById(R.id.txtWeb);
        imgProfile = findViewById(R.id.imgProfile);

        // Dữ liệu mẫu
        txtProfileName.setText("Huỳnh Nguyễn");
        txtFriends.setText("125 Friends");
        txtFollowers.setText("250 Followers");
        txtEmail.setText("Email: mail@email.com");
        txtPhone.setText("Phone: +99 999 555 222");
        txtSkype.setText("Skype: me007");
        txtWeb.setText("Web: cssauthor.com");
    }
}
