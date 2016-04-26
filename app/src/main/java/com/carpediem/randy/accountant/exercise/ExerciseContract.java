package com.carpediem.randy.accountant.exercise;

import com.carpediem.randy.accountant.base.BasePresenter;
import com.carpediem.randy.accountant.base.BaseView;
import com.carpediem.randy.accountant.model.ExerciseSection;

import java.util.List;

/**
 * Created by randy on 16-4-20.
 */
public interface ExerciseContract {
    interface Presenter extends BasePresenter{
        List<ExerciseSection> getExerciseSectionList();
    }
    interface View extends BaseView<Presenter>{

    }
}
