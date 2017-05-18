package com.testonline.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.testonline.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

public class MainActivity extends Activity {
    //控件的绑定
    @BindView(R.id.tv_main)
    TextView mTv;
    @BindView(R.id.btn_main)
    Button mBtn;
    @BindView(R.id.tv_main)
    TextView tvMain;
    @BindView(R.id.btn_main)
    Button btnMain;
    Unbinder mUnBinder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    //绑定监听
    @OnClick(R.id.btn_main)
    public void onClick(View v) {
        mTv.setText("");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //解绑  绑定的重置
        mUnBinder.unbind();

    }

    @OnClick(R.id.btn_main)
    public void onViewClicked() {
    }
}
