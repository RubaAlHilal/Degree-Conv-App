package com.example.degree_conv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class SecondPageActivity extends AppCompatActivity {

    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_page_main);

        result = findViewById(R.id.textView2);

        Intent i = getIntent();
        float val = i.getFloatExtra("result", 0.0F);

        result.setText(""+ val);



    }
}