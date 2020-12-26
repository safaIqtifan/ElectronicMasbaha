package com.example.electronicmasbaha;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int count= 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       final Button clickBtn = findViewById(R.id.Click_BTN);
       final ImageView reasetBtn = findViewById(R.id.Reaset);
       final TextView tv = findViewById(R.id.countScreen);


       clickBtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               count++;
               tv.setText(count+"");
           }
       });

        reasetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count=0;
                tv.setText(count+"");
            }
        });

    }
}
