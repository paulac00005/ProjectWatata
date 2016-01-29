package com.example.paulac.moneytracker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class CategorySwipeview extends ListFragment implements AdapterView.OnItemClickListener {

    CategorySwipeAdapter categorySwipeAdapter;

    public void setCategorySwipeAdapter(CategorySwipeAdapter categorySwipeAdapter) {
        this.categorySwipeAdapter = categorySwipeAdapter;
    }

    private String title;
    private int page;
    String[] a = {"Food and Beverage"};


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
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);

        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(getActivity(), R.array.Expenses, android.R.layout.simple_list_item_1);
            setListAdapter(adapter1);
            getListView().setOnItemClickListener(this);

        }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if(position == 0){
            Intent i = new Intent(getActivity(),Add_Transaction.class);
            i.putExtra("text", "Food & Beverage");
            this.startActivity(i);
        }else if(position == 1){
            Intent i = new Intent(getActivity(),Add_Transaction.class);
            i.putExtra("text", "Bills & Utilities");
            this.startActivity(i);
        }else if(position == 2) {
            Intent i = new Intent(getActivity(), Add_Transaction.class);
            i.putExtra("text", "Transportation");
            this.startActivity(i);
        }else if(position == 3) {
            Intent i = new Intent(getActivity(), Add_Transaction.class);
            i.putExtra("text", "Shopping");
            this.startActivity(i);
        }else if(position == 4) {
            Intent i = new Intent(getActivity(), Add_Transaction.class);
            i.putExtra("text", "Friends & Lover");
            this.startActivity(i);
        }else if(position == 5) {
            Intent i = new Intent(getActivity(), Add_Transaction.class);
            i.putExtra("text", "Entertainment");
            this.startActivity(i);
        }else if(position == 6) {
            Intent i = new Intent(getActivity(), Add_Transaction.class);
            i.putExtra("text", "Travel");
            this.startActivity(i);
        }else if(position == 7) {
            Intent i = new Intent(getActivity(), Add_Transaction.class);
            i.putExtra("text", "Health & Fitness");
            this.startActivity(i);
        }else if(position == 8) {
            Intent i = new Intent(getActivity(), Add_Transaction.class);
            i.putExtra("text", "Gifts & Donations");
            this.startActivity(i);
        }else if(position == 9) {
            Intent i = new Intent(getActivity(), Add_Transaction.class);
            i.putExtra("text", "Family");
            this.startActivity(i);
        }else if(position == 10) {
            Intent i = new Intent(getActivity(), Add_Transaction.class);
            i.putExtra("text", "Education");
            this.startActivity(i);
        }else if(position == 11) {
            Intent i = new Intent(getActivity(), Add_Transaction.class);
            i.putExtra("text", "Investment");
            this.startActivity(i);
        }else if(position == 12) {
            Intent i = new Intent(getActivity(), Add_Transaction.class);
            i.putExtra("text", "Insurances");
            this.startActivity(i);
        }else if(position == 13) {
            Intent i = new Intent(getActivity(), Add_Transaction.class);
            i.putExtra("text", "Fees & Charges");
            this.startActivity(i);
        }else if(position == 14) {
            Intent i = new Intent(getActivity(), Add_Transaction.class);
            i.putExtra("text", "Other Expense");
            this.startActivity(i);
        }


        /*Toast.makeText(getActivity(), "Item: " + position, Toast.LENGTH_SHORT)
                .show();*/
    }
}
