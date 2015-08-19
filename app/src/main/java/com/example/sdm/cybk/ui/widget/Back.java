package com.example.sdm.cybk.ui.widget;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.example.sdm.cybk.R;

/**
 * Created by sdm on 2015/8/14.
 */
public class Back extends RelativeLayout {
    public Back(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.include_title, this);

        ImageView imageView = (ImageView) findViewById(R.id.iv_back);
        imageView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Activity) getContext()).finish();
            }
        });
    }
}
