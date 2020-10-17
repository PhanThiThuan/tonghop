package com.example.tonghop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tonghop.R;

public class MainActivity2 extends AppCompatActivity {
    ImageView imageView;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        imageView = findViewById(R.id.image_view);
        textView = findViewById(R.id.text_view);

        Intent intent = getIntent();
        String name;
        int numberImage = intent.getIntExtra("image",0);
        String numberWord = intent.getStringExtra("Word");
        imageView.setImageResource(numberImage);
        textView.setText(numberWord);
    }
}