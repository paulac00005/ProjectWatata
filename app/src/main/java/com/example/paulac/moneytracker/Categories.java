package com.example.paulac.moneytracker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class Categories extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        supportRequestWindowFeature(Window.FEATURE_INDETERMINATE_PROGRESS);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
        ViewPager vp = (ViewPager)findViewById(R.id.viewpager);
        CategorySwipeAdapter swipeAdapter = new CategorySwipeAdapter(getSupportFragmentManager());
        vp.setAdapter(swipeAdapter);
    }

}
