package com.example.quiz;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MaterialButton btn_login=(MaterialButton) findViewById(R.id.loginbtn);
        TextView username=(TextView) findViewById(R.id.username);
        TextView password=(TextView) findViewById(R.id.password);
        btn_login.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {
                    Toast.makeText(MainActivity.this, "Logged In", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(MainActivity.this, Home.class);
                    i.putExtra("username",username.getText().toString());
                    startActivity(i);
                    Score.setUsername(username.getText().toString());
                    finish();
                } else {
                    Toast.makeText(MainActivity.this, "Login Failed !", Toast.LENGTH_SHORT).show();
                }
            }
        });
        }



}


