package com.example.usgir.intents;

import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onEclick(View view)
    {
        Intent intent=new Intent(this,Main2Activity.class);
        startActivity(intent);
    }
    public void onIclick(View view)
    {
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        File file=new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES),"user.jpg");
        Uri uri=Uri.fromFile(file);
        intent.putExtra(MediaStore.EXTRA_OUTPUT,uri);
        startActivity(intent);
    }
}
