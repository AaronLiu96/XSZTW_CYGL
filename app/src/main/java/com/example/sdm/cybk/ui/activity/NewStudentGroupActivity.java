package com.example.sdm.cybk.ui.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.sdm.cybk.R;

/**
 * Created by sdm on 2015/8/19.
 */
public class NewStudentGroupActivity extends Activity {
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newstudentgroup_main);
        mTextView = (TextView) findViewById(R.id.tv_title);
        mTextView.setText("新生、班级群");
    }
}
