package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public double bmi(int height, int weight) {
        double result = height - weight * 0.9;
        System.out.println("BMI:" + result);
        return result;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText weight = findViewById(R.id.weight);
        EditText height = findViewById(R.id.height);
        EditText name = findViewById(R.id.name);
        weight.toString();

        TextView result = findViewById(R.id.result);
        Button btn = findViewById(R.id.confirm_button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    double ans = bmi(Integer.parseInt(height.toString()), Integer.parseInt(weight.toString()));
//                    result.setText();
                    String answer = name.toString()+"님은 "+ans;
                }catch (NumberFormatException e){
                    e.printStackTrace();
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    intent.putExtra("error", e.getMessage());
                    startActivity(intent);
                }
            }
        });

    }

}