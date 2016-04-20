package com.carpediem.randy.accountant.main.presenter;

import com.carpediem.randy.accountant.main.contract.DrawerContract;

/**
 * Created by randy on 16-4-20.
 */
public class DrawerPresenter implements DrawerContract.Presenter{

    public DrawerPresenter(DrawerContract.View view) {
        view.setPresenter(this);
    }

    @Override
    public void start() {

    }
}
