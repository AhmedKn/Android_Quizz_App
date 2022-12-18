package com.example.quiz;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Button;
public class QuizTwo extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_two);
        Button next=(Button) findViewById(R.id.next);
        Button prev=(Button) findViewById(R.id.previous);
        CheckBox b1=(CheckBox) findViewById(R.id.radioButton1);
        CheckBox b2=(CheckBox) findViewById(R.id.radioButton2);
        CheckBox b3=(CheckBox) findViewById(R.id.radioButton3);
        CheckBox b4=(CheckBox) findViewById(R.id.radioButton4);
        next.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent i=new Intent(QuizTwo.this,QuizThree.class);
                startActivity(i);
                finish();
            }
        });
        prev.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent i=new Intent(QuizTwo.this,QuizOne.class);
                startActivity(i);
                finish();
            }
        });
        b1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    Score.setCheck2(0,1);
                }
                else{
                    Score.setCheck2(0,0);
                }
                if(!b1.isChecked() && !b2.isChecked() && b3.isChecked() && !b4.isChecked()){
                    Score.setScore(1,1);
                }
                else{
                    Score.setScore(1,0);
                }
            }
        });
        b2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    Score.setCheck2(1,1);
                }
                else{
                    Score.setCheck2(1,0);
                }
                if(!b1.isChecked() && !b2.isChecked() && b3.isChecked() && !b4.isChecked()){
                    Score.setScore(1,1);
                }
                else{
                    Score.setScore(1,0);
                }
            }
        });
        b3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    Score.setCheck2(2,1);
                }
                else{
                    Score.setCheck2(2,0);
                }
                if(!b1.isChecked() && !b2.isChecked() && b3.isChecked() && !b4.isChecked()){
                    Score.setScore(1,1);
                }
                else{
                    Score.setScore(1,0);
                }
            }
        });
        b4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    Score.setCheck2(3,1);
                }
                else{
                    Score.setCheck2(3,0);
                }
                if(!b1.isChecked() && !b2.isChecked() && b3.isChecked() && !b4.isChecked()){
                    Score.setScore(1,1);
                }
                else{
                    Score.setScore(1,0);
                }
            }
        });
        if(Score.check2[0]==1){
            b1.setChecked(true);
            Score.setScore(0,1);
        }else{
            b1.setChecked(false);
        }
        if(Score.check2[1]==1){
            b2.setChecked(true);
        }else{
            b2.setChecked(false);
        }
        if(Score.check2[2]==1){
            b3.setChecked(true);
        }else{
            b3.setChecked(false);
        }
        if(Score.check2[3]==1){
            b4.setChecked(true);
        }else{
            b4.setChecked(false);
        }
        if(!b1.isChecked() && !b2.isChecked() && b3.isChecked() && !b4.isChecked()){
            Score.setScore(1,1);
        }
        else{
            Score.setScore(1,0);
        }
    }
}
