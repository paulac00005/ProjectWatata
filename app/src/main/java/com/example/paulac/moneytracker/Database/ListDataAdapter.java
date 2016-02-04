package com.example.paulac.moneytracker.Database;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.paulac.moneytracker.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by paulac on 2/4/16.
 */
public class ListDataAdapter extends ArrayAdapter {
    List list = new ArrayList();

    public ListDataAdapter(Context context, int resource) {
        super(context, resource);
    }

    static class LayoutHandler{
        TextView category, amount, note, date, event, location;
    }

    @Override
    public void add(Object object) {
        super.add(object);
        list.add(object);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View row = convertView;
        LayoutHandler layoutHandler;
        if(row == null){
            LayoutInflater layoutInflater = (LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = layoutInflater.inflate(R.layout.homelist,parent,false);
            layoutHandler = new LayoutHandler();
            layoutHandler.category = (TextView) row.findViewById(R.id.categoryView);
            layoutHandler.amount = (TextView) row.findViewById(R.id.amountView);
            layoutHandler.note = (TextView) row.findViewById(R.id.noteView);
            layoutHandler.date = (TextView) row.findViewById(R.id.dateView);
            layoutHandler.event = (TextView) row.findViewById(R.id.eventView);
            layoutHandler.location = (TextView) row.findViewById(R.id.locationView);
            row.setTag(layoutHandler);
        }else{
            layoutHandler = (LayoutHandler)row.getTag();

        }
        DataProvider dataProvider = (DataProvider) this.getItem(position);
        layoutHandler.category.setText(dataProvider.getCategory());
        layoutHandler.amount.setText(dataProvider.getAmount());
        layoutHandler.note.setText(dataProvider.getNote());
        layoutHandler.date.setText(dataProvider.getDate());
        layoutHandler.event.setText(dataProvider.getEvent());
        layoutHandler.location.setText(dataProvider.getLocation());
        return row;

    }
}
