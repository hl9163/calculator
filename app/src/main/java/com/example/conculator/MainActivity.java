package com.example.conculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    Button pl;
    Button de;
    Button mu;
    Button di;
    Button res;
    boolean action = false;
    boolean pluse = false;
    boolean minous = false;
    boolean mul = false;
    boolean divided = false;
    EditText num1;
    EditText num2;
    double result;
    String results;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent gi2 = getIntent();
        results = gi2.getStringExtra("rt");

        tv = (TextView) findViewById(R.id.textViewR);

        pl = (Button) findViewById(R.id.plus);
        de = (Button) findViewById(R.id.dec);
        mu = (Button) findViewById(R.id.multiply);
        di = (Button) findViewById(R.id.divide);
        res = (Button) findViewById(R.id.res);

        num1 = (EditText) findViewById(R.id.number1);
        num2 = (EditText) findViewById(R.id.number2);
    }

    public void pluse(View view) {
        if (action == false){
            tv.setText("+");
            pluse = true;
            action = true;
        }
    }

    public void dec(View view) {
        if (action == false){
            tv.setText("-");
            minous = true;
            action = true;
        }
    }

    public void mul(View view) {
        if (action == false){
            tv.setText("*");
            mul = true;
            action = true;
        }
    }
    public void divd(View view) {
        if (action == false){
            tv.setText("/");
            divided = true;
            action = true;
        }
    }

    public void result(View view) {
        if (action == true){
            String st = num1.getText().toString();
            double number1 = Double.parseDouble(st);
            String st2 = num2.getText().toString();
            double number2 = Double.parseDouble(st2);
            if (pluse){
                result = number1+number2;
            }
            if (minous){
                result = number1-number2;
            }
            if (mul){
                result = number1*number2;
            }
            if (divided){
                result = number1/number2;
            }
            action = false;
             results = String.valueOf(result);

        }
    }

    public void cr(View view) {
        Intent si = new Intent (this,secondActivity.class);
        si.putExtra("result",results);
        startActivity(si);
    }


    public void go(View view) {
        tv.setText(" ");
        num1.setText(" ");
        num2.setText(" ");
        action = false;
    }
}