package com.example.sdm.cybk.ui.adapter;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sdm.cybk.R;

import java.util.List;

/**
 * Created by sdm on 2015/8/16.
 */
public class MultidutyAdapter extends ArrayAdapter {

    private int resourceId;
    boolean haveImage = false;

    public MultidutyAdapter(Context context, int resource, List objects) {
        super(context, resource, objects);
        resourceId = resource;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        SpannableStringBuilder ms = (SpannableStringBuilder) getItem(position);
        ViewHolder viewHolder ;
        if(convertView ==null) {
            convertView = LayoutInflater.from(getContext()).inflate(resourceId, null);
            viewHolder = new ViewHolder();
            viewHolder._content = (TextView) convertView.findViewById(R.id.tv_schoolroad);
            viewHolder._imageVIew = (ImageView) convertView.findViewById(R.id.iv_schoolroad);
            convertView.setTag(viewHolder);
        }
        else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder._content.setText(ms);
        viewHolder._imageVIew.setImageResource(R.mipmap.road);
        return convertView;
    }

    class ViewHolder{
        private TextView _content;
        private ImageView _imageVIew;
    }
}
