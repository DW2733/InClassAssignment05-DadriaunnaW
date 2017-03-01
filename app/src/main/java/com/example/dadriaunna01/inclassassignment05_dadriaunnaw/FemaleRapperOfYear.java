package com.example.dadriaunna01.inclassassignment05_dadriaunnaw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

import static com.example.dadriaunna01.inclassassignment05_dadriaunnaw.R.id.female_rapper_name;
import static com.example.dadriaunna01.inclassassignment05_dadriaunnaw.R.id.pop_song;
import static com.example.dadriaunna01.inclassassignment05_dadriaunnaw.R.id.rapper_hits;


public class FemaleRapperOfYear extends AppCompatActivity {

    private EditText femaleRapperName;
    private CheckBox barsOrNah;
    private EditText awards;
    private EditText popSong;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person_info);


        barsOrNah = (CheckBox) findViewById(R.id.bars_or_nah);
        femaleRapperName = (EditText) findViewById(female_rapper_name);
        awards = (EditText) findViewById(rapper_hits);
        popSong = (EditText) findViewById(pop_song);

    }

    public void submitStuff(View view) {

        Intent intent = new Intent(this, DisplayActivity.class);

        String name = femaleRapperName.getText().toString();
        String award = awards.getText().toString();
        String songs = popSong.getText().toString();
        boolean good = barsOrNah.isChecked();
        int award1 = Integer.parseInt(award);


        FemaleRappers remyMa = new FemaleRappers(name, songs, good, award1);
        intent.putExtra(Keys.FEMALE_RAPPER, remyMa);

        startActivity(intent);

    }


//    {
//
//        String name=femaleRapperName.getText().toString();
//        String award=awards.getText().toString();
//        String songs=popSong.getText().toString();
//        boolean good= barsOrNah.isChecked();
//        int award1=Integer.parseInt(award);
//
//        Intent intent = new Intent(this, DisplayActivity.class);
//
//        FemaleRappers remyMa= new FemaleRappers(name, songs, good , award1);
//        intent.putExtra(Keys.FEMALE_RAPPER, remyMa);
//
//        startActivity(intent);
//
//
//    }


}
