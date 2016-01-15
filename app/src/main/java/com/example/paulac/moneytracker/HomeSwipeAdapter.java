package com.example.paulac.moneytracker;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.widget.TextView;

import java.util.Calendar;

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
            case 12:
                return HomeSwipeview.newInstance(11, "Page # 2");
            case 13:
                return HomeSwipeview.newInstance(11, "Page # 2");
            case 14:
                return HomeSwipeview.newInstance(11, "Page # 2");
            case 15:
                return HomeSwipeview.newInstance(11, "Page # 2");
            case 16:
                return HomeSwipeview.newInstance(11, "Page # 2");
            case 17:
                return HomeSwipeview.newInstance(11, "Page # 2");
            case 18:
                return HomeSwipeview.newInstance(11, "Page # 2");
            case 19:
                return HomeSwipeview.newInstance(11, "Page # 2");
            case 20:
                return HomeSwipeview.newInstance(11, "Page # 2");
            case 21:
                return HomeSwipeview.newInstance(11, "Page # 2");
            case 22:
                return HomeSwipeview.newInstance(11, "Page # 2");
            case 23:
                return HomeSwipeview.newInstance(11, "Page # 2");
            case 24:
                return HomeSwipeview.newInstance(11, "Page # 2");
            case 25:
                return HomeSwipeview.newInstance(11, "Page # 2");
            case 26:
                return HomeSwipeview.newInstance(11, "Page # 2");
            case 27:
                return HomeSwipeview.newInstance(11, "Page # 2");
            case 28:
                return HomeSwipeview.newInstance(11, "Page # 2");
            case 29:
                return HomeSwipeview.newInstance(11, "Page # 2");
            case 30:
                return HomeSwipeview.newInstance(11, "Page # 2");
            case 31:
                return HomeSwipeview.newInstance(11, "Page # 2");
            case 32:
                return HomeSwipeview.newInstance(11, "Page # 2");
            case 33:
                return HomeSwipeview.newInstance(11, "Page # 2");
            case 34:
                return HomeSwipeview.newInstance(11, "Page # 2");
            case 35:
                return HomeSwipeview.newInstance(11, "Page # 2");
            default:
                return null;
        }

    }


    public static int count=36;



    @Override
    public int getCount() {
        return count;
    }

    int y1 = 2016;
    int y2 = 2017;
    int y3 = 2018;

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "January " + y1;
            case 1:
                    return "February " + y1;
            case 2:
                    return "March " + y1;
            case 3:
                    return "April " + y1;
            case 4:
                    return "May " + y1;
            case 5:
                    return "June " + y1;
            case 6:
                    return "July " + y1;
            case 7:
                    return "August " + y1;
            case 8:
                    return "August " + y1;
            case 9:
                    return "October " + y1;
            case 10:
                    return "November " + y1;
            case 11:
                    return "December " + y1;
            case 12:
                    return "January " + y2;
            case 13:
                    return "February " + y2;
            case 14:
                    return "March " + y2;
            case 15:
                    return "April " + y2;
            case 16:
                    return "May " + y2;
            case 17:
                    return "June " + y2;
            case 18:
                    return "July " + y2;
            case 19:
                    return "August " + y2;
            case 20:
                    return "September " + y2;
            case 21:
                    return "October " + y2;
            case 22:
                    return "November " + y2;
            case 23:
                    return "December " + y2;
            case 24:
                return "January " + y3;
            case 25:
                return "February " + y3;
            case 26:
                return "March " + y3;
            case 27:
                return "April " + y3;
            case 28:
                return "May " + y3;
            case 29:
                return "June " + y3;
            case 30:
                return "July " + y3;
            case 31:
                return "August " + y3;
            case 32:
                return "September " + y3;
            case 33:
                return "October " + y3;
            case 34:
                return "November " + y3;
            case 35:
                return "December " + y3;
            default:
                return null;
        }
    }}

