package com.example.paulac.moneytracker;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.text.format.DateFormat;
import android.util.Log;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * Created by paulac on 1/13/16.
 */
public class HomeSwipeAdapter extends FragmentStatePagerAdapter {

    public static int[] years = {2016, 2017, 2018};

    public HomeSwipeAdapter(FragmentManager ff) {
        super(ff);
    }

    String[] months = {"January", "February", "March", "April", "May", "June", "July",
    "August", "September", "October", "November", "December"};

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
                return HomeSwipeview.newInstance(12, "Page # 2");
            case 13:
                return HomeSwipeview.newInstance(13, "Page # 2");
            case 14:
                return HomeSwipeview.newInstance(14, "Page # 2");
            case 15:
                return HomeSwipeview.newInstance(15, "Page # 2");
            case 16:
                return HomeSwipeview.newInstance(16, "Page # 2");
            case 17:
                return HomeSwipeview.newInstance(17, "Page # 2");
            case 18:
                return HomeSwipeview.newInstance(18, "Page # 2");
            case 19:
                return HomeSwipeview.newInstance(19, "Page # 2");
            case 20:
                return HomeSwipeview.newInstance(20, "Page # 2");
            case 21:
                return HomeSwipeview.newInstance(21, "Page # 2");
            case 22:
                return HomeSwipeview.newInstance(22, "Page # 2");
            case 23:
                return HomeSwipeview.newInstance(23, "Page # 2");
            case 24:
                return HomeSwipeview.newInstance(24, "Page # 2");
            case 25:
                return HomeSwipeview.newInstance(25, "Page # 2");
            case 26:
                return HomeSwipeview.newInstance(26, "Page # 2");
            case 27:
                return HomeSwipeview.newInstance(27, "Page # 2");
            case 28:
                return HomeSwipeview.newInstance(28, "Page # 2");
            case 29:
                return HomeSwipeview.newInstance(29, "Page # 2");
            case 30:
                return HomeSwipeview.newInstance(30, "Page # 2");
            case 31:
                return HomeSwipeview.newInstance(31, "Page # 2");
            case 32:
                return HomeSwipeview.newInstance(32, "Page # 2");
            case 33:
                return HomeSwipeview.newInstance(33, "Page # 2");
            case 34:
                return HomeSwipeview.newInstance(34, "Page # 2");
            case 35:
                return HomeSwipeview.newInstance(35, "Page # 2");
            default:
                return null;
        }

    }


    public static int count=36;



    @Override
    public int getCount() {
        return count;
    }



    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                    return months[0] + " " + years[0];
            case 1:
                    return months[1] + " " + years[0];
            case 2:
                    return months[2] + " " + years[0];
            case 3:
                    return months[3] + " " + years[0];
            case 4:
                    return months[4] + " " + years[0];
            case 5:
                    return months[5] + " " + years[0];
            case 6:
                    return months[6] + " " + years[0];
            case 7:
                    return months[7] + " " + years[0];
            case 8:
                    return months[8] + " " + years[0];
            case 9:
                    return months[9] + " " + years[0];
            case 10:
                    return months[10] + " " + years[0];
            case 11:
                    return months[11] + " " + years[0];
            case 12:
                    return months[0] + " " + years[1];
            case 13:
                    return months[1] + " " + years[1];
            case 14:
                    return months[2] + " " + years[1];
            case 15:
                    return months[3] + " " + years[1];
            case 16:
                    return months[4] + " " + years[1];
            case 17:
                    return months[5] + " " + years[1];
            case 18:
                    return months[6] + " " + years[1];
            case 19:
                    return months[7] + " " + years[1];
            case 20:
                    return months[8] + " " + years[1];
            case 21:
                    return months[9] + " " + years[1];
            case 22:
                    return months[10] + " " + years[1];
            case 23:
                    return months[11] + " " + years[1];
            case 24:
                return months[0] + " " + years[2];
            case 25:
                return months[1] + " " + years[2];
            case 26:
                return months[2] + " " + years[2];
            case 27:
                return months[3] + " " + years[2];
            case 28:
                return months[4] + " " + years[2];
            case 29:
                return months[5] + " " + years[2];
            case 30:
                return months[6] + " " + years[2];
            case 31:
                return months[7] + " " + years[2];
            case 32:
                return months[8] + " " + years[2];
            case 33:
                return months[9] + " " + years[2];
            case 34:
                return months[10] + " " + years[2];
            case 35:
                return months[11] + " " + years[2];
            default:
                return null;
        }
    }

}

