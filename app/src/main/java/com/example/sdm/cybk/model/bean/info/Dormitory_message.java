package com.example.sdm.cybk.model.bean.info;

/**
 * Created by sdm on 2015/8/15.
 */
public class Dormitory_message {
    private static final String dormitoryMessage[][] = {{"宿舍介绍及其周边建筑：", "\t\t\t\t今年大一新生根据专业班级按照姓氏分配在宿舍楼1、5、6、8-12、15-20、22-30、32栋。床铺的长宽大致为80cm*200cm。\n" +
            "\t\t\t\t其中1、5、6是学校现存最老的寝室。住宿条件比较差。其中1栋是女生宿舍，5、6栋是男生宿舍。整体情况是每层楼设有公用的卫生间、洗澡间，这也就意味着每个寝室都没有独立卫生间，没有阳台。" +
            "寝室一般都是4人间（每个寝室有2个高低床，一张大书桌、4个凳子和两个供大家放东西的柜台）。虽然室内环境简陋，但是位置十分优越。处于校园中心，上课、生活都极其便利。\n" +
            "自行到校路线：8-12栋位于学校情人坡旁边，是学校标准的4人间，上床下桌，配有阳台，独立卫生间。楼栋周边环境一流，食堂与超市一应俱全，为学习生活提供不少的便利。\n" +
            "\t\t\t\t15-20栋分布在太极运动场的南边与东边。周边有学校的兴业院食堂及众多的超市、商铺，校车从这里穿过。寝室内部均设有独立卫生间，并在一些楼层设有洗衣机供大家使用，根据每栋宿舍不同，" +
            "楼层不同分为4人间、6人间两种。4人间基本情况与8-12栋一样，而6人间则是上下铺与上床下桌的混搭。\n" +
            "\t\t\t\t22-24屹立于悠悠重邮高处，周边风景秀丽，无论冬夏，绿色永存，每至冬季，一旁还有腊梅香气飘来。楼栋门前不时还会有校车等路过，其周边有“千喜鹤”、“好食基”、“红高粱”等食堂，" +
            "还有重邮阳光超市、叮当超市、华生园等购物场所，交通便利，可以尽情满足同学们的平日生活需求。此外，楼栋内部住宿条件优越，环境较好，22栋全部为4人间寝室,23及24全部为6人间寝室，且有独立的阳台、卫浴。\n" +
            "\t\t\t\t25-30在学校的东南方向，周边分布有“千喜鹤”、“好食基”食堂。宿舍基本为6人间基本情况与22-24相同且有独立的阳台、卫浴，床铺是上下铺与上床下桌的混搭。\n"}};

    public static String[][] getDormitoryMessage() {
        return dormitoryMessage;
    }
}