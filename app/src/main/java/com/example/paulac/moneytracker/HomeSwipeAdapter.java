package com.example.paulac.moneytracker;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by paulac on 1/13/16.
 */
public class HomeSwipeAdapter extends FragmentStatePagerAdapter {

    public HomeSwipeAdapter(FragmentManager ff) {
        super(ff);
    }


    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return HomeSwipeview.newInstance(0, "Page # 1");
            case 1:
                return HomeSwipeview.newInstance(1, "Page # 2");
            case 2:
                return HomeSwipeview.newInstance(2, "Page # 2");
            case 3:
                return HomeSwipeview.newInstance(3, "Page # 2");
            case 4:
                return HomeSwipeview.newInstance(4, "Page # 2");
            case 5:
                return HomeSwipeview.newInstance(5, "Page # 2");
            case 6:
                return HomeSwipeview.newInstance(6, "Page # 2");
            case 7:
                return HomeSwipeview.newInstance(7, "Page # 2");
            case 8:
                return HomeSwipeview.newInstance(8, "Page # 2");
            case 9:
                return HomeSwipeview.newInstance(9, "Page # 2");
            case 10:
                return HomeSwipeview.newInstance(10, "Page # 2");
            case 11:
                return HomeSwipeview.newInstance(11, "Page # 2");
            default:
                return null;
        }
    }


    public static int count=12;

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "January";
            case 1:
                return "February";
            case 2:
                return "March";
            case 3:
                return "April";
            case 4:
                return "May";
            case 5:
                return "June";
            case 6:
                return "July";
            case 7:
                return "August";
            case 8:
                return "September";
            case 9:
                return "October";
            case 10:
                return "November";
            case 11:
                return "December";
            default:
                return null;
        }
    }}

