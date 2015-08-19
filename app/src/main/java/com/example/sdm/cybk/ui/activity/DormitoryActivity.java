package com.example.sdm.cybk.ui.activity;

import android.app.Activity;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;

import com.example.sdm.cybk.R;

/**
 * Created by sdm on 2015/8/19.
 */
public class DormitoryActivity extends Activity {

    private TextView dormitory1;
    private TextView dormitory2;
    private TextView dormitory3;
    private TextView dormitory4;
    private TextView dormitory5;
    private TextView dormitory6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dormitory_main);
        TextView mTextView = (TextView) findViewById(R.id.tv_title);
        mTextView.setText("宿舍楼概况");
        setData();
    }

    private void setData() {

        dormitory1 = (TextView) findViewById(R.id.dormitory1);
        dormitory2 = (TextView) findViewById(R.id.dormitory2);
        dormitory3 = (TextView) findViewById(R.id.dormitory3);
        dormitory4 = (TextView) findViewById(R.id.dormitory4);
        dormitory5 = (TextView) findViewById(R.id.dormitory5);
        dormitory6 = (TextView) findViewById(R.id.dormitory6);

        String dor1 = "今年大一新生根据专业班级按照姓氏分配在宿舍楼1、5、6、8-12、15-20、22-30、32栋。床铺的长宽大致为80cm*200cm。";
        int dorstart1=dor1.indexOf("1、5、6、8-12、15-20、22-30、32");
        int dorend1=dorstart1+"1、5、6、8-12、15-20、22-30、32".length();
        SpannableStringBuilder dorstyle1=new SpannableStringBuilder(dor1);
        dorstyle1.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.life_yellow)), dorstart1, dorend1, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        dormitory1.setText(dorstyle1);

        String dor2 = "其中1、5、6是学校现存最老的寝室。住宿条件比较差。其中1栋是女生宿舍，5、6栋是男生宿舍。" +
                "整体情况是每层楼设有公用的卫生间、洗澡间，这也就意味着每个寝室都没有独立卫生间，没有阳台。" +
                "寝室一般都是4人间（每个寝室有2个高低床，一张大书桌、4个凳子和两个供大家放东西的柜台）。" +
                "虽然室内环境简陋，但是位置十分优越。处于校园中心，上课、生活都极其便利。";
        int dorstart2=dor2.indexOf("1、5、6");
        int dorend2=dorstart2+"1、5、6".length();
        int dorstart21=dor2.indexOf("女生");
        int dorend21=dorstart21+"女生".length();
        int dorstart22=dor2.indexOf("男生");
        int dorend22=dorstart22+"男生".length();
        int dorstart23=dor2.indexOf("4人间");
        int dorend23=dorstart23+"4人间".length();
        int dorstart24=dor2.indexOf("校园中心");
        int dorend24=dorstart24+"校园中心".length();
        SpannableStringBuilder dorstyle2=new SpannableStringBuilder(dor2);
        dorstyle2.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.life_yellow)), dorstart2, dorend2, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        dorstyle2.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.life_yellow)), dorstart21, dorend21, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        dorstyle2.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.life_yellow)), dorstart22, dorend22, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        dorstyle2.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.life_yellow)), dorstart23, dorend23, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        dorstyle2.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.life_yellow)), dorstart24, dorend24, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        dormitory2.setText(dorstyle2);

        String dor3 = "8-12栋位于学校情人坡旁边，是学校标准的4人间，上床下桌，配有阳台，独立卫生间。楼栋周边环境一流，食堂与超市一应俱全，为学习生活提供不少的便利。";
        int dorstart3=dor3.indexOf("8-12");
        int dorend3=dorstart3+"8-12".length();
        int dorstart31=dor3.indexOf("4人间");
        int dorend31=dorstart31+"4人间".length();
        SpannableStringBuilder dorstyle3=new SpannableStringBuilder(dor3);
        dorstyle3.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.life_yellow)), dorstart3, dorend3, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        dorstyle3.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.life_yellow)), dorstart31, dorend31, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        dormitory3.setText(dorstyle3);

        String dor4 = "15-20栋分布在太极运动场的南边与东边。周边有学校" +
                "的兴业院食堂及众多的超市、商铺，校车从这里穿过。" +
                "寝室内部均设有独立卫生间，并在一些楼层设有洗衣" +
                "机供大家使用，根据每栋宿舍不同，楼层不同分为4人间、6人间两种。4人间基本情况与8-12栋一样，而6人" +
                "间则是上下铺与上床下桌的混搭。";
        int dorstart4=dor4.indexOf("15-20");
        int dorend4=dorstart4+"15-20".length();
        int dorstart41=dor4.indexOf("4人间、6人间");
        int dorend41=dorstart41+"4人间、6人间".length();
        SpannableStringBuilder dorstyle4=new SpannableStringBuilder(dor4);
        dorstyle4.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.life_yellow)), dorstart4, dorend4, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        dorstyle4.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.life_yellow)), dorstart41, dorend41, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        dormitory4.setText(dorstyle4);

        String dor5 = "22-24屹立于悠悠重邮高处，周边风景秀丽，无论冬夏，绿色永存，每至冬季，一旁还有腊梅香气飘来。" +
                "楼栋门前不时还会有校车等路过，其周边有“千喜鹤”“好食基”、“红高粱”等食堂，还有重邮阳光超市、叮当超市、" +
                "华生园等购物场所，交通便利，可以尽情满足同学们的平日生活需求。" +
                "此外，楼栋内部住宿条件优越，环境较好，22栋全部为4人间寝室,23及24全部为6人间寝室，且有独立的阳台、卫浴。";
        int dorstart5=dor5.indexOf("22-24");
        int dorend5=dorstart5+"22-24".length();
        int dorstart51=dor5.indexOf("4人间");
        int dorend51=dorstart51+"4人间".length();
        int dorstart52=dor5.indexOf("6人间");
        int dorend52=dorstart52+"6人间".length();
        SpannableStringBuilder dorstyle5=new SpannableStringBuilder(dor5);
        dorstyle5.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.life_yellow)), dorstart5, dorend5, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        dorstyle5.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.life_yellow)), dorstart51, dorend51, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        dorstyle5.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.life_yellow)), dorstart52, dorend52, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        dormitory5.setText(dorstyle5);

        String dor6 = "25-30在学校的东南方向，周边分布有“千喜鹤”、“好食基”食堂。宿舍基本为6人间基本情况与22-24相同且有独立的阳台、卫浴，床铺是上下铺与上床下桌的混搭。";
        int dorstart6=dor6.indexOf("25-30");
        int dorend6=dorstart6+"25-30".length();
        int dorstart61=dor6.indexOf("6人间");
        int dorend61=dorstart61+"6人间".length();
        SpannableStringBuilder dorstyle6=new SpannableStringBuilder(dor6);
        dorstyle6.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.life_yellow)), dorstart6, dorend6, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        dorstyle6.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.life_yellow)), dorstart61, dorend61, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        dormitory6.setText(dorstyle6);
    }
}
