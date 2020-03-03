package com.example.ballbadmintonscorer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextSwitcher;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView pointA,pointB,foulA,foulB,result;
    Button addPA,addPB,addFA,addFB;
    int teamAPoint,teamBPoint,teamAFoul,teamBFoul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pointA=(TextView)findViewById(R.id.PointsAvalue);
        pointB=(TextView)findViewById(R.id.PointsBvalue);
        foulA=(TextView)findViewById(R.id.foulsAvalue);
        foulB=(TextView)findViewById(R.id.foulsBvalue);
        result=(TextView)findViewById(R.id.resultofmatch);
        addPA=(Button)findViewById(R.id.addpointA);

        pointA.setText(""+teamAPoint);
        pointB.setText(""+teamBPoint);
        foulA.setText(""+teamAFoul);
        foulB.setText(""+teamBFoul);

    }

    public void addPointA(View view) {
        teamAPoint=teamAPoint+1;
        pointA.setText(""+teamAPoint);
        checkResult();
    }

    public void addPointB(View view) {
        teamBPoint=teamBPoint+1;
        pointB.setText(""+teamBPoint);
        checkResult();
    }

    public void addFoulA(View view) {
        teamAFoul=teamAFoul+1;
        foulA.setText(""+teamAFoul);
    }

    public void addxFoulB(View view) {
        teamBFoul=teamBFoul+1;
        foulB.setText(""+teamBFoul);
    }

    public void resetpoints(View view) {
        teamAPoint=0;
        teamBPoint=0;
        teamAFoul=0;
        teamBFoul=0;
        pointA.setText(""+teamAPoint);
        pointB.setText(""+teamBPoint);
        foulA.setText(""+teamAFoul);
        foulB.setText(""+teamBFoul);

    }
    public void checkResult()
    {
        if(teamAPoint==10)
        {
            result.setText("TEAM A WON THE MATCH!");


        }
        else if(teamBPoint==10)
        {
            result.setText("TEAM B WON THE MATCH!");
        }
    }
}
