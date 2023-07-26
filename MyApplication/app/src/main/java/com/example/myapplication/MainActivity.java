package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
     public void onButton(View view){
         TextView text =findViewById(R.id.textView);
         EditText text1=findViewById(R.id.editTextname);
         text.setText("Hello "+text1.getText().toString());
         //text1.getText().toString();
    }
}