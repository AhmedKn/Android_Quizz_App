package com.example.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class ResultActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Button logout=(Button) findViewById(R.id.logout);
        TextView username_text=(TextView) findViewById(R.id.username);
        TextView res=(TextView) findViewById(R.id.result);
        Button home=(Button) findViewById(R.id.idk);
        logout.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Score.reintialize();
                Intent i=new Intent(ResultActivity.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });
        home.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Score.reintialize();
                Intent i=new Intent(ResultActivity.this,Home.class);
                startActivity(i);
                finish();
            }
        });
        int sc=Score.score[0]+Score.score[1]+Score.score[2]+Score.score[3]+Score.score[4];
        res.setText(Integer.toString(sc)+"/5");
        username_text.setText(Score.username);
    }
}
