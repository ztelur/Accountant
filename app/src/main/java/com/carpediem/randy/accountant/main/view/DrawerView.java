package com.carpediem.randy.accountant.main.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.carpediem.randy.accountant.R;
import com.carpediem.randy.accountant.main.contract.DrawerContract;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by randy on 16-4-18.
 */
public class DrawerView extends FrameLayout implements DrawerContract.View,View.OnClickListener{
    @Bind(R.id.drawer_account_basis)
    TextView mTvAccountBasisi;
    @Bind(R.id.drawer_finance_laws)
    TextView mTvFinanceLaws;
    @Bind(R.id.drawer_computerized_automation)
    TextView mTvAutoComputer;


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

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.drawer_account_basis:
                break;
            case R.id.drawer_computerized_automation:
                break;
            case R.id.drawer_finance_laws:
                break;

        }
    }
}
