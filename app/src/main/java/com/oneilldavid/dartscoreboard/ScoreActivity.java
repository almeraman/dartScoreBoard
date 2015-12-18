package com.oneilldavid.dartscoreboard;

import android.graphics.Color;
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
    static TextView playa1,playa2;
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
		times2.setEnabled(false);
		times3.setEnabled(false);
        submit = (Button) findViewById(R.id.submit);
        playa1 = (TextView) findViewById(R.id.player1);
        playa2 = (TextView) findViewById(R.id.player2);
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
        changeToPlaya1();
    }


    public void clicked(View view) {
        switch (view.getId()) {
            case R.id.num1:
				resetButtons(1);
                num1.setBackgroundColor(Color.BLUE);
                break;
            case R.id.num2:
                resetButtons(2);
                num2.setBackgroundColor(Color.BLUE);
                break;
            case R.id.num3:
                resetButtons(3);
                num3.setBackgroundColor(Color.BLUE);
                break;
            case R.id.num4:
                resetButtons(4);
                num4.setBackgroundColor(Color.BLUE);
                break;
            case R.id.num5:
                resetButtons(5);
                num5.setBackgroundColor(Color.BLUE);
                break;
            case R.id.num6:
                resetButtons(6);
                num6.setBackgroundColor(Color.BLUE);
                break;
            case R.id.num7:
                resetButtons(7);
                num7.setBackgroundColor(Color.BLUE);
                break;
            case R.id.num8:
                resetButtons(8);
                num8.setBackgroundColor(Color.BLUE);
                break;
            case R.id.num9:
                resetButtons(9);
                num9.setBackgroundColor(Color.BLUE);
                break;
            case R.id.num10:
                resetButtons(10);
                num10.setBackgroundColor(Color.BLUE);
                break;
            case R.id.num11:
                resetButtons(11);
                num11.setBackgroundColor(Color.BLUE);
                break;
            case R.id.num12:
                resetButtons(12);
                num12.setBackgroundColor(Color.BLUE);
                break;
            case R.id.num13:
                resetButtons(13);
                num13.setBackgroundColor(Color.BLUE);
                break;
            case R.id.num14:
                resetButtons(14);
                num14.setBackgroundColor(Color.BLUE);
                break;
            case R.id.num15:
                resetButtons(15);
                num15.setBackgroundColor(Color.BLUE);
                break;
            case R.id.num16:
                resetButtons(16);
                num16.setBackgroundColor(Color.BLUE);
                break;
            case R.id.num17:
                resetButtons(17);
                num17.setBackgroundColor(Color.BLUE);
                break;
            case R.id.num18:
                resetButtons(18);
                num18.setBackgroundColor(Color.BLUE);
                break;
            case R.id.num19:
                resetButtons(19);
                num19.setBackgroundColor(Color.BLUE);
                break;
            case R.id.num20:
                resetButtons(20);
                num20.setBackgroundColor(Color.BLUE);
                break;
            case R.id.num25:
                updateScores(25);
				resetButtons(0);
				times2.setEnabled(false);
				times3.setEnabled(false);
                break;
            case R.id.num50:
                updateScores(50);
				resetButtons(0);
				times2.setEnabled(false);
				times3.setEnabled(false);
                break;
            case R.id.miss:
                updateScores(0);
				resetButtons(0);
				times2.setEnabled(false);
				times3.setEnabled(false);
                break;
            case R.id.times2:
                score = score * 2;
                times2.setBackgroundColor(Color.BLUE);
				times3.setEnabled(false);
                break;
            case R.id.times3:
                score = score * 3;
                times3.setBackgroundColor(Color.BLUE);
				times2.setEnabled(false);
                break;
            case R.id.submit:
                updateScores(score);
                resetButtons(0);
				times2.setEnabled(false);
				times3.setEnabled(false);
                break;
        }

    }

	private void resetButtons(int p0)
	{
		num1.setBackgroundColor(Color.BLACK);
        num2.setBackgroundColor(Color.BLACK);
        num3.setBackgroundColor(Color.BLACK);
        num4.setBackgroundColor(Color.BLACK);
        num5.setBackgroundColor(Color.BLACK);
        num6.setBackgroundColor(Color.BLACK);
        num7.setBackgroundColor(Color.BLACK);
        num8.setBackgroundColor(Color.BLACK);
        num9.setBackgroundColor(Color.BLACK);
        num10.setBackgroundColor(Color.BLACK);
        num11.setBackgroundColor(Color.BLACK);
        num12.setBackgroundColor(Color.BLACK);
        num13.setBackgroundColor(Color.BLACK);
        num14.setBackgroundColor(Color.BLACK);
        num15.setBackgroundColor(Color.BLACK);
        num16.setBackgroundColor(Color.BLACK);
        num17.setBackgroundColor(Color.BLACK);
        num18.setBackgroundColor(Color.BLACK);
        num19.setBackgroundColor(Color.BLACK);
        num20.setBackgroundColor(Color.BLACK);
		times2.setBackgroundColor(Color.GREEN);
		times3.setBackgroundColor(Color.RED);
		times2.setEnabled(true);
		times3.setEnabled(true);
		score = p0;
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

    public static void changeToPlaya1() {
        playa1.setBackgroundColor(Color.WHITE);
        playa1.setTextColor(Color.BLACK);
        playa2.setBackgroundColor(Color.BLACK);
        playa2.setTextColor(Color.WHITE);
    }

    public static void changeToPlaya2() {
        playa2.setBackgroundColor(Color.WHITE);
        playa2.setTextColor(Color.BLACK);
        playa1.setBackgroundColor(Color.BLACK);
        playa1.setTextColor(Color.WHITE);
    }



}  //end class
