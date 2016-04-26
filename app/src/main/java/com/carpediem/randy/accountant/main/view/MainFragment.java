package com.carpediem.randy.accountant.main.view;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.carpediem.randy.accountant.R;
import com.carpediem.randy.accountant.base.BaseFragment;
import com.carpediem.randy.accountant.exercise.view.ExerciseFragment;
import com.carpediem.randy.accountant.news.NewsFragment;
import com.carpediem.randy.accountant.plan.PlanFragment;

import java.util.concurrent.locks.ReentrantLock;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by randy on 16-4-20.
 */
public class MainFragment extends BaseFragment implements MainTabView.TabViewListener{

    @Bind(R.id.main_fragment_tabview)
    MainTabView mTabView;

    private int mCurrentIndex;
    private ReentrantLock mFragmentLock = new ReentrantLock();
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root =  inflater.inflate(R.layout.fragment_main,container,false);
        ButterKnife.bind(this,root);
        mTabView.setTabViewListener(this);
        initDefaultFragment(new ExerciseFragment());
        return root;
    }

    @Override
    public void onTabClick(int location) {
        if (location < 0 || location > 3) {
            throw new RuntimeException("MainFragment onClick location <0 or > 3");
        }
        switchFragment(location);
    }

    private void switchFragment(final int index) {
        //TODO:还是不太对，由于MainTab和MainFagment都各自维持一个状态导致，应该双方只维持一个状态
        //　所以，MainTabVIew的状态应该是有MainFragment设置的
        if (!mFragmentLock.tryLock()) {
            return;
        }
        String fragTag = getFragmentTag(index);
        BaseFragment fragment ,currFragment;

        FragmentManager manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();

        if (mCurrentIndex != index) {
            currFragment = (BaseFragment) manager.findFragmentByTag(getFragmentTag(mCurrentIndex));
            if (currFragment == null) {
                //上一个fragment还没有加载出来
                mFragmentLock.unlock();
            }
            transaction.hide(currFragment);
        }
        fragment = (BaseFragment) manager.findFragmentByTag(fragTag);
        if (fragment == null) {
            switch (index) {
                case MainTabView.TAB_INDEX_EXERCISE:
                    ExerciseFragment mainFragment = new ExerciseFragment();
                    fragment = mainFragment;
                    break;
                case MainTabView.TAB_INDEX_PLAN:
                    PlanFragment planFragment = new PlanFragment();
                    fragment = planFragment;
                    break;
                case MainTabView.TAB_INDEX_NEWS:
                    NewsFragment newsFragment = new NewsFragment();
                    fragment = newsFragment;
                    break;
            }
            transaction.add(R.id.main_fragment_fragment_container,fragment,fragTag);
        } else {
            transaction.show(fragment);
        }
        transaction.commitAllowingStateLoss();
        mCurrentIndex = index;
        mFragmentLock.unlock();

    }

    private void initDefaultFragment(BaseFragment fragment) {
        FragmentManager manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        String tag = getFragmentTag(MainTabView.TAB_INDEX_EXERCISE);
        transaction.add(R.id.main_fragment_fragment_container,fragment,tag);
        transaction.commit();
        mCurrentIndex = MainTabView.TAB_INDEX_EXERCISE;
    }
    private String getFragmentTag(int suffix) {
        return "fragment"+suffix;
    }

}
