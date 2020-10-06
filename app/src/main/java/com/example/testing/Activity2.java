package com.example.testing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    EditText edtN1;
    EditText edtN2;
    String num1;
    String num2;
    int n1;
    int n2;
    TextView lblAns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        edtN1 = findViewById(R.id.edtN1);
        edtN2 = findViewById(R.id.edtN2);
        lblAns = findViewById(R.id.lblAns);

        Intent intent = getIntent();

        num1 = intent.getStringExtra("n1");
        num2 = intent.getStringExtra("n2");

        edtN1.setText(num1);
        edtN2.setText(num2);

        n1 = Integer.parseInt(num1);
        n2 = Integer.parseInt(num2);
    }

    public void Add(View view){
        lblAns.setText(num1+"+"+num2+"="+(n1+n2));

    }

    public void Min(View view){
        lblAns.setText(num1+"-"+num2+"="+(n1-n2));

    }

    public void Mul(View view){
        lblAns.setText(num1+"x"+num2+"="+(n1*n2));

    }

    public void Div(View view){
        lblAns.setText(num1+"/"+num2+"="+(n1/n2));

    }

}