package com.example.paulac.moneytracker;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.example.paulac.moneytracker.Database.DataProvider;
import com.example.paulac.moneytracker.Database.ListDataAdapter;
import com.example.paulac.moneytracker.Database.UserDbHelper;

import java.util.Calendar;

public class HomeSwipeview extends Fragment {

    SQLiteDatabase sqLiteDatabase;
    UserDbHelper userDbHelper;
    Cursor cur;
    ListDataAdapter listDataAdapter;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int page = getArguments().getInt("someInt", 0);
        String title = getArguments().getString("someTitle");
    }


    public static HomeSwipeview newInstance(int page, String title) {
        HomeSwipeview fragmentFirst = new HomeSwipeview();
        Bundle args = new Bundle();
        args.putInt("someInt", page);
        args.putString("someTitle", title);
        fragmentFirst.setArguments(args);
        return fragmentFirst;
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_home_swipview, container, false);
        ListView lv = (ListView)view.findViewById(R.id.listView);
        listDataAdapter = new ListDataAdapter(getContext(), R.layout.homelist);
        lv.setAdapter(listDataAdapter);
        userDbHelper = new UserDbHelper(getContext());
        sqLiteDatabase = userDbHelper.getReadableDatabase();
        cur = userDbHelper.getInfo(sqLiteDatabase);

        if(cur.moveToFirst()){
            do{
                String category, amount, note, date, event, location;

                category = cur.getString(0);
                amount = cur.getString(1);
                note = cur.getString(2);
                date = cur.getString(3);
                event = cur.getString(4);
                location = cur.getString(5);
                DataProvider dataProvider = new DataProvider(category, amount, note, date, event, location);
                listDataAdapter.add(dataProvider);
            }while (cur.moveToNext());
        }
        return view;
    }

}
