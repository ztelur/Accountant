package com.carpediem.randy.accountant.plan;

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
public class PlanFragment extends BaseFragment implements PlanContract.View {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root =  inflater.inflate(R.layout.fragment_plan,container,false);
        ButterKnife.bind(this,root);
        return root;
    }

    @Override
    public void setPresenter(PlanContract.Presenter presenter) {

    }
}
