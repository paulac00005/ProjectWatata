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
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HomeSwipeview extends Fragment {

    String[] values = new String[] { "Android List View",
            "Adapter implementation",
            "Simple List View In Android",
            "Create List View Android",
            "Android Example",
            "List View Source Code",
            "List View Array Adapter",
            "Android Example List View"};


    int[] flags = new int[]{
            R.drawable.money,
            R.drawable.money,
            R.drawable.money,
            R.drawable.money,
            R.drawable.money,
            R.drawable.money,
            R.drawable.money,
            R.drawable.money,
            R.drawable.money,
            R.drawable.money};

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

        List<HashMap<String,String>> aList = new ArrayList<HashMap<String,String>>();

        for(int i=0;i<10;i++){
            HashMap<String, String> hm = new HashMap<String,String>();
            hm.put("txt", "App Name : " + values[i]);
            hm.put("cur","creator : " + values[i]);
            hm.put("flag", Integer.toString(flags[i]) );
            aList.add(hm);
        }
        String[] from = { "flag","txt","cur" };

        int[] to = { R.id.textView7,R.id.textView7,R.id.textView7,R.id.textView2};



        View view = inflater.inflate(R.layout.activity_home_swipview, container, false);
        TextView tvLabel = (TextView)view.findViewById(R.id.HomeSwipetextView);
        tvLabel.setText("page " + page);
        tvLabel.setText(page + " -- " + title);
        ListView list = (ListView)view.findViewById(R.id.listView);
        SimpleAdapter adapter = new SimpleAdapter(getActivity().getBaseContext(), aList, R.layout.categorylist, from, to);
        list.setAdapter(adapter);
        return view;

    }
}
