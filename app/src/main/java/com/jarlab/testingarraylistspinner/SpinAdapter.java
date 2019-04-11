package com.jarlab.testingarraylistspinner;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SpinAdapter extends ArrayAdapter<pruebaModel> {

    private Context context;

    private ArrayList<pruebaModel> model;

    public SpinAdapter(Context context, int textViewResourceId, ArrayList<pruebaModel> model) {
        super(context, textViewResourceId, model);
        this.context = context;
        this.model = model;
    }

    @Override
    public int getCount(){
        return model.size();
    }

    @Override
    public pruebaModel getItem(int position){
        return model.get(position);
    }

    @Override
    public long getItemId(int position){
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        TextView label = (TextView) super.getView(position, convertView, parent);

        label.setText(model.get(position).name);

        return label;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        TextView label = (TextView) super.getDropDownView(position, convertView, parent);
        label.setTextColor(Color.BLACK);
        label.setText(model.get(position).name);

        return label;
    }
}
