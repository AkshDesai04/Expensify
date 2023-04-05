package com.example.expensify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        boolean isLoggedIn = true; //checks if a user is logged in

//        if(!isLoggedIn)
//            setContentView(R.layout.activity_main);
//        else
//            setContentView(R.layout.activity_login);
        setContentView(R.layout.activity_home_page2);

    }
}