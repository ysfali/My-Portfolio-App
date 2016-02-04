package com.example.android.myportfolioapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void displaySpotifyStreamer(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my spotify streamer app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    public void displayScoresApp(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my scores app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    public void displayLibraryApp(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my library app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    public void displayBuildItBigger(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my build it bigger app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    public void displayXyzReader(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my xyz reader app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    public void displayCapstone(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my capstone app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
