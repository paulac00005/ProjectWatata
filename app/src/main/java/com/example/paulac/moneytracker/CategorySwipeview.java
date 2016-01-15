package com.example.paulac.moneytracker;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

public class CategorySwipeview extends Fragment {

    public static Object expenses;
    private String title;
    private int page;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        page = getArguments().getInt("someInt", 0);
        title = getArguments().getString("someTitle");
    }

    public static CategorySwipeview newInstance(int page, String title) {
        CategorySwipeview fragmentFirst = new CategorySwipeview();
        Bundle args = new Bundle();
        args.putInt("someInt", page);
        args.putString("someTitle", title);
        fragmentFirst.setArguments(args);
        return fragmentFirst;
    }




    // Inflate the view for the fragment based on layout XML
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_swipeview, container, false);
        ListView lv = (ListView)view.findViewById(R.id.listView);
        TextView tvLabel = (TextView) view.findViewById(R.id.SwipetextView);
        tvLabel.setText(page + " -- " + title);
        return view;
    }
}
