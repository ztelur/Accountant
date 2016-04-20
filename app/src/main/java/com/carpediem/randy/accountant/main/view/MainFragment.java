package com.carpediem.randy.accountant.main.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.carpediem.randy.accountant.R;
import com.carpediem.randy.accountant.base.BaseFragment;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by randy on 16-4-20.
 */
public class MainFragment extends BaseFragment{
    @Bind(R.id.main_fragment_fragment_container)
    FrameLayout mFrameLayout;

    @Bind(R.id.main_fragment_tabview)
    MainTabView mTabView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root =  inflater.inflate(R.layout.fragment_main,container,false);
        ButterKnife.bind(this,root);
        return root;
    }


}
