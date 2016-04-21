package com.carpediem.randy.accountant.base;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.annotation.IdRes;

/**
 * Created by randy on 16-4-20.
 */
public class BaseActivity extends Activity {
    public void addFragment(BaseFragment fragment, @IdRes int id) {
        FragmentManager manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(id,fragment);
        transaction.commitAllowingStateLoss();
    }
}
