package com.oneilldavid.dartscoreboard;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by david on 14/12/2015.
 */
public class ScoreActivity extends ActionBarActivity {

    ImageView num1,num2,num3,num4,num5,num6,num7,num8,num9,num10,num11,
            num12,num13,num14,num15,num16,num17,num18,num19,num20,num25,num50,miss,
            num1x2,num2x2,num3x2,num4x2,num5x2,num6x2,num7x2,num8x2,num9x2,num10x2,num11x2,
            num12x2,num13x2,num14x2,num15x2,num16x2,num17x2,num18x2,num19x2,num20x2,
            num1x3,num2x3,num3x3,num4x3,num5x3,num6x3,num7x3,num8x3,num9x3,num10x3,num11x3,
            num12x3,num13x3,num14x3,num15x3,num16x3,num17x3,num18x3,num19x3,num20x3;

    TextView p1score,p2score,leg,p1dartAvg,p1throwAvg,p2dartAvg,p2throwAvg,check1,check2,check3;
    private int hold;
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

        num1 = (ImageView) findViewById(R.id.num1);
        num2 = (ImageView) findViewById(R.id.num2);
        num3 = (ImageView) findViewById(R.id.num3);
        num4 = (ImageView) findViewById(R.id.num4);
        num5 = (ImageView) findViewById(R.id.num5);
        num6 = (ImageView) findViewById(R.id.num6);
        num7 = (ImageView) findViewById(R.id.num7);
        num8 = (ImageView) findViewById(R.id.num8);
        num9 = (ImageView) findViewById(R.id.num9);
        num10 = (ImageView) findViewById(R.id.num10);
        num11 = (ImageView) findViewById(R.id.num11);
        num12 = (ImageView) findViewById(R.id.num12);
        num13 = (ImageView) findViewById(R.id.num13);
        num14 = (ImageView) findViewById(R.id.num14);
        num15 = (ImageView) findViewById(R.id.num15);
        num16 = (ImageView) findViewById(R.id.num16);
        num17 = (ImageView) findViewById(R.id.num17);
        num18 = (ImageView) findViewById(R.id.num18);
        num19 = (ImageView) findViewById(R.id.num19);
        num20 = (ImageView) findViewById(R.id.num20);
        num1x2 = (ImageView) findViewById(R.id.num1_x2);
        num2x2 = (ImageView) findViewById(R.id.num2_x2);
        num3x2 = (ImageView) findViewById(R.id.num3_x2);
        num4x2 = (ImageView) findViewById(R.id.num4_x2);
        num5x2 = (ImageView) findViewById(R.id.num5_x2);
        num6x2 = (ImageView) findViewById(R.id.num6_x2);
        num7x2 = (ImageView) findViewById(R.id.num7_x2);
        num8x2 = (ImageView) findViewById(R.id.num8_x2);
        num9x2 = (ImageView) findViewById(R.id.num9_x2);
        num10x2 = (ImageView) findViewById(R.id.num10_x2);
        num11x2 = (ImageView) findViewById(R.id.num11_x2);
        num12x2 = (ImageView) findViewById(R.id.num12_x2);
        num13x2 = (ImageView) findViewById(R.id.num13_x2);
        num14x2 = (ImageView) findViewById(R.id.num14_x2);
        num15x2 = (ImageView) findViewById(R.id.num15_x2);
        num16x2 = (ImageView) findViewById(R.id.num16_x2);
        num17x2 = (ImageView) findViewById(R.id.num17_x2);
        num18x2 = (ImageView) findViewById(R.id.num18_x2);
        num19x2 = (ImageView) findViewById(R.id.num19_x2);
        num20x2 = (ImageView) findViewById(R.id.num20_x2);
        num1x3 = (ImageView) findViewById(R.id.num1_x3);
        num2x3 = (ImageView) findViewById(R.id.num2_x3);
        num3x3 = (ImageView) findViewById(R.id.num3_x3);
        num4x3 = (ImageView) findViewById(R.id.num4_x3);
        num5x3 = (ImageView) findViewById(R.id.num5_x3);
        num6x3 = (ImageView) findViewById(R.id.num6_x3);
        num7x3 = (ImageView) findViewById(R.id.num7_x3);
        num8x3 = (ImageView) findViewById(R.id.num8_x3);
        num9x3 = (ImageView) findViewById(R.id.num9_x3);
        num10x3 = (ImageView) findViewById(R.id.num10_x3);
        num11x3 = (ImageView) findViewById(R.id.num11_x3);
        num12x3 = (ImageView) findViewById(R.id.num12_x3);
        num13x3 = (ImageView) findViewById(R.id.num13_x3);
        num14x3 = (ImageView) findViewById(R.id.num14_x3);
        num15x3 = (ImageView) findViewById(R.id.num15_x3);
        num16x3 = (ImageView) findViewById(R.id.num16_x3);
        num17x3 = (ImageView) findViewById(R.id.num17_x3);
        num18x3 = (ImageView) findViewById(R.id.num18_x3);
        num19x3 = (ImageView) findViewById(R.id.num19_x3);
        num20x3 = (ImageView) findViewById(R.id.num20_x3);
        num25 = (ImageView) findViewById(R.id.number25);
        num50 = (ImageView) findViewById(R.id.number50);
        miss = (ImageView) findViewById(R.id.miss);
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
                updateScores(1);
                break;
            case R.id.num2:
                updateScores(2);
                break;
            case R.id.num3:
                updateScores(3);
                break;
            case R.id.num4:
                updateScores(4);
                break;
            case R.id.num5:
                updateScores(5);
                break;
            case R.id.num6:
                updateScores(6);
                break;
            case R.id.num7:
                updateScores(7);
                break;
            case R.id.num8:
                updateScores(8);
                break;
            case R.id.num9:
                updateScores(9);
                break;
            case R.id.num10:
                updateScores(10);
                break;
            case R.id.num11:
                updateScores(11);
                break;
            case R.id.num12:
                updateScores(12);
                break;
            case R.id.num13:
                updateScores(13);
                break;
            case R.id.num14:
                updateScores(14);
                break;
            case R.id.num15:
                updateScores(15);
                break;
            case R.id.num16:
                updateScores(16);
                break;
            case R.id.num17:
                updateScores(17);
                break;
            case R.id.num18:
                updateScores(18);
                break;
            case R.id.num19:
                updateScores(19);
                break;
            case R.id.num20:
                updateScores(20);
                break;
            case R.id.num1_x2:
                updateScores(2);
                break;
            case R.id.num2_x2:
                updateScores(4);
                break;
            case R.id.num3_x2:
                updateScores(6);
                break;
            case R.id.num4_x2:
                updateScores(8);
                break;
            case R.id.num5_x2:
                updateScores(10);
                break;
            case R.id.num6_x2:
                updateScores(12);
                break;
            case R.id.num7_x2:
                updateScores(14);
                break;
            case R.id.num8_x2:
                updateScores(16);
                break;
            case R.id.num9_x2:
                updateScores(18);
                break;
            case R.id.num10_x2:
                updateScores(20);
                break;
            case R.id.num11_x2:
                updateScores(22);
                break;
            case R.id.num12_x2:
                updateScores(24);
                break;
            case R.id.num13_x2:
                updateScores(26);
                break;
            case R.id.num14_x2:
                updateScores(28);
                break;
            case R.id.num15_x2:
                updateScores(30);
                break;
            case R.id.num16_x2:
                updateScores(32);
                break;
            case R.id.num17_x2:
                updateScores(34);
                break;
            case R.id.num18_x2:
                updateScores(36);
                break;
            case R.id.num19_x2:
                updateScores(38);
                break;
            case R.id.num20_x2:
                updateScores(40);
                break;
            case R.id.num1_x3:
                updateScores(3);
                break;
            case R.id.num2_x3:
                updateScores(6);
                break;
            case R.id.num3_x3:
                updateScores(9);
                break;
            case R.id.num4_x3:
                updateScores(12);
                break;
            case R.id.num5_x3:
                updateScores(15);
                break;
            case R.id.num6_x3:
                updateScores(18);
                break;
            case R.id.num7_x3:
                updateScores(21);
                break;
            case R.id.num8_x3:
                updateScores(24);
                break;
            case R.id.num9_x3:
                updateScores(27);
                break;
            case R.id.num10_x3:
                updateScores(30);
                break;
            case R.id.num11_x3:
                updateScores(33);
                break;
            case R.id.num12_x3:
                updateScores(36);
                break;
            case R.id.num13_x3:
                updateScores(39);
                break;
            case R.id.num14_x3:
                updateScores(42);
                break;
            case R.id.num15_x3:
                updateScores(45);
                break;
            case R.id.num16_x3:
                updateScores(48);
                break;
            case R.id.num17_x3:
                updateScores(51);
                break;
            case R.id.num18_x3:
                updateScores(54);
                break;
            case R.id.num19_x3:
                updateScores(57);
                break;
            case R.id.num20_x3:
                updateScores(60);
                break;
            case R.id.number25:
                updateScores(25);
                break;
            case R.id.number50:
                updateScores(50);
                break;
            case R.id.miss:
                updateScores(0);
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
