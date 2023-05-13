package com.example.degree_conv;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText degree;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        degree = (EditText) findViewById(R.id.Input_);
        Button convertButton = (Button) findViewById(R.id.button);

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Float conv;
                conv = (Float.parseFloat(degree.getText().toString()) * 9/5) + 32;

                Intent Go = new Intent(MainActivity.this, SecondPageActivity.class);
                Go.putExtra("result", conv);
                startActivity(Go);


            }
        });
    }
}