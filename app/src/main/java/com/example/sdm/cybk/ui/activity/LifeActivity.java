package com.example.sdm.cybk.ui.activity;

import android.app.Activity;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;

import com.example.sdm.cybk.R;
import com.example.sdm.cybk.model.bean.info.Riding_message;

/**
 * Created by sdm on 2015/8/19.
 */
public class LifeActivity extends Activity {

    private TextView eat1;
    private TextView eat2;
    private TextView eatplace1;
    private TextView eatplace2;
    private TextView eatplace3;
    private TextView eatplace4;


    private TextView wear;


    private TextView live1;
    private TextView live2;
    private TextView live3;
    private TextView live4;
    private TextView live5;
    private TextView livecloselight;
    private TextView livecloselightTime;
    private TextView liveclosedoor;
    private TextView liveclosedoorTime;

    private TextView goWay1;
    private TextView goWay2;
    private TextView goWay3;
    private TextView goWay4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lifeactivity_main);
        setData();
    }

    private void setData() {
        TextView mTextView = (TextView) findViewById(R.id.tv_title);
        mTextView.setText("衣食住行");
        setEatData();
        setWearData();
        setLiveData();
        setGoData();
    }


    private void setEatData() {
        eat1 = (TextView) findViewById(R.id.eat1);
        eat2 = (TextView) findViewById(R.id.eat2);
        eatplace1 = (TextView) findViewById(R.id.eatplace1);
        eatplace2 = (TextView) findViewById(R.id.eatplace2);
        eatplace3 = (TextView) findViewById(R.id.eatplace3);
        eatplace4 = (TextView) findViewById(R.id.eatplace4);

        eat1.setText("正所谓“民以食为天”，对于正在长身体的你们，补充体力是很重要的。那么，接下来就来了解一下我们学校的食堂：");
        eatplace1.setText("中心食堂");
        eatplace2.setText("兴业苑食堂");
        eatplace3.setText("大学城食堂");
        eatplace4.setText("第三食堂");

        String eatPlace_outside = "除了学校的食堂外，在学校的外面也有很多令人食指大动的小吃哦！像火锅、大盘鸡、铁板烧、串串、干锅等，不过大家在选择时一定要注意饮食卫生。";
        int eatstart=eatPlace_outside.indexOf("火锅、大盘鸡、铁板烧、串串、干锅");
        int eatend=eatstart+"火锅、大盘鸡、铁板烧、串串、干锅".length();
        SpannableStringBuilder eatstyle=new SpannableStringBuilder(eatPlace_outside);
        eatstyle.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.life_red)), eatstart, eatend, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        eat2.setText(eatstyle);
    }

    private void setWearData() {
        wear = (TextView) findViewById(R.id.wear);
        String wearContent = "重庆的天气比较热，夏天穿得随意一些，凉爽一些就好。（注意：为了我们共同的校园环境文明，" +
                "不能穿拖鞋进教学楼）然而冬季呢？对于来自南方沿海的同学来说，重庆真的是算不上暖和，" +
                "对于在北方“温室”长大的同学来说，重庆冬季没有供热系统，可能也会感到一丝的凉意。还有一点，" +
                "重庆地处两江交汇处，空气温度温差较大，这样部分同学难免会觉得冷。所以，在冬季，大家还是多穿一些为好，" +
                "免得在冷风中瑟瑟发抖。";

        int wearstart=wearContent.indexOf("温差较大");
        int wearend=wearstart+"温差较大".length();
        SpannableStringBuilder wearstyle=new SpannableStringBuilder(wearContent);
        wearstyle.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.text_blue)), wearstart, wearend, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        wear.setText(wearstyle);
    }

    private void setLiveData() {
        live1 = (TextView) findViewById(R.id.live1);
        live2 = (TextView) findViewById(R.id.live2);
        live3 = (TextView) findViewById(R.id.live3);
        live4 = (TextView) findViewById(R.id.live4);
        live5 = (TextView) findViewById(R.id.live5);

        livecloselight = (TextView) findViewById(R.id.live_closelight);
        livecloselightTime = (TextView) findViewById(R.id.live_closelightTime);
        liveclosedoor = (TextView) findViewById(R.id.live_closedoor);
        liveclosedoorTime = (TextView) findViewById(R.id.live_closedoorTime);

        live1.setText("刚来到学校的你们，想必很想了解一下，在大学期间将会留给你最深回忆的地方——寝室。那么，就让我们来参观参观吧！");

        String closetime = "每一栋公寓都会有管理员，他们会负责我们寝室的安全，并且管理我们最重要的两样必不可缺的能源——水和电！需要注意的是，每一栋公寓都有固定的寝室熄灯和关门时间：";
        int livestart1=closetime.indexOf("熄灯和关门时间：");
        int liveend1=livestart1+"熄灯和关门时间：".length();
        SpannableStringBuilder livestyle1=new SpannableStringBuilder(closetime);
        livestyle1.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.life_yellow)), livestart1, liveend1, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        live2.setText(livestyle1);

        livecloselight.setText("一般各栋熄灯时间");
        livecloselightTime.setText("23：30  （周日至周四）\n" +
                "    24：00  （周五至周六）");
        liveclosedoor.setText("一般各栋关门（记晚归）时间");
        liveclosedoorTime.setText("23：30（周日至周四）\n" +
                "    24：00（周末及复习期间）");

        String wish = "洗衣房：一般每栋公寓都有投币洗衣机，可以先到管理员那里换取硬币，然后就可以自己用洗衣机洗衣服啦，价格根据所洗衣物进行计算。";
        int livestart2=wish.indexOf("洗衣房：");
        int liveend2=livestart2+"洗衣房：".length();
        SpannableStringBuilder livestyle2=new SpannableStringBuilder(wish);
        livestyle2.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.life_yellow)), livestart2, liveend2, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        live3.setText(livestyle2);

        String house = "寝室：如果寝室里的门窗、家具等有损坏，可以到管理员那里报修；如果是人为损坏，则需要在维修好后付费。";
        int livestart3=house.indexOf("寝室：");
        int liveend3=livestart3+"寝室：".length();
        SpannableStringBuilder livestyle3=new SpannableStringBuilder(house);
        livestyle3.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.life_yellow)), livestart3, liveend3, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        live4.setText(livestyle3);

        String hygiene = "卫生：寝室卫生校学生会宿管会都会有定期的检查。常规检查则是在每周一下午，由校学生会宿管会组织全校寝室卫生检查。";
        int livestart4=hygiene.indexOf("卫生：");
        int liveend4=livestart3+"卫生：".length();
        SpannableStringBuilder livestyle4=new SpannableStringBuilder(hygiene);
        livestyle4.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.life_yellow)), livestart4, liveend4, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        live5.setText(livestyle4);
    }


    private void setGoData() {
        goWay1 = (TextView) findViewById(R.id.go1);
        goWay2 = (TextView) findViewById(R.id.go2);
        goWay3 = (TextView) findViewById(R.id.go3);
        goWay4 = (TextView) findViewById(R.id.go4);

        goWay1.setText("正所谓“蜀道难，难于上青天”，在重庆这座山城，自行车自然是无法轻松的穿梭于这蜀道之上了，因此，我们的主要代步工具就是公交车了，那么接下来就让我们熟悉一下我们常去的地方的交通路线吧！");

        String theway = "公交：347路、346路都是从南坪直接到学校的；" +
                "如果你想要去重庆的其它几所大学，如重庆大学、四川外语学院、西南政法大学等，可以先从学校坐346路车到南坪，然后再乘坐808路车。\n" +
                "另外，在南坪会展中心乘301路等李家沱、鱼洞方向的公交，可以去重庆工商大学、重庆第二师范学院、重庆交通大学等。重庆的公交很发达，乘车路线也很多，如果有什么不清楚的可以拨打16866666来查询或者在公交车站问讯处询问。";
        int cstart1=theway.indexOf("公交：");
        int cend1=cstart1+"公交：".length();
        int cstart2 = theway.indexOf("346");
        int cend2=cstart2+"346".length();
        int cstart3 = theway.indexOf("347");
        int cend3=cstart3+"347".length();
        int cstart4 = theway.indexOf("808");
        int cend4=cstart4+"808".length();
        int cstart5 = theway.indexOf("301");
        int cend5=cstart5+"301".length();
        int cstart6 = theway.indexOf("16866666");
        int cend6=cstart6+"16866666".length();
        SpannableStringBuilder style2=new SpannableStringBuilder(theway);
        style2.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.ridingway_org)), cstart1, cend1, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        style2.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.ridingway_org)), cstart2, cend2, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        style2.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.ridingway_org)), cstart3, cend3, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        style2.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.ridingway_org)), cstart4, cend4, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        style2.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.ridingway_org)), cstart5, cend5, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        style2.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.ridingway_org)), cstart6, cend6, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        goWay2.setText(style2);

        String airTris = "索道：索道是重庆的特色交通工具之一。跨江索道往返于解放碑新华路与上新街，有兴趣的同学可以试试，说不定会别有一番风味哦！怕高的同学可以放心，绝对安全！";
        int dstart=airTris.indexOf("索道：");
        int dend=dstart+"索道：".length();
        SpannableStringBuilder style3=new SpannableStringBuilder(airTris);
        style3.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.ridingway_org)), dstart, dend, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        goWay3.setText(style3);

        String fastTris = "轻轨：轻轨是重庆的另一项特色交通工具，轻轨一号线第一阶段从朝天门到沙坪坝段，全长16.5公里，共14站。" +
                "轻轨二号线从校场口到动物园，全程14公里，共13站。轻轨三号线从二塘到江北机场，全程39公里，共30站。" +
                "速度快捷，而且不会有令人烦恼的堵车问题，有空的时候坐轻轨游览重庆也是不错的选择。此外，" +
                "从朝天门到大学城的地铁一号线与江北机场到鱼洞的轻轨三号线目前也已正式投入营运。";
        int estart=fastTris.indexOf("轻轨：");
        int eend=estart+"轻轨：".length();
        SpannableStringBuilder style4=new SpannableStringBuilder(fastTris);
        style4.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.ridingway_org)), estart, eend, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        goWay4.setText(style4);

    }
}
