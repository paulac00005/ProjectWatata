package com.example.paulac.moneytracker;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.example.paulac.moneytracker.Database.UserDbHelper;

public class HomeSwipeview extends Fragment {

    private String title;
    private int page;
    SQLiteDatabase sqLiteDatabase;
    UserDbHelper userDbHelper;
    Cursor cur;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        page = getArguments().getInt("someInt", 0);
        title = getArguments().getString("someTitle");

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
        userDbHelper = new UserDbHelper(getContext());
        sqLiteDatabase = userDbHelper.getReadableDatabase();
        cur = userDbHelper.getInfo(sqLiteDatabase);

        if(cur.moveToFirst()){
            do{

            }while (cur.moveToNext());
        }

        TextView tvLabel = (TextView) view.findViewById(R.id.HomeSwipetextView);
        tvLabel.setText(page + " -- " + title);
        return view;
    }
}
