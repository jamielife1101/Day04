package com.example.intent;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v13.view.inputmethod.EditorInfoCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class Abcd extends AppCompatActivity {

    EditText editText2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abcd);
        editText2 = findViewById(R.id.editText2);

        Intent main = getIntent();
//        int data = main.getIntExtra("num",0);
//        Log.i("num", data+"");
//        editText2.setText(data+"");

        editText2.setText(main.getStringExtra("editText1"));
    }

    public void goToMain(View v) {

//        Intent main = new Intent(getApplicationContext(), MainActivity.class);
//        startActivity(main);
//        startActivityForResult(main, 0001);
    }

    public void finish(View v) {
        Intent intent = new Intent();
        intent.putExtra("editText2",editText2.getText().toString());
        setResult(RESULT_OK, intent);
        this.finish();
    }
}
