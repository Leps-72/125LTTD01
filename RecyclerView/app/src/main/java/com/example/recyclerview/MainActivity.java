package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerview.adapter.KyNiemAdapter;
import com.example.recyclerview.model.KyNiem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<KyNiem> dsKyNiem;
    KyNiemAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        dsKyNiem = new ArrayList<>();
        dsKyNiem.add(new KyNiem("Đà Lạt 2024_Nguyễn Huỳnh", R.drawable.dalat));
        dsKyNiem.add(new KyNiem("Phú Quốc mùa hè_23115053122319", R.drawable.phuquoc));
        dsKyNiem.add(new KyNiem("Hội An cổ kính", R.drawable.hoian));
        dsKyNiem.add(new KyNiem("Sài Gòn đêm", R.drawable.hochiminh));

        adapter = new KyNiemAdapter(this, dsKyNiem);
        recyclerView.setAdapter(adapter);
    }
}
