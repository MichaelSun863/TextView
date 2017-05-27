package com.example.hasee.runtextview.utils;

/**
 * Created by hasee on 2017/5/27.
 */

public class StringUtils {

    public static  String addComma(String str){
        str = new StringBuilder(str).reverse().toString();
        if(str.equals("0")){
            return str;
        }
        String str2 = "";
        for(int i = 0;i < str.length(); i++){
            if(i * 3 + 3 > str.length()){
                str2 += str.substring(i * 3,str.length());
                break;
            }
            str2 += str.substring(i * 3, i * 3 + 3) + ",";
        }
        if(str2.endsWith(",")){
            str2 = str2.substring(0,str2.length() - 1);
        }

        //最后再将顺序反转过来
        String temp = new StringBuilder(str2).reverse().toString();
        //将最后的，去掉
        return temp.substring(0,temp.lastIndexOf(","))+temp.substring(temp.lastIndexOf(",") + 1,temp.length());

    }
}
