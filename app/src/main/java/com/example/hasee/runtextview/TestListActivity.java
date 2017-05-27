package com.example.hasee.runtextview;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.hasee.runtextview.Activity.RunningTextViewActivity;
import com.example.hasee.runtextview.bean.DemoBean;

/**
 * Created by hasee on 2017/5/26.
 */

public class TestListActivity extends ListActivity {


    private DemoBean[] mData = {
            new DemoBean("RunTextViewDemo", RunningTextViewActivity.class)
    };

   @Override
   protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

       ArrayAdapter<DemoBean> adapter = new ArrayAdapter<DemoBean>(this,android.R.layout.simple_list_item_1,mData);
       setListAdapter(adapter);

        }

        @Override
    protected void onListItemClick(ListView l, View v,int position,long id){
            //为条目设置点击事件
            DemoBean demoBean = mData[position];
            startActivity(new Intent(this,demoBean.aClass));
        }
        }
