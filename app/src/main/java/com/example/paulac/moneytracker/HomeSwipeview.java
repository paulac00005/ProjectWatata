package com.example.paulac.moneytracker;

import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class HomeSwipeview extends ListFragment {

    private String title;
    private int page;


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




    // Inflate the view for the fragment based on layout XML
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_home_swipview, container, false);
        TextView tvLabel = (TextView) view.findViewById(R.id.HomeSwipetextView);
        ListView listView = (ListView) view.findViewById(R.id.listView);

        // Defined Array values to show in ListView
        String[] values = new String[] { "Android List View",
                "Adapter implementation",
                "Simple List View In Android",
                "Create List View Android",
                "Android Example",
                "List View Source Code",
                "List View Array Adapter",
                "Android Example List View"};

        this.setListAdapter(new ArrayAdapter<String>(
                this, R.layout.listviewlayout,
                R.id.Itemname, itemname));


tvLabel.setText(page + " -- " + title);
        return view;
    }
}
