package com.example.sdm.cybk.ui.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Display;
import android.view.WindowManager;
import android.widget.TextView;

import com.example.sdm.cybk.R;


public class GoSchoolActivity extends Activity{

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.goschool_main);
        mTextView = (TextView) findViewById(R.id.tv_title);
        mTextView.setText("入学须知");

    }

}
