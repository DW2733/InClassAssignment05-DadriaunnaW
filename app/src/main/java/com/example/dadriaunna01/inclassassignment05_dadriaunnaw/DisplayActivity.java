package com.example.dadriaunna01.inclassassignment05_dadriaunnaw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {


    private TextView displayText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        displayText = (TextView) findViewById(R.id.display_text);
        Intent intent = getIntent();
        FemaleRappers newHeat = (FemaleRappers) intent.getSerializableExtra(Keys.FEMALE_RAPPER);
        displayText.setText(newHeat.toString());

        startActivity(intent);

    }
}
