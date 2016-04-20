package com.carpediem.randy.accountant.news;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.carpediem.randy.accountant.R;
import com.carpediem.randy.accountant.base.BaseFragment;

import butterknife.ButterKnife;

/**
 * Created by randy on 16-4-20.
 */
public class NewsFragment extends BaseFragment implements NewsContract.View{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root =  inflater.inflate(R.layout.fragment_news,container,false);
        ButterKnife.bind(this,root);
        return root;
    }

    @Override
    public void setPresenter(NewsContract.Presenter presenter) {

    }
}
