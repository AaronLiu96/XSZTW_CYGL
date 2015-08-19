package com.example.sdm.cybk.model.bean.info;

/**
 * Created by sdm on 2015/8/15.
 */
public class SchoolBus_message {
    private static final String Schoolbus[][] = {{"","校车从八十万出发，经过数字图书馆到达新校门站，再由樱花大道到达三教，" +
            "再右转到风雨操场后往上直行到达留学生楼，由留学生楼后依次经过五教、八教、经管学院，之后进入宿舍区，" +
            "校车将依次经过20、23、19、22、18、17、21栋宿舍楼后达到红高粱食堂上方，然后从红高粱向下行驶，到达15、16、24栋宿舍楼，" +
            "然后来到大学城食堂，再依次经过25、26、27、28、29、31、30、32栋宿舍楼，直行到达大西北食堂和乐购便利店，经过11、12栋宿舍楼，" +
            "路过情人坡，向下行驶到10、9、8宿舍楼，最后从信科大厦回到始发站。"}};

    public static String[][] getSchoolbus() {
        return Schoolbus;
    }
}
