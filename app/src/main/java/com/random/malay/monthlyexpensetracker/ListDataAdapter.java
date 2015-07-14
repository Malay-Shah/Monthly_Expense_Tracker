package com.random.malay.monthlyexpensetracker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Malay on 7/9/2015.
 */
public class ListDataAdapter extends ArrayAdapter {

    List list = new ArrayList();

    public ListDataAdapter(Context context, int resource) {
        super(context, resource);
    }

    static class LayoutHandler{
        TextView DATE, DESCRIPTION, CATEGORY, AMOUNT;
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
            row = layoutInflater.inflate(R.layout.row_layout,parent,false);
            layoutHandler = new LayoutHandler();
            layoutHandler.DATE = (TextView) row.findViewById(R.id.text_date);
            layoutHandler.DESCRIPTION = (TextView) row.findViewById(R.id.text_description);
            layoutHandler.CATEGORY = (TextView) row.findViewById(R.id.text_category);
            layoutHandler.AMOUNT = (TextView) row.findViewById(R.id.text_Amount);
            row.setTag(layoutHandler);

        }else{
            layoutHandler = (LayoutHandler) row.getTag();

        }

        DataProvider dataProvider = (DataProvider) this.getItem(position);
        layoutHandler.DATE.setText(dataProvider.getDate());
        layoutHandler.DESCRIPTION.setText(dataProvider.getDescription());
        layoutHandler.CATEGORY.setText(dataProvider.getCategory());
        layoutHandler.AMOUNT.setText(dataProvider.getAmount());

        return row;
    }
}
