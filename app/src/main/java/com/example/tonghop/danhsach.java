package com.example.tonghop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class danhsach extends AppCompatActivity {
    ListView listView;

    String [] numberWord = {"banh xèo","bún đậu","gỏi sứa","nem chua","ốc","súp cua"};
    int [] numberImage = {R.drawable.banhxeo,R.drawable.bundau,R.drawable.goisua,R.drawable.nemchua,R.drawable.oc,R.drawable.supcua};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.list_view);
        MainAdapter adapter = new MainAdapter (danhsach.this,numberWord,numberImage);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(danhsach.this,MainActivity2.class);
                String name;
                intent.putExtra("image",numberImage[position]);
                intent.putExtra("word",numberImage[position]);
                startActivity(intent);
            }
        });
    }
}