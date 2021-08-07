package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FormPage extends AppCompatActivity implements View.OnClickListener {
    EditText p1,p2;
    Button go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_form_page);

        p1 = findViewById(R.id.p1Name);
        p2 = findViewById(R.id.p2Name);
        go = findViewById(R.id.cont);
        go.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(p1.getText().toString().equals("") || p2.getText().toString().equals("")) {
            Toast.makeText(this, "Please Enter Players Name", Toast.LENGTH_SHORT).show();
        }
        else{
            Intent intent = new Intent(this,MainActivity.class);
            intent.putExtra("p1 Name",p1.getText().toString());
            intent.putExtra("p2 Name",p2.getText().toString());
            startActivity(intent);
        }
    }
}