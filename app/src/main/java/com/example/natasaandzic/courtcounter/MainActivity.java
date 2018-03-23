package com.example.natasaandzic.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA=0;
    int scoreB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayScoreForA(int number) {
        TextView scoreA = findViewById(R.id.scoreA);
        scoreA.setText("" +number);
    }

    public void displayScoreForB(int number) {
        TextView scoreB = findViewById(R.id.scoreB);
        scoreB.setText("" +number);
    }

    public void plusThreeA(View view) {
        scoreA+=3;
        displayScoreForA(scoreA);
    }

    public void plusTwoA(View view) {
        scoreA+=2;
        displayScoreForA(scoreA);
    }

    public void plusOneA(View view) {
        scoreA+=1;
        displayScoreForA(scoreA);
    }

    public void plusThreeB(View view) {
        scoreB+=3;
        displayScoreForB(scoreB);
    }

    public void plusTwoB(View view) {
        scoreB+=2;
        displayScoreForB(scoreB);
    }

    public void plusOneB(View view) {
        scoreB+=1;
        displayScoreForB(scoreB);
    }

    public void reset(View view) {
        scoreA=0;
        scoreB=0;
        displayScoreForA(scoreA);
        displayScoreForB(scoreB);
    }
}
