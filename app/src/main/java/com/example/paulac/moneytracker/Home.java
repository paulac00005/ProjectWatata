package com.example.paulac.moneytracker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class Home extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ViewPager vp = (ViewPager)findViewById(R.id.HomeViewPager);
        Button add = (Button)findViewById(R.id.Add);
        HomeSwipeAdapter swipeAdapter = new HomeSwipeAdapter(getSupportFragmentManager());
        vp.setAdapter(swipeAdapter);
    }

    public void onKlik(View v){
        Intent i = new Intent(this, Add_Transaction.class);
        startActivity(i);
    }

}