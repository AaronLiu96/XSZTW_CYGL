package com.example.sdm.cybk.ui.activity;

import android.app.Activity;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.widget.ListView;
import android.widget.TextView;

import com.example.sdm.cybk.R;
import com.example.sdm.cybk.model.bean.info.SchoolBus_message;
import com.example.sdm.cybk.ui.adapter.MultidutyAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sdm on 2015/8/15.
 */
public class SchoolBusActivity extends Activity {

    private TextView mTextView;
    private MultidutyAdapter mAdapter;

    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.schoolbusactivity_main);
        mTextView = (TextView) findViewById(R.id.tv_title);
        mListView = (ListView) findViewById(R.id.lv_nextmessage);
        setData();
    }

    private void setData() {
        mTextView.setText("校内导航");
        List schoolRoadList = new ArrayList();
        String messageSchoolBus[][] = SchoolBus_message.getSchoolbus();
        String messages =  messageSchoolBus[0][1];

        int astart=messages.indexOf("八十万");
        int aend=astart+"八十万".length();
        int bstart=messages.indexOf("新校门");
        int bend=bstart+"新校门".length();
        int cstart=messages.indexOf("三教");
        int cend=cstart+"三教".length();
        int dstart=messages.indexOf("留学生楼");
        int dend=dstart+"留学生楼".length();
        int estart=messages.indexOf("五教、八教、经管学院，");
        int eend=estart+"五教、八教、经管学院，".length();
        int fstart=messages.indexOf("20、23、19、22、18、17、21");
        int fend=fstart+"20、23、19、22、18、17、21".length();
        int gstart=messages.indexOf("15、16、24");
        int gend=gstart+"15、16、24".length();
        int hstart=messages.indexOf("25、26、27、28、29、31、30、32");
        int hend=hstart+"25、26、27、28、29、31、30、32".length();
        int istart=messages.indexOf("11、12");
        int iend=istart+"11、12".length();
        int jstart=messages.indexOf("10、9、8");
        int jend=jstart+"10、9、8".length();

        SpannableStringBuilder style=new SpannableStringBuilder(messages);
        style.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.text_blue)), astart, aend, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        style.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.text_blue)), bstart, bend, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        style.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.text_blue)), cstart, cend, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        style.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.text_blue)), dstart, dend, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        style.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.text_blue)), estart, eend, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        style.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.text_blue)), fstart, fend, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        style.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.text_blue)), gstart, gend, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        style.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.text_blue)), hstart, hend, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        style.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.text_blue)), istart, iend, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        style.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.text_blue)), jstart, jend, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);

        schoolRoadList.add(style);
        mAdapter = new MultidutyAdapter(this,R.layout.schoolroad_item,schoolRoadList);
        mListView.setAdapter(mAdapter);
    }
}
