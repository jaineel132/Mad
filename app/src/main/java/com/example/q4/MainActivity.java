package com.example.q4;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView atv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        atv=findViewById(R.id.actv);

        String[] subjects={"MAD","MAN","NIS","PWP","ETI","CPP","EDE"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line,subjects);

        atv.setAdapter(adapter);

        }
    }
