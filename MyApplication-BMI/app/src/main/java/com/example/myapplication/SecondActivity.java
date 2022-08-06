package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        String answer = getIntent().getStringExtra("answer");
        TextView answerMsg = findViewById(R.id.answer);
        answerMsg.setText(answer);

        String error = getIntent().getStringExtra("error");
        Log.d(SecondActivity.class.getSimpleName(), "onCreate: "+error);
        TextView errorMsg = findViewById(R.id.errorMsg);
        errorMsg.getText();
        errorMsg.setText(error);
    }
}