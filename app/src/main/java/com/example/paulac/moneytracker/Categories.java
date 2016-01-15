package com.example.paulac.moneytracker;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.widget.Button;

public class Categories extends FragmentActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
        btn = (Button)findViewById(R.id.button);
        ViewPager vp = (ViewPager)findViewById(R.id.viewpager);
        CategorySwipeAdapter swipeAdapter = new CategorySwipeAdapter(getSupportFragmentManager());
        vp.setAdapter(swipeAdapter);
    }

}
