package com.example.sdm.cybk.model.bean.info;

/**
 * Created by sdm on 2015/8/15.
 */
public class NewStudent_hometownMate {

    private static final String theNewStudent = "新生群";
    private static final String theHometownMate = "老乡群";

    private static final String newStudent[][] = {
            {"新生总群","303821503"},{"通信与信息工程学院","131831930"},{"光电工程学院","118702707"},{"经济管理学院","459689369"}
            ,{"软件工程学院","457898785"},{"计算机科学与技术学院","462513975"},{"自动化学院","453671920"},{"传媒艺术学院","415452505"}
            ,{"法学院","157289160"},{"理学院","246216079"},{"外国语学院","162910856"},{"先进制造工程学院","457395819"},
            {"国际学院","464307703"},{"体育学院","456870764"}};

    private static final String hometownMate[][] ={
            {"山西","119738941"},{"黑龙江","316348915"},{"安徽","463237050"}
            ,{"陕西","193388613"},{"四川","142604890\t\t249923354\t\t312946618"},
            {"浙江","247010642\t\t335964763\t\t335964763"},{"贵州","452210260"},
            {"山东","335450652\t\t384043802"},{"广东","113179139"},
            {"河南","310222276\t\t251311309"},{"宁夏","319432002"},
            {"湖南","204491110"},{"云南","472124132"},{"天津","8690505"},
            {"广西","466937402\t\t9651531"},{"湖北","33861584"},
            {"北京","143833720"},{"新疆","248052400"},{"河北","464458638"},
            {"福建","456665777"},{"辽宁","134489031"},{"吉林","118060379"},
            {"海南","329752458"},{"青海","282597612"},
            {"甘肃","304901053\t\t155724412"},{"江苏","123736116"},{"东北","434151318"}};

    public static String getTheNewStudent() {
        return theNewStudent;
    }


    public static String getTheHometownMate() {
        return theHometownMate;
    }

    public static String[][] getNewStudent() {
        return newStudent;
    }

    public static String[][] getHometownMate() {
        return hometownMate;
    }
}
