package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.View;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String[] monHoc = {"Toán", "Lý", "Hóa", "Văn", "Sinh"};
    int[] mauNen = {
            Color.RED,
            Color.BLUE,
            Color.GREEN,
            Color.YELLOW,
            Color.MAGENTA
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listViewMonHoc);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                monHoc
        ) {
            @Override
            public View getView(int position, View convertView, android.view.ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                view.setBackgroundColor(mauNen[position % mauNen.length]);
                return view;
            }
        };

        listView.setAdapter(adapter);
    }
}
