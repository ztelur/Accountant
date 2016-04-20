package com.carpediem.randy.accountant.main;

import android.os.Bundle;

import com.carpediem.randy.accountant.R;
import com.carpediem.randy.accountant.base.BaseActivity;
import com.carpediem.randy.accountant.main.presenter.DrawerPresenter;
import com.carpediem.randy.accountant.main.view.DrawerView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity {
    @Bind(R.id.left_drawer) DrawerView mDrawerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initPresenter();
    }

    private void initPresenter(){
        new DrawerPresenter(mDrawerView);
    }



}
