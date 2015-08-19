package com.example.sdm.cybk.ui.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.sdm.cybk.R;

public class ComPlayActivity extends Activity {

    private TextView mTextView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.communication_main);
        mTextView = (TextView) findViewById(R.id.tv_title);
        mTextView.setText("通信娱乐");
    }
}
