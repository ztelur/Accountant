package com.carpediem.randy.accountant.exercise;

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
 * 习题首页，显示习题列表
 */
public class ExerciseFragment extends BaseFragment implements ExerciseContract.View{


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root =  inflater.inflate(R.layout.fragment_exercise,container,false);
        ButterKnife.bind(this,root);
        return root;
    }

    @Override
    public void setPresenter(ExerciseContract.Presenter presenter) {

    }
}
