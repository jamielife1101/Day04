package com.example.day04;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout cont;
    LayoutInflater inflater;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        cont = findViewById(R.id.container);

        inflater.inflate(R.layout.sub1, cont, true);// 시작할 때부터 sub1으로 시작하고 싶을때.
    }

    public void xmlChange1(View v) {
        cont.removeAllViews();
        inflater.inflate(R.layout.sub1, cont, true);
    }

    public void xmlChange2(View v) {
        cont.removeAllViews();
        inflater.inflate(R.layout.sub2, cont, true);
    }
}
