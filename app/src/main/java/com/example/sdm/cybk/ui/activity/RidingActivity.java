package com.example.sdm.cybk.ui.activity;

import android.app.Activity;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.widget.ListView;
import android.widget.TextView;

import com.example.sdm.cybk.R;
import com.example.sdm.cybk.model.bean.info.Riding_message;

public class RidingActivity extends Activity {

    private TextView theWay1;
    private TextView theWay2;
    private TextView theWay3;
    private TextView theWay4;
    private TextView theWay5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ridingactivity_main);
        setData();
    }

    private void setData() {
        TextView mTextView = (TextView) findViewById(R.id.tv_title);
        mTextView.setText("乘车路线");

        theWay1 = (TextView) findViewById(R.id.riding1);
        theWay2 = (TextView) findViewById(R.id.riding2);
        theWay3 = (TextView) findViewById(R.id.riding3);
        theWay4 = (TextView) findViewById(R.id.riding4);
        theWay5 = (TextView) findViewById(R.id.riding5);

        String message[] = Riding_message.getRiding();

        int astart=message[0].indexOf("报到期间");
        int aend=astart+"报到期间，".length();
        int bstart=message[0].indexOf("新生接待站");
        int bend=bstart+"新生接待站，".length();
        SpannableStringBuilder style1=new SpannableStringBuilder(message[0]);
        style1.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.ridingway_org)), astart, aend, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        style1.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.ridingway_org)), bstart, bend, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        theWay1.setText(style1);

        int cstart=message[1].indexOf("重庆江北机场");
        int cend=cstart+"重庆江北机场".length();
        SpannableStringBuilder style2=new SpannableStringBuilder(message[1]);
        style2.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.ridingway_org)), cstart, cend, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        theWay2.setText(style2);


        int dstart=message[2].indexOf("龙头寺火车站、重庆北站");
        int dend=dstart+"龙头寺火车站、重庆北站".length();
        SpannableStringBuilder style3=new SpannableStringBuilder(message[2]);
        style3.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.ridingway_org)), dstart, dend, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        theWay3.setText(style3);

        int estart=message[3].indexOf("菜园坝火车站、汽车站");
        int eend=estart+"菜园坝火车站、汽车站".length();
        SpannableStringBuilder style4=new SpannableStringBuilder(message[3]);
        style4.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.ridingway_org)), estart, eend, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        theWay4.setText(style4);

        int fstart=message[4].indexOf("朝天门码头");
        int fend=fstart+"朝天门码头".length();
        SpannableStringBuilder style5=new SpannableStringBuilder(message[4]);
        style5.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.ridingway_org)), fstart, fend, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        theWay5.setText(style5);
    }
}
