package com.example.testing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtN1;
    EditText edtN2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtN1 = findViewById(R.id.edtN1);
        edtN2 = findViewById(R.id.edtN2);
    }

    public void openSecond(View view){
        Intent intent = new Intent(this,Activity2.class);
        intent.putExtra("n1",edtN1.getText().toString());
        intent.putExtra("n2",edtN2.getText().toString());

        Toast.makeText(this,"Opening Calculator....",Toast.LENGTH_SHORT).show();

        startActivity(intent);
    }
}