package com.carpediem.randy.accountant.main.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by randy on 16-4-20.
 */
public class MainTabView extends View {
    public MainTabView(Context context) {
        super(context);
    }

    public MainTabView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MainTabView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    interface TabViewListener {
        void onClick();
    }
}
