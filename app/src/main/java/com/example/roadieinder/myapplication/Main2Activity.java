package com.example.roadieinder.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final EditText e = (EditText)findViewById(R.id.editText);
        final EditText e1 = (EditText) findViewById(R.id.editText2);
        Intent i1= getIntent();
        e.setText(i1.getStringExtra("Username"));
        e1.setText(i1.getStringExtra("password"));

            }
        }

