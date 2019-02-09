package com.example.intent;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);
    }

    public void goToAbcd(View v) {

        Intent abcd = new Intent(getApplicationContext(), Abcd.class);

        abcd.putExtra("editText1", editText.getText().toString());

//        startActivity(abcd);
        startActivityForResult(abcd, 0002);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            editText.setText(data.getStringExtra("editText2"));
        }
    }
}
