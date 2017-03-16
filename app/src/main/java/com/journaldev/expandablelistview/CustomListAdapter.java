package com.journaldev.expandablelistview;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;


/**
 * Created by anupamchugh on 09/02/16.
 */
public class CustomListAdapter extends ArrayAdapter<Item> implements View.OnClickListener{

    private ArrayList<Item> arrayList;
    Context context;

    private static class ViewHolder {
        TextView name;
        TextView price;

    }


    public CustomListAdapter(ArrayList<Item> arrayList, Context context) {
        super(context, R.layout.item, arrayList);
        this.arrayList = arrayList;
        this.context=context;

    }


    @Override
    public void onClick(View v) {



    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Item item = arrayList.get(position);

        ViewHolder viewHolder;


        if (convertView == null) {

            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.item, parent, false);
            viewHolder.name = (TextView) convertView.findViewById(R.id.name);
            viewHolder.price = (TextView) convertView.findViewById(R.id.price);

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();

        }

        viewHolder.name.setText(item.getName());
        viewHolder.price.setText(item.getPrice());

        return convertView;
    }


}
