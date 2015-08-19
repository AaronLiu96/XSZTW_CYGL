package com.example.sdm.cybk.model.bean;

import com.example.sdm.cybk.R;

/**
 * Created by sdm on 2015/8/19.
 */
public class GroupImage {

    private static final String title[] = {"保卫处武装部","就业辅导中心","图书馆（老）","图书馆（新）","物业管理中心","校医院",
            "信息与网络管理中心","信息与网络管理中心2","学生工作部（处）","中心食堂","重邮共青团"};
    private static final int image[] = {R.mipmap.defend,R.mipmap.profession,R.mipmap.library,R.mipmap.library_new,R.mipmap.property,
            R.mipmap.hospital,R.mipmap.message_net,R.mipmap.message_net2,R.mipmap.stuwork,R.mipmap.centermess,R.mipmap.cyteam};

    public static String[] getTitle() {
        return title;
    }

    public static int[] getImage() {
        return image;
    }
}
