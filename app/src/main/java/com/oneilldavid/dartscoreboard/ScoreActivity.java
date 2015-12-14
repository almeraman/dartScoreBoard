package com.oneilldavid.dartscoreboard;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ImageView;

/**
 * Created by david on 14/12/2015.
 */
public class ScoreActivity extends ActionBarActivity {

    ImageView num1,num2,num3,num4,num5,num6,num7,num8,num9,num10,num11,
            num12,num13,num14,num15,num16,num17,num18,num19,num20,num25,num50,miss;
    private int p1score,p2score;

    protected void onCreate(Bundle savedInstanceState) {
        // set activity layout
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

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
        num25 = (ImageView) findViewById(R.id.number25);
        num50 = (ImageView) findViewById(R.id.number50);
        miss = (ImageView) findViewById(R.id.miss);
    }

}
