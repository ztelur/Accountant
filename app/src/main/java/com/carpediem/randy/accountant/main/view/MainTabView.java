package com.carpediem.randy.accountant.main.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

import com.carpediem.randy.accountant.R;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by randy on 16-4-20.
 */
public class MainTabView extends LinearLayout implements View.OnClickListener{
    public static final int TAB_INDEX_EXERCISE = 0;
    public static final int TAB_INDEX_PLAN = 1;
    public static final int TAB_INDEX_NEWS = 2;
    @Bind(R.id.tab_view_main_btn)
    LinearLayout mLLMainTab;
    @Bind(R.id.tab_view_plan_btn)
    LinearLayout mLLPlanTab;
    @Bind(R.id.tab_view_news_btn)
    LinearLayout mLLNewsTab;

    private TabViewListener mTabViewListener;
    public MainTabView(Context context) {
        super(context);
        init(context);
    }

    public MainTabView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public MainTabView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context) {
        inflate(context,R.layout.item_main_tab_view,this);
        setBackgroundColor(Color.YELLOW);
        ButterKnife.bind(this);
        registerListener();
    }
    private void registerListener() {
        mLLMainTab.setOnClickListener(this);
        mLLPlanTab.setOnClickListener(this);
        mLLNewsTab.setOnClickListener(this);
    }

    private void notifyListener(int location) {
        if (mTabViewListener != null) {
            mTabViewListener.onTabClick(location);
        }
    }

    public void setTabViewListener(TabViewListener listener) {
        this.mTabViewListener = listener;
    }
    interface TabViewListener {
        void onTabClick(int location);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tab_view_main_btn:
                //TODO: 不是优雅的操作，使用数字
                notifyListener(TAB_INDEX_EXERCISE);
                break;
            case R.id.tab_view_news_btn:
                notifyListener(TAB_INDEX_NEWS);
                break;
            case R.id.tab_view_plan_btn:
                notifyListener(TAB_INDEX_PLAN);
                break;
            default:
                throw new IllegalStateException("MainTabView onClick");
        }
    }
}
