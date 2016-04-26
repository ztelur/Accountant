package com.carpediem.randy.accountant.exercise.presenter;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import com.carpediem.randy.accountant.R;

import butterknife.ButterKnife;

/**
 * Created by randy on 16-4-26.
 */
public class ExerciseHeader extends LinearLayout{
    public ExerciseHeader(Context context) {
        super(context);
        init(context);
    }

    public ExerciseHeader(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public ExerciseHeader(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }
    private void init(Context context) {
        inflate(context, R.layout.item_exercise_header,this);
        ButterKnife.bind(this);
    }
}
