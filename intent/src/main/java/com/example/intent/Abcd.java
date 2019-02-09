package com.example.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Abcd extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abcd);
    }

    public void goToMain(View v) {

        Intent main = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(main);
    }

    public void finish(View v) {

        this.finish();
    }
}
