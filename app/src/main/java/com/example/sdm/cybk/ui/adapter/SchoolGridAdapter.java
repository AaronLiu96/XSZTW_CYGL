package com.example.sdm.cybk.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sdm.cybk.R;
import com.example.sdm.cybk.model.bean.GroupImage;
import com.example.sdm.cybk.model.bean.Image;

import java.util.List;

/**
 * Created by sdm on 2015/8/19.
 */
public class SchoolGridAdapter extends ArrayAdapter {
    int mResource;
    int wh;
    int he;

    public SchoolGridAdapter(Context context, int resource, List objects) {
        super(context, resource, objects);
        mResource = resource;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       Image groupImage = (Image) getItem(position);
        ViewHolder viewHolder ;
        if(convertView ==null) {
            convertView = LayoutInflater.from(getContext()).inflate(mResource, null);
            viewHolder = new ViewHolder();
            viewHolder.imageView = (ImageView) convertView.findViewById(R.id.iv_groupImage);
            viewHolder.textView = (TextView) convertView.findViewById(R.id.tv_groupTitle);
            convertView.setTag(viewHolder);
        }
        else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.imageView.setImageResource(groupImage.getPicture());
        viewHolder.textView.setText(groupImage.getTitle());
        return convertView;
    }

    class ViewHolder{
        private ImageView imageView;
        private TextView textView;
    }
}