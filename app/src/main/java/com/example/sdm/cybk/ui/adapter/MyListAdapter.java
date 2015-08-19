package com.example.sdm.cybk.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sdm.cybk.R;
import com.example.sdm.cybk.model.bean.NewStudent;

import java.util.List;

/**
 * Created by sdm on 2015/8/14.
 */
public class MyListAdapter extends ArrayAdapter {

    private int resourceId;

    public MyListAdapter(Context context, int textViewResourceId, List objects) {
        super(context, textViewResourceId, objects);
        resourceId = textViewResourceId;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        NewStudent newStudent = (NewStudent) getItem(position);
        ViewHolder viewHolder ;
        if(convertView ==null) {
            convertView = LayoutInflater.from(getContext()).inflate(resourceId, null);
            viewHolder = new ViewHolder();
            viewHolder.imageView = (ImageView) convertView.findViewById(R.id.iv_baikepictrue);
            viewHolder.textView = (TextView) convertView.findViewById(R.id.tv_baiketext);
            convertView.setTag(viewHolder);
        }
        else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.imageView.setImageResource(newStudent.getPictrue());
        viewHolder.textView.setText(newStudent.getName());
        return convertView;
    }

    class ViewHolder{
        private ImageView imageView;
        private TextView textView;
    }
}
