package com.ndroid.movies.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;

import com.ndroid.movies.R;

public class MainActivity extends AppCompatActivity {

    AppCompatButton getStarted;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getStarted=findViewById(R.id.button);
        getStarted.setOnClickListener(view ->{
            Intent intent=new Intent(this, LoginActivity.class);
            startActivity(intent);
        });
    }
}