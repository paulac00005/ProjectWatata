package com.example.paulac.moneytracker;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import java.util.Calendar;
import java.util.Date;

public class Home extends ActionBarActivity implements View.OnClickListener {

    HomeSwipeAdapter homeSwipeAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        supportRequestWindowFeature(Window.FEATURE_INDETERMINATE_PROGRESS);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ViewPager vp = (ViewPager) findViewById(R.id.HomeViewPager);
        Button add = (Button) findViewById(R.id.Add);
        HomeSwipeAdapter swipeAdapter = new HomeSwipeAdapter(getSupportFragmentManager());
        vp.setAdapter(swipeAdapter);


        Calendar now = Calendar.getInstance();
        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH);

        if(month == 0 && year == 2016){
            vp.setCurrentItem(0);
        }
        else if(month == 1 && year == 2016) {
            vp.setCurrentItem(1);
        }
        else if(month == 2 && year == 2016){
            vp.setCurrentItem(2);
        }
        else if(month == 3 && year == 2016){
            vp.setCurrentItem(3);
        }
        else if(month == 4 && year == 2016){
            vp.setCurrentItem(4);
        }
        else if(month == 5 && year == 2016){
            vp.setCurrentItem(5);
        }
        else if(month == 6 && year == 2016){
            vp.setCurrentItem(6);
        }
        else if(month == 7 && year == 2016){
            vp.setCurrentItem(7);
        }
        else if(month == 8 && year == 2016){
            vp.setCurrentItem(8);
        }
        else if(month == 9 && year == 2016){
            vp.setCurrentItem(9);
        }
        else if(month == 10 && year == 2016){
            vp.setCurrentItem(10);
        }
        else if(month == 11 && year == 2016){
            vp.setCurrentItem(11);
        }
        else if(month == 0 && year == 2017){
            vp.setCurrentItem(12);
        }
        else if(month == 1 && year == 2017){
            vp.setCurrentItem(13);
        }
        else if(month == 2 && year == 2017){
            vp.setCurrentItem(14);
        }
        else if(month == 3 && year == 2017){
            vp.setCurrentItem(15);
        }
        else if(month == 4 && year == 2017){
            vp.setCurrentItem(16);
        }
        else if(month == 5 && year == 2017){
            vp.setCurrentItem(17);
        }
        else if(month == 6 && year == 2017){
            vp.setCurrentItem(18);
        }
        else if(month == 7 && year == 2017){
            vp.setCurrentItem(19);
        }
        else if(month == 8 && year == 2017){
            vp.setCurrentItem(20);
        }
        else if(month == 9 && year == 2017){
            vp.setCurrentItem(21);
        }
        else if(month == 10 && year == 2017){
            vp.setCurrentItem(22);
        }
        else if(month == 11 && year == 2017){
            vp.setCurrentItem(23);
        }
        else if(month == 0 && year == 2018) {
            vp.setCurrentItem(24);
        }
        else if(month == 1 && year == 2018) {
            vp.setCurrentItem(25);
        }
        else if(month == 2 && year == 2018) {
            vp.setCurrentItem(26);
        }
        else if(month == 3 && year == 2018) {
            vp.setCurrentItem(27);
        }
        else if(month == 4 && year == 2018) {
            vp.setCurrentItem(28);
        }
        else if(month == 5 && year == 2018) {
            vp.setCurrentItem(29);
        }
        else if(month == 6 && year == 2018) {
            vp.setCurrentItem(30);
        }
        else if(month == 7 && year == 2018) {
            vp.setCurrentItem(31);
        }
        else if(month == 8 && year == 2018) {
            vp.setCurrentItem(32);
        }
        else if(month == 9 && year == 2018) {
            vp.setCurrentItem(33);
        }
        else if(month == 10 && year == 2018) {
            vp.setCurrentItem(34);
        }
        else if(month == 11 && year == 2018) {
            vp.setCurrentItem(35);
        }
    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent(this, Add_Transaction.class);
        startActivity(i);
    }
}