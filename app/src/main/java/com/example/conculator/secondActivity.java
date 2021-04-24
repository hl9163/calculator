package com.example.conculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {
    TextView tv1;
    String end;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent gi = getIntent();
        tv1 = (TextView) findViewById(R.id.textViewR);
        end = gi.getStringExtra("result");


        tv1.setText(end);

    }



    public void r(View view) {
        Intent si2 = new Intent (this,MainActivity.class);
        si2.putExtra("rt",end);
        startActivity(si2);
    }
}