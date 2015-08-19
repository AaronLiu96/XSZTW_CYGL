package com.example.sdm.cybk.ui.activity;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.sdm.cybk.R;
import com.example.sdm.cybk.model.bean.NewStudent;
import com.example.sdm.cybk.ui.adapter.MyListAdapter;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends FragmentActivity {

    private MyListAdapter mAdapter;
    private ListView listView;
    private List<NewStudent> studentMany = new ArrayList<NewStudent>();
    private String name[] = {"入学须知","新生、班级群","乘车路线","校内导航","宿舍楼概况","衣食住行","通信娱乐","网络资源","学校组织"};
    private int picture[] = {R.mipmap.doschool, R.mipmap.qqgroup, R.mipmap.traffic, R.mipmap.navigation, R.mipmap.dorm
            , R.mipmap.life, R.mipmap.play, R.mipmap.net, R.mipmap.department};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView mTextView = (TextView) findViewById(R.id.tv_title);
        mTextView.setText("重邮攻略");
        initData();
        listView = (ListView) findViewById(R.id.lv_allmessage);
        mAdapter = new MyListAdapter(this, R.layout.baike_item, studentMany);
        listView.setAdapter(mAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent notice = new Intent(MainActivity.this,GoSchoolActivity.class);
                        startActivity(notice);
                        break;
                    case 1:
                        Intent newStudentGroup = new Intent(MainActivity.this,NewStudentGroupActivity.class);
                        startActivity(newStudentGroup);
                        break;
                    case 2:
                        Intent ridingWay = new Intent(MainActivity.this,RidingActivity.class);
                        startActivity(ridingWay);
                        break;
                    case 3:
                        Intent schoolBus = new Intent(MainActivity.this, SchoolBusActivity.class);
                        startActivity(schoolBus);
                        break;
                    case 4:
                        Intent dormitory = new Intent(MainActivity.this, DormitoryActivity.class);
                        startActivity(dormitory);
                        break;
                    case 5:
                        Intent life = new Intent(MainActivity.this,LifeActivity.class);
                        startActivity(life);
                        break;
                    case 6:
                        Intent play = new Intent(MainActivity.this,ComPlayActivity.class);
                        startActivity(play);
                        break;
                    case 7:
                        Intent net = new Intent(MainActivity.this,NetDataActivity.class);
                        startActivity(net);
                        break;
                    case 8:
                        Intent school = new Intent(MainActivity.this,SchoolGroupActivity.class);
                        startActivity(school);
                        break;
                }
            }
        });
    }

    private void initData(){
        for (int i = 0; i < name.length ; i++) {
            NewStudent ns = new NewStudent(picture[i], name[i]);
            studentMany.add(ns);
        }
    }
}