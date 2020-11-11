package com.example.basketballcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int ScoreT1 = 0;
    int ScoreT2 = 0;

    public void add1T1(View view){
        ScoreT1=ScoreT1+1;
        displayScoreT1();
    }

    public void add2T1(View view){
        ScoreT1=ScoreT1+2;
        displayScoreT1();
    }

    public void add3T1(View view){
        ScoreT1=ScoreT1+3;
        displayScoreT1();
    }

    public void add1T2(View view){
        ScoreT2=ScoreT2+1;
        displayScoreT2();
    }

    public void add2T2(View view){
        ScoreT2=ScoreT2+2;
        displayScoreT2();
    }

    public void add3T2(View view){
        ScoreT2=ScoreT2+3;
        displayScoreT2();
    }

    private void displayScoreT1(){
        TextView score1 = (TextView) findViewById(R.id.scoreT1);
        score1.setText(""+ScoreT1);
    }

    private void displayScoreT2(){
        TextView score1 = (TextView) findViewById(R.id.scoreT2);
        score1.setText(""+ScoreT2);
    }

    public void resetScore(View view){
        ScoreT1=0;
        ScoreT2=0;
        displayScoreT1();
        displayScoreT2();
    }
}