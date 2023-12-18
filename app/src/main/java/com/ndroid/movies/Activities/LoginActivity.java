package com.ndroid.movies.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;
import com.ndroid.movies.R;

public class LoginActivity extends AppCompatActivity {

    private TextInputLayout userEdit,passEdit;
    private AppCompatButton loginBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
    }
    private void initView(){
        userEdit=findViewById(R.id.userName);
        passEdit=findViewById(R.id.userPass);
        loginBtn=findViewById(R.id.login_button);
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(userEdit.getEditText().getText().toString().isEmpty()||passEdit.getEditText().getText().toString().isEmpty()){
                    Toast.makeText(LoginActivity.this,"please fill the cases!!",Toast.LENGTH_SHORT).show();

                } else if (userEdit.getEditText().getText().toString().equals("Mouna-lak")||passEdit.getEditText().getText().toString().equals("Mouna2002")) {
                    Toast.makeText(LoginActivity.this,"Welcome! Have fun!",Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(LoginActivity.this, FilmActivity.class);
                    startActivity(intent);
                }else {
                    Toast.makeText(LoginActivity.this,"Username or password incorrect!!",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}