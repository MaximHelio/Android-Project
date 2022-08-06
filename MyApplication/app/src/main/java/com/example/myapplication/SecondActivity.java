package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        String error = getIntent().getStringExtra("error");
        Log.d(SecondActivity.class.getSimpleName(), "onCreate: "+error);
        TextView errorMsg = findViewById(R.id.errorMsg);
        errorMsg.getText();
        errorMsg.setText(error);
    }
}