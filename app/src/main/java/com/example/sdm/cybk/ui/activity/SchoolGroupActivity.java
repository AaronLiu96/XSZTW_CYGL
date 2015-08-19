package com.example.sdm.cybk.ui.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Display;
import android.view.WindowManager;
import android.widget.GridView;
import android.widget.TextView;

import com.example.sdm.cybk.R;
import com.example.sdm.cybk.model.bean.GroupImage;
import com.example.sdm.cybk.model.bean.Image;
import com.example.sdm.cybk.ui.adapter.SchoolGridAdapter;

import java.util.ArrayList;
import java.util.List;

public class SchoolGroupActivity extends Activity {

    private List thingList = new ArrayList();

    private GridView mGridView;
    private SchoolGridAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.schoolgroupactivity_main);
        TextView mTextView = (TextView) findViewById(R.id.tv_title);
        mTextView.setText("学校组织");

        mGridView = (GridView) findViewById(R.id.group_GridView);

//        WindowManager windowManager = getWindowManager();
//        Display display = windowManager.getDefaultDisplay();
//        int wh=display.getWidth();
//        int weith = (wh-(3*Dp2Px(this,4)))/2;
//        int he = display.getHeight();
//        int height = (he-(3*Dp2Px(this,4)))/3;

        String title[] = GroupImage.getTitle();
        int picture[] = GroupImage.getImage();
        for (int i = 0; i < title.length ; i++) {
            Image image = new Image();
            image.setPicture(picture[i]);
            image.setTitle(title[i]);
            thingList.add(image);
        }
        mAdapter = new SchoolGridAdapter(this,R.layout.schoolgroup_item,thingList);
        mGridView.setAdapter(mAdapter);
    }

    public static int Dp2Px(Context context, float dp) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dp * scale + 0.5f);
    }
}
