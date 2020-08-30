package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //push ==send changed project to github
        //pull ==get changed project from github(when a other user changed project)
    }

    private void test(){
//this is test !!!
    }
}
