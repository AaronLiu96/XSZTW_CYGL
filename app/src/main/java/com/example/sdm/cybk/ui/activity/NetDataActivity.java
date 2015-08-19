package com.example.sdm.cybk.ui.activity;

import android.app.Activity;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;

import com.example.sdm.cybk.R;


public class NetDataActivity extends Activity {

    private TextView xbs;
    private TextView net_data;

    private TextView mTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.net_main);
        mTextView = (TextView) findViewById(R.id.tv_title);
        mTextView.setText("网络资源");
        net_data = (TextView) findViewById(R.id.net_data);
        String data = "我校的校园网建设非常的棒,网上资源应有尽有。还有" +
                "一个不错的地方就是——重庆邮电大学“红岩网校”" +
                "http://202.202.43.125/,如果有什么需要的话可以到上" +
                "面的查找。当然除了这些正规的负责日常事务的网站" +
                "外,还有好多其它网站:娱乐性的诸如重邮Online、BT" +
                "下载中心等;服务类的如软件中心、学识中心等。为了" +
                "便于大家更加详细的了解校内网络资源,我们将同学们" +
                "经常访问的校内网站,作一简单介绍:";
        int start_2 = data.indexOf("红岩网校");
        int end_2= start_2+"红岩网校".length();
        int start_3 = data.indexOf("重邮Online、BT下载中心");
        int end_3= start_3+"重邮Online、BT下载中心".length();
        int start_4 = data.indexOf("软件中心、学识中心");
        int end_4= start_4+"软件中心、学识中心".length();

        SpannableStringBuilder builder_2 = new SpannableStringBuilder(data);

        builder_2.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.net_orange)),start_2,end_2,Spanned.SPAN_EXCLUSIVE_INCLUSIVE);
        builder_2.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.net_orange)),start_3,end_3, Spanned.SPAN_EXCLUSIVE_INCLUSIVE);
        builder_2.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.net_orange)),start_4,end_4, Spanned.SPAN_EXCLUSIVE_INCLUSIVE);

        net_data.setText(builder_2);

        /**
         *
         */

        xbs = (TextView) findViewById(R.id.xbs);
        String name_1= "请关注“重邮小帮手”";
        int start_1 = name_1.indexOf("重邮小帮手");
        int end_1 = start_1+"重邮小帮手".length();

        SpannableStringBuilder builder_1 = new SpannableStringBuilder(name_1);
        builder_1.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.net_orange)),start_1,end_1, Spanned.SPAN_EXCLUSIVE_INCLUSIVE);
        xbs.setText(builder_1);
    }
}
