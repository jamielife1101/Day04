package com.example.pdfviewer;

import android.Manifest;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.os.StrictMode;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);

        ActivityCompat.requestPermissions(this,
                new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},
                1);
        StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder();
        StrictMode.setVmPolicy(builder.build());
    }

    public void pdfOpen(View v) {
        String  sdCardPath = Environment.getExternalStorageDirectory().getAbsolutePath();
        File file = new File(sdCardPath+"/ADSP요약정리.pdf");
        Uri uri = Uri.fromFile(file);

        Intent intent = new Intent(Intent.ACTION_VIEW);

        intent.setDataAndType(uri, "application/pdf");
//        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }

    public void imgOpen(View v) {
        String  sdCardPath = Environment.getExternalStorageDirectory().getAbsolutePath();
//        String  sdCardPath = Environment.getExternalStorageDirectory().toString();
        Toast.makeText(getApplicationContext(), sdCardPath, Toast.LENGTH_SHORT).show();
        File file = new File(sdCardPath+"/Cats/"+editText.toString()+".jpg");
        Uri uri = Uri.fromFile(file);

        Intent intent = new Intent(Intent.ACTION_VIEW);

        intent.setDataAndType(uri, "image/*");
//        intent.setFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
        startActivity(intent);
    }
}
