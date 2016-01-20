package com.example.paulac.moneytracker;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.widget.Button;

public class Categories extends ActionBarActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        CategorySwipeview categorySwipeview = (CategorySwipeview)getSupportFragmentManager().findFragmentByTag("categorySwipeview");
        if (categorySwipeview == null){
            categorySwipeview = new CategorySwipeview();
            FragmentTransaction transaction = getSupportFragmentManager(). beginTransaction();
            transaction.add(android.R.id.content,categorySwipeview,"categorySwipeview");
            transaction.commit();
        }


        /*btn = (Button)findViewById(R.id.button);
        ViewPager vp = (ViewPager)findViewById(R.id.viewpager);
        CategorySwipeAdapter swipeAdapter = new CategorySwipeAdapter(getSupportFragmentManager());
        vp.setAdapter(swipeAdapter);*/
    }

}
