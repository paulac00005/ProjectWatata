package com.example.paulac.moneytracker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class Home extends FragmentActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ViewPager vp = (ViewPager)findViewById(R.id.HomeViewPager);
        HomeSwipeAdapter swipeAdapter = new HomeSwipeAdapter(getSupportFragmentManager());
        vp.setAdapter(swipeAdapter);
    }

}