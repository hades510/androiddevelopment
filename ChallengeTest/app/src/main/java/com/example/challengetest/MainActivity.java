package com.example.challengetest;

import android.annotation.SuppressLint;
import android.os.Bundle;

import android.view.View;
import android.widget.EditText;

import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    //@SuppressLint("SetTextI18n")
    public void onButton1(View view){
        TextView nameFirst=findViewById(R.id.first);
        EditText Fname  =findViewById(R.id.firstName);
        nameFirst.setText("First Name: "+Fname.getText().toString());
        TextView nameLast=findViewById(R.id.last);
        EditText Lname= findViewById(R.id.lastName);
        nameLast.setText("Last Name: "+Lname.getText().toString());
        TextView eMail=findViewById(R.id.email);
        EditText Mail=findViewById(R.id.emailAdd);
        eMail.setText("Email: "+Mail.getText().toString());



    }
}