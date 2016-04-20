package com.carpediem.randy.accountant.main.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

import com.carpediem.randy.accountant.R;
import com.carpediem.randy.accountant.main.contract.DrawerContract;

import butterknife.ButterKnife;

/**
 * Created by randy on 16-4-18.
 */
public class DrawerView extends FrameLayout implements DrawerContract.View{
    private DrawerContract.Presenter mPresenter;
    public DrawerView(Context context) {
        super(context);
        init(context);
    }

    public DrawerView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public DrawerView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context) {
        inflate(context, R.layout.item_left_drawer,this);
        ButterKnife.bind(this);
    }


    @Override
    public void setPresenter(DrawerContract.Presenter presenter) {
        if (presenter != null) {
            mPresenter = presenter;
        }
    }
}
