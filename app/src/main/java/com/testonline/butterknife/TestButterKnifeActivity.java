package com.testonline.butterknife;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.testonline.R;

import java.util.List;

import butterknife.BindColor;
import butterknife.BindDimen;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * Created by Administrator on 2017/5/18.
 */

public class TestButterKnifeActivity extends Activity {
    //绑定控件
    @BindView(R.id.tv_butterknife)
    TextView mTvOne;
    @BindView(R.id.btn_butterknife)
    Button mBtnOne;
    //绑定资源
    @BindColor(R.color.colorAccent)
    int color;
    @BindString(R.string.app_name)
    String appName;
    @BindDimen(R.dimen.activity_horizontal_margin)
    float dimen;
    //绑定视图列表
    @BindViews({R.id.tv_butterknife_1,R.id.tv_butterknife_2,R.id.tv_butterknife_3})
    List<TextView> mList;
    private Unbinder unbinder;
    //设置监听
//    @OnClick(R.id.btn_butterknife)
//    public void onClick(View view){
//    }
    @OnClick({R.id.tv_butterknife_1,R.id.tv_butterknife_2,R.id.tv_butterknife_3})
    public void onClick(View v){
        switch (v.getId()){
            case R.id.tv_butterknife_1:
                break;
            case R.id.tv_butterknife_2:
                break;
            case R.id.tv_butterknife_3:
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_butterknife);
        unbinder = ButterKnife.bind(this);
    }

    @Override
    public void onContentChanged() {
        /**
         * alt+enter 查看错误的解决提示信息
         * 代码放大：双击shift-->搜索font-->Mouse 打开
         * ctrl+p：查看方法的参数
         * ctrl+alt+空格：提示
         * ctrl+alt+V 提取变量
         * ctrl+alt+F 提取为成员变量
         */
        /**
         * 对视图列表进行绑定
         *   参数1：列表集合
         *   参数2：action
         *       创建Action，泛型就是视图列表的视图类型
         */
        ButterKnife.apply(mList,mAction);
    }
    //创建Action
    ButterKnife.Action<TextView> mAction=new ButterKnife.Action<TextView>() {
        @Override
        public void apply(@NonNull TextView view, int index) {
            view.setText("视图列表的文本："+index);
        }
    };

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //解绑的操作
        unbinder.unbind();
    }
}
