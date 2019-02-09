package com.example.day04;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    LinearLayout cont;
    LayoutInflater inflater;
    TextView tv3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        cont = findViewById(R.id.container);
        tv3 = findViewById(R.id.textView3);

        inflater.inflate(R.layout.sub1, cont, true);// 시작할 때부터 sub1으로 시작하고 싶을때.
    }

    public void xmlChange1(View v) {
        EditText et = cont.findViewById(R.id.editText);
        String str = et.getText().toString();

        CheckBox cb1 = cont.findViewById(R.id.checkBox1);
        CheckBox cb2 = cont.findViewById(R.id.checkBox2);
        CheckBox cb3 = cont.findViewById(R.id.checkBox3);
        Boolean isChecked1 = cb1.isChecked();
        Boolean isChecked2 = cb2.isChecked();
        Boolean isChecked3 = cb3.isChecked();

        cont.removeAllViews();
        inflater.inflate(R.layout.sub1, cont, true);

        tv3.setText("현재: sub1");

        et = cont.findViewById(R.id.editText);
        et.setText(str);

        cb1 = cont.findViewById(R.id.checkBox1);
        cb2 = cont.findViewById(R.id.checkBox2);
        cb3 = cont.findViewById(R.id.checkBox3);
        cb1.setChecked(isChecked1);
        cb2.setChecked(isChecked2);
        cb3.setChecked(isChecked3);
    }

    public void xmlChange2(View v) {
        EditText et = cont.findViewById(R.id.editText);
        String str = et.getText().toString();

        CheckBox cb1 = cont.findViewById(R.id.checkBox1);
        CheckBox cb2 = cont.findViewById(R.id.checkBox2);
        CheckBox cb3 = cont.findViewById(R.id.checkBox3);
        Boolean isChecked1 = cb1.isChecked();
        Boolean isChecked2 = cb2.isChecked();
        Boolean isChecked3 = cb3.isChecked();


        cont.removeAllViews();
        inflater.inflate(R.layout.sub2, cont, true);

        tv3.setText("현재: sub2");

        et = cont.findViewById(R.id.editText);
        et.setText(str);

        cb1 = cont.findViewById(R.id.checkBox1);
        cb2 = cont.findViewById(R.id.checkBox2);
        cb3 = cont.findViewById(R.id.checkBox3);
        cb1.setChecked(isChecked1);
        cb2.setChecked(isChecked2);
        cb3.setChecked(isChecked3);
    }
}
