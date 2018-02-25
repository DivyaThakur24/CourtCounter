package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int points_teamA;
    int points_teamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayScoreTeamA(int i) {
        TextView t = (TextView) findViewById(R.id.team_a_points);
        t.setText(i + "");
    }

    public void displayScoreTeamB(int j) {
        TextView t = (TextView) findViewById(R.id.team_b_points);
        t.setText(j + "");
    }

    public void displayText(String text) {
        TextView t = (TextView) findViewById(R.id.who_won);
        t.setText(text + "");
    }

    public void incrementBy3_teamA(View view) {
        points_teamA += 3;
        displayScoreTeamA(points_teamA);

        if(points_teamA > 11) {
            displayText("Team A has Won!");
        }
        else if(points_teamB > 11) {
            displayText("Team B has Won!");
        }
        else if(points_teamA == 11 && points_teamB < 11) {
            displayText("Team A has Won!");
        }
        else if(points_teamA < 11 && points_teamB == 11){
            displayText("Team B has Won!");
        }
        else if(points_teamA > points_teamB){
            displayText("Team A is Ahead!");
        }
        else if(points_teamA < points_teamB){
            displayText("Team B is Ahead!");
        }
        else if(points_teamA == 11 && points_teamB == 11){
            displayText("Match Draw!");
        }
        else if(points_teamA == points_teamB){
            displayText("Equal Scores!");
        }
        else
            displayText(" ");
    }

    public void incrementBy2_teamA(View view) {
        points_teamA += 2;
        displayScoreTeamA(points_teamA);

        if(points_teamA > 11) {
            displayText("Team A has Won!");
        }
        else if(points_teamB > 11) {
            displayText("Team B has Won!");
        }
        else if(points_teamA == 11 && points_teamB < 11) {
            displayText("Team A has Won!");
        }
        else if(points_teamA < 11 && points_teamB == 11){
            displayText("Team B has Won!");
        }
        else if(points_teamA > points_teamB){
            displayText("Team A is Ahead!");
        }
        else if(points_teamA < points_teamB){
            displayText("Team B is Ahead!");
        }
        else if(points_teamA == 11 && points_teamB == 11){
            displayText("Match Draw!");
        }
        else if(points_teamA == points_teamB){
            displayText("Equal Scores!");
        }
        else
            displayText(" ");
    }

    public void incrementBy1_teamA(View view) {
        points_teamA += 1;
        displayScoreTeamA(points_teamA);

        if(points_teamA > 11) {
            displayText("Team A has Won!");
        }
        else if(points_teamB > 11) {
            displayText("Team B has Won!");
        }
        else if(points_teamA == 11 && points_teamB < 11) {
            displayText("Team A has Won!");
        }
        else if(points_teamA < 11 && points_teamB == 11){
            displayText("Team B has Won!");
        }
        else if(points_teamA > points_teamB){
            displayText("Team A is Ahead!");
        }
        else if(points_teamA < points_teamB){
            displayText("Team B is Ahead!");
        }
        else if(points_teamA == 11 && points_teamB == 11){
            displayText("Match Draw!");
        }
        else if(points_teamA == points_teamB){
            displayText("Equal Scores!");
        }
        else
            displayText(" ");
    }

    public void incrementBy3_teamB(View view) {
        points_teamB += 3;
        displayScoreTeamB(points_teamB);

        if(points_teamA > 11) {
            displayText("Team A has Won!");
        }
        else if(points_teamB > 11) {
            displayText("Team B has Won!");
        }
        else if( points_teamA == 11 && points_teamB < 11 ) {
            displayText("Team A has Won!");
        }
        else if( points_teamA < 11 && points_teamB == 11 ){
            displayText("Team B has Won!");
        }
        else if(points_teamA > points_teamB){
            displayText("Team A is Ahead!");
        }
        else if(points_teamA < points_teamB){
            displayText("Team B is Ahead!");
        }
        else if(points_teamA == 11 && points_teamB == 11){
            displayText("Match Draw!");
        }
        else if(points_teamA == points_teamB){
            displayText("Equal Scores!");
        }
        else
            displayText(" ");
    }

    public void incrementBy2_teamB(View view) {
        points_teamB += 2;
        displayScoreTeamB(points_teamB);

        if(points_teamA > 11) {
            displayText("Team A has Won!");
        }
        else if(points_teamB > 11) {
            displayText("Team B has Won!");
        }
        else if( points_teamA == 11 && points_teamB < 11 ) {
            displayText("Team A has Won!");
        }
        else if(points_teamA < 11 && points_teamB == 11){
            displayText("Team B has Won!");
        }
        else if(points_teamA > points_teamB){
            displayText("Team A is Ahead!");
        }
        else if(points_teamA < points_teamB){
            displayText("Team B is Ahead!");
        }
        else if(points_teamA == 11 && points_teamB == 11){
            displayText("Match Draw!");
        }
        else if(points_teamA == points_teamB){
            displayText("Equal Scores!");
        }
        else
            displayText(" ");
    }

    public void incrementBy1_teamB(View view) {
        points_teamB += 1;
        displayScoreTeamB(points_teamB);

        if(points_teamA > 11) {
            displayText("Team A has Won!");
        }
        else if(points_teamB > 11) {
            displayText("Team B has Won!");
        }
        else if(points_teamA == 11 && points_teamB < 11){
            displayText("Team A has Won!");
        }
        else if(points_teamA < 11 && points_teamB == 11) {
            displayText("Team B has Won!");
        }
        else if(points_teamA > points_teamB){
            displayText("Team A is Ahead!");
        }
        else if(points_teamA < points_teamB){
            displayText("Team B is Ahead!");
        }
        else if(points_teamA == 11 && points_teamB == 11){
            displayText("Match Draw!");
        }
        else if(points_teamA == points_teamB){
            displayText("Equal Scores!");
        }
        else
            displayText(" ");
    }

    public void reset(View view) {
        points_teamB = 0;
        points_teamA = 0;
        displayScoreTeamA(points_teamA);
        displayScoreTeamB(points_teamB);
        displayText("Let's Begin!");
    }
}
