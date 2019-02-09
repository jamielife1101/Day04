package com.example.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToAbcd(View v) {

        Intent abcd = new Intent(getApplicationContext(), Abcd.class);

        abcd.putExtra("num", 1234);

        startActivity(abcd);

    }
}
