package com.example.hasee.runtextview.Activity;

import android.app.ActivityManager;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;

import com.example.hasee.runtextview.R;
import com.example.hasee.runtextview.View.RunningTextView;

/**
 * Created by hasee on 2017/5/26.
 */

public class RunningTextViewActivity extends AppCompatActivity {

    private SwipeRefreshLayout srfLayout;
    private RunningTextView tvMoney;
    private RunningTextView tvNum;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_running_textview);

        initView();
        initListener();

        tvMoney.setContent("1220.00");
        tvNum.setContent("200");
    }

    private void initView(){
        srfLayout = (SwipeRefreshLayout)findViewById(R.id.textview);
        tvMoney = (RunningTextView)findViewById(R.id.tv_money);
        tvNum = (RunningTextView)findViewById(R.id.tv_num);

        srfLayout.setColorSchemeColors(Color.parseColor("#ff7300"));
    }

    private void initListener(){
        srfLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                tvMoney.setContent("1454.00");
                tvNum.setContent("300");
                srfLayout.setRefreshing(false);
            }
        });
    }
}
