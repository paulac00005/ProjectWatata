package com.example.paulac.moneytracker;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class Home extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ViewPager vp = (ViewPager)findViewById(R.id.HomeViewPager);
        HomeSwipeAdapter swipeAdapter = new HomeSwipeAdapter(getSupportFragmentManager());
        vp.setAdapter(swipeAdapter);
    }

}