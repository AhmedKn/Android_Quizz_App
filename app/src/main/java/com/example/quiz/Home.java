package com.example.quiz;



import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class Home extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Button logout=(Button) findViewById(R.id.logout);
        Button start=(Button) findViewById(R.id.start);
        TextView username_text=(TextView) findViewById(R.id.username);
        username_text.setText(Score.username);
        logout.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Score.reintialize();
                Intent i=new Intent(Home.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });
        start.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent i=new Intent(Home.this,QuizOne.class);
               startActivity(i);
                finish();
            }
        });


    }
}


