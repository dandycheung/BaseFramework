package com.kongzue.baseframeworkdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.kongzue.baseframework.BaseFragment;

public class FragmentDemo extends BaseFragment {

    private TextView info;
    private Button btnHide;

    @Override
    public int getLayout() {
        //此处return你的布局id
        return R.layout.fragment_demo;
    }

    @Override
    public void initViews() {
        //此处加载组件
        info = findViewById(R.id.info);
        btnHide = findViewById(R.id.btn_hide);
    }

    @Override
    public void initDatas() {
        //此处编写初始化代码

    }

    @Override
    public void setEvents() {
        //此处为组件绑定事件
        btnHide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivity.hideFragment();
            }
        });
    }

    private MainActivity mainActivity;

    public void setMainActivity(MainActivity mainActivity){
        this.mainActivity = mainActivity;
    }
}
