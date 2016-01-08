package com.oneilldavid.dartscoreboard;

import android.app.*;
import android.content.*;
import android.os.*;
import android.util.Log;
import android.view.*;
import android.widget.*;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    ImageView play;
    Spinner numSets, gameType;
    int sets,game;
    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addItemsOnSpinner();


        play = (ImageView) findViewById(R.id.play);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sets = (int)numSets.getSelectedItem();
                game = (int)gameType.getSelectedItem();
                Intent intent = new Intent(MainActivity.this,ScoreActivity.class);
                intent.putExtra("numOfSets",sets);
                intent.putExtra("typeOfGame",game);
                startActivity(intent);
            }
        });
    }

    private void addItemsOnSpinner() {
        numSets = (Spinner) findViewById(R.id.spinner_sets);
        gameType = (Spinner) findViewById(R.id.spinner_game);
        List<Integer> gameList = new ArrayList<Integer>();
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);
        list.add(11);
        list.add(13);
        list.add(15);
        gameList.add(301);
        gameList.add(501);
        ArrayAdapter<Integer> dataAdapt = new ArrayAdapter<Integer>(this,android.R.layout.simple_spinner_dropdown_item,list);
        ArrayAdapter<Integer> dataAdaptGame = new ArrayAdapter<Integer>(this,android.R.layout.simple_spinner_dropdown_item,gameList);
        dataAdapt.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dataAdaptGame.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        numSets.setAdapter(dataAdapt);
        gameType.setAdapter(dataAdaptGame);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


}
