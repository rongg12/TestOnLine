package com.testonline.butterknife;

import android.app.Activity;
import android.os.Bundle;

import com.testonline.R;

/**
 * Created by Administrator on 2017/5/18.
 */

public class TestButterKnifeActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_butterknife);
    }

    @Override
    public void onContentChanged() {
        super.onContentChanged();

    }
}
