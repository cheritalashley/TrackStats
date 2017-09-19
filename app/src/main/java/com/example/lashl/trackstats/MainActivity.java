package com.example.lashl.trackstats;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE="com.example.trackstats.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void aboutUs(View view){
        Intent intent=new Intent(this, DisplayAboutUsActivity.class);
        String message = "Here you will keep a log of your athletic statistical data. " +
                "Here you will find it easy to have your athletics best times and best events " +
                "at your finger tips. No more searching for what your athletic did last week. " +
                "With a simple click, you will have that information instantly at your fingertips. " +
                "Have your stats here so at the end of the session, you will have all of your " +
                "athletic data in one place.";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
