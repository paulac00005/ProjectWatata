package com.example.paulac.moneytracker;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class CategorySwipeview extends ListFragment {

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



        ViewGroup view = (ViewGroup)inflater.inflate(R.layout.activity_swipeview, container, false);

        String[] datasource = {"nfksdnf","fdsaf","faef","fea","ferfgre","gresg","gsgregaeg"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),R.layout.categorylist, R.id.list, datasource);
        setListAdapter(adapter);
        setRetainInstance(true);
        //ListView lv = (ListView)view.findViewById(R.id.listView);
        TextView tvLabel = (TextView) view.findViewById(R.id.SwipetextView);
        tvLabel.setText(page + " -- " + title);
        return view;
    }
}
