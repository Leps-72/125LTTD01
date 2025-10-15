package com.example.baikiemtragk;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {
    EditText editName, editAge;
    Button btnSend;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        editName = findViewById(R.id.editName);
        editAge = findViewById(R.id.editAge);
        btnSend = findViewById(R.id.btnSend);

        btnSend.setOnClickListener(v ->
                String name = editName.getText().toString().trim();
                String age = editAge.getText().toString().trim();

                if(name.isEmpty() || age.isEmpty()) {
                    Toast.makeText(this, "Vui long nhap thong tin");
                    return;
                }
                try{
                    int tuoi = Integer.parseInt(age);
                    Intent intent = new Intent(MainActivity.this, la)

        });
    }
}