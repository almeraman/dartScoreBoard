package com.oneilldavid.dartscoreboard;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by david on 14/12/2015.
 */
public class ScoreActivity extends ActionBarActivity {

    Button num1,num2,num3,num4,num5,num6,num7,num8,num9,num10,num11,
            num12,num13,num14,num15,num16,num17,num18,num19,num20,num25,num50,miss,
            submit,times2,times3;
    private int score = 0;
    TextView p1score,p2score,leg,p1dartAvg,p1throwAvg,p2dartAvg,p2throwAvg,check1,check2,check3;
    public static int num_throw = 3;
    public static int playerId = 1;
    ThreeOOneActivity to1;


    protected void onCreate(Bundle savedInstanceState) {
        // set activity layout
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        to1 = new ThreeOOneActivity();

        assignButtons();


    }

    private void assignButtons() {

        num1 = (Button) findViewById(R.id.num1);
        num2 = (Button) findViewById(R.id.num2);
        num3 = (Button) findViewById(R.id.num3);
        num4 = (Button) findViewById(R.id.num4);
        num5 = (Button) findViewById(R.id.num5);
        num6 = (Button) findViewById(R.id.num6);
        num7 = (Button) findViewById(R.id.num7);
        num8 = (Button) findViewById(R.id.num8);
        num9 = (Button) findViewById(R.id.num9);
        num10 = (Button) findViewById(R.id.num10);
        num11 = (Button) findViewById(R.id.num11);
        num12 = (Button) findViewById(R.id.num12);
        num13 = (Button) findViewById(R.id.num13);
        num14 = (Button) findViewById(R.id.num14);
        num15 = (Button) findViewById(R.id.num15);
        num16 = (Button) findViewById(R.id.num16);
        num17 = (Button) findViewById(R.id.num17);
        num18 = (Button) findViewById(R.id.num18);
        num19 = (Button) findViewById(R.id.num19);
        num20 = (Button) findViewById(R.id.num20);
        num25 = (Button) findViewById(R.id.num25);
        num50 = (Button) findViewById(R.id.num50);
        miss = (Button) findViewById(R.id.miss);
        times2 = (Button)findViewById(R.id.times2);
        times3 = (Button) findViewById(R.id.times3);
        submit = (Button) findViewById(R.id.submit);
        p1score = (TextView) findViewById(R.id.p1score_change);
        p2score = (TextView) findViewById(R.id.p2score_change);
        leg = (TextView) findViewById(R.id.leg_change);
        p1dartAvg = (TextView) findViewById(R.id.p1dart_avg_change);
        p2dartAvg = (TextView) findViewById(R.id.p2dart_avg_change);
        p1throwAvg = (TextView) findViewById(R.id.p1throw_avg_change);
        p2throwAvg = (TextView) findViewById(R.id.p2throw_avg_change);
        check1 = (TextView) findViewById(R.id.check1);
        check2 = (TextView) findViewById(R.id.check2);
        check3 = (TextView) findViewById(R.id.check3);
        updateP1Score(to1.getFirstVals());
        updateP2Score(to1.getFirstVals());
    }


    public void clicked(View view) {
        switch (view.getId()) {
            case R.id.num1:
                score = 1;
                break;
            case R.id.num2:
                score = 2;
                break;
            case R.id.num3:
                score = 3;
                break;
            case R.id.num4:
                score = 4;
                break;
            case R.id.num5:
                score = 5;
                break;
            case R.id.num6:
                score = 6;
                break;
            case R.id.num7:
                score = 7;
                break;
            case R.id.num8:
                score = 8;
                break;
            case R.id.num9:
                score = 9;
                break;
            case R.id.num10:
                score = 10;
                break;
            case R.id.num11:
                score = 11;
                break;
            case R.id.num12:
                score = 12;
                break;
            case R.id.num13:
                score = 13;
                break;
            case R.id.num14:
                score = 14;
                break;
            case R.id.num15:
                score = 15;
                break;
            case R.id.num16:
                score = 16;
                break;
            case R.id.num17:
                score = 17;
                break;
            case R.id.num18:
                score = 18;
                break;
            case R.id.num19:
                score = 19;
                break;
            case R.id.num20:
                score = 20;
                break;
            case R.id.num25:
                updateScores(25);
                break;
            case R.id.num50:
                updateScores(50);
                break;
            case R.id.miss:
                updateScores(0);
                break;
            case R.id.times2:
                score = score * 2;
                break;
            case R.id.times3:
                score = score * 3;
                break;
            case R.id.submit:
                updateScores(score);
                score = 0;
                break;
        }

    }

    private void updateScores(double j) {
        if(playerId == 1) {
            updateP1Score(to1.getReduceScore(playerId, j, num_throw));
        } else {
            updateP2Score(to1.getReduceScore(playerId, j, num_throw));
        }
    }

    private void updateP1Score(double i) {
        p1score.setText(""+(int)i);
        p1dartAvg.setText(""+String.format("%.2f", to1.getP1DartAvg()));
        p1throwAvg.setText(""+String.format("%.2f", to1.getP1ThrowAvg()));
    }

    private void updateP2Score(double i) {
        p2score.setText(""+(int)i);
        p2dartAvg.setText(""+String.format("%.2f", to1.getP2DartAvg()));
        p2throwAvg.setText(""+String.format("%.2f",to1.getP2ThrowAvg()));
    }

}
