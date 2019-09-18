package com.example.billy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button Feed,
            Play,
            Work,
            Sleep;
    TextView LiveStatus;
    TextView Response;

    public void StatusUpdate(Dachi thisDachi)
    {
        LiveStatus.setText(getString(R.string.LiveStatus,
                thisDachi.Fullness,
                thisDachi.Happiness,
                thisDachi.Meals,
                thisDachi.Energy));
    }

    public void DachiResponse(String thisResponse)
    {
        Response.setText(getString(R.string.Response, thisResponse));
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Dachi Billy = new Dachi();
        //TEXT
        LiveStatus = findViewById(R.id.textView);
        //TEXT
        //BUTTONS
        Feed = findViewById(R.id.Feed);
        Play = findViewById(R.id.Play);
        Work = findViewById(R.id.Work);
        Sleep = findViewById(R.id.Sleep);
        //BUTTONS
        StatusUpdate(Billy);
        //BUTTON ACTION
        Feed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String interactionResult = Billy.Feed();
                StatusUpdate(Billy);
//                DachiResponse(interactionResult);
            }

        });

        Play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String interactionResult = Billy.Play();
                StatusUpdate(Billy);
                DachiResponse(interactionResult);
            }
        });

        Work.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String interactionResult = Billy.Work();
                StatusUpdate(Billy);
//                DachiResponse(interactionResult);
            }
        });

        Sleep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String interactionResult = Billy.Sleep();
                StatusUpdate(Billy);
//                DachiResponse(interactionResult);
            }

        });

        //BUTTON ACTION
    }
}
