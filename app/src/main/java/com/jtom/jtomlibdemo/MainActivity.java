package com.jtom.jtomlibdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.jtom.zjj.JtomTest;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int c = new JtomTest().calculation(512);
        Log.d("MainActivity", "c:" + c);


    }
}