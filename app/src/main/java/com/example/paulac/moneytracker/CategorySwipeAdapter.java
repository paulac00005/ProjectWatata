package com.example.paulac.moneytracker;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by paulac on 1/13/16.
 */
public class CategorySwipeAdapter extends FragmentStatePagerAdapter {

    public CategorySwipeAdapter(FragmentManager fm) {
        super(fm);
    }


    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return CategorySwipeview.newInstance(0, "Page # 1");
            case 1:
                return CategorySwipeview.newInstance(1, "Page # 2");
            case 2:
                return CategorySwipeview.newInstance(2, "Page # 3");
            default:
                return null;
        }
    }

    /*@Override
    public Fragment getItem(int i) {
        Fragment fragment = new swipeview();
        Bundle bundle = new Bundle();
        bundle.putInt("count",i+1);
        fragment.setArguments(bundle);
        return fragment;
    }*/

    public static int count=3;

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Expenses";
            case 1:
                return "Incomes";
            case 2:
                return "Debts and Loans";
            default:
                return null;
        }
    }}

