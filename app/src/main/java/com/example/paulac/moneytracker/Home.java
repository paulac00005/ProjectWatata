package com.example.paulac.moneytracker;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.widget.ListView;

import java.util.ArrayList;

public class Home extends FragmentActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ViewPager vp = (ViewPager)findViewById(R.id.HomeViewPager);

        HomeSwipeAdapter HomeAdapter = new HomeSwipeAdapter(getSupportFragmentManager());
        vp.setAdapter(HomeAdapter);
    }

}
