package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myapplication.obj.Person;

public class MainActivity extends AppCompatActivity {

    EditText height, weight, name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weight = findViewById(R.id.weight);
        height = findViewById(R.id.height);
        name = findViewById(R.id.name);

        TextView result = findViewById(R.id.result);
        Button btn = findViewById(R.id.confirm_button);
        btn.setOnClickListener(clickListener);

    }
    View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            try {
                Person person = new Person();
                Log.d("initHeight", "initHeight : "+ height.getText().toString());
                Log.d("initWeight", "initWeight : "+ weight.getText().toString());
                person.height = Integer.parseInt(height.getText().toString());
                person.weight = Integer.parseInt(weight.getText().toString());
                person.name = name.getText().toString();
                person.bmi = person.bmi(person.height, person.weight);
                //double ans = bmi(initHeight, initWeight);
                //result.setText();

                String answer = person.name + "님은 " + person.bmi;

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("answer", answer);
                startActivity(intent);
            } catch (NumberFormatException e) {
                e.printStackTrace();
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("error", e.getMessage());
                startActivity(intent);
            }
        }
    };
}