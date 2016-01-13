package com.example.paulac.moneytracker;

import android.app.ActionBar;
import android.app.ActionBar.TabListener;
import android.app.FragmentTransaction;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import static android.app.ActionBar.*;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Categories extends FragmentActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
        btn = (Button)findViewById(R.id.button);
        ViewPager vp = (ViewPager)findViewById(R.id.viewpager);
        SwipeAdapter swipeAdapter = new SwipeAdapter(getSupportFragmentManager());
        vp.setAdapter(swipeAdapter);
    }

}
