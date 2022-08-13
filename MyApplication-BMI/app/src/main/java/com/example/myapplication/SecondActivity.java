package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.myapplication.obj.Answer;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // 정상 처리
        String answer = getIntent().getStringExtra("answer");
        TextView answerMsg = findViewById(R.id.answer);
        answerMsg.setText(answer);
        // 에러 났을 때 처리
        String error = getIntent().getStringExtra("error");
//        Log.d(SecondActivity.class.getSimpleName(), "onCreate: "+error);
        TextView errorMsg = findViewById(R.id.errorMsg);
        errorMsg.getText();
        errorMsg.setText(error);
    }
}