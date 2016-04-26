package com.carpediem.randy.accountant.exercise.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.carpediem.randy.accountant.R;
import com.carpediem.randy.accountant.base.BaseFragment;
import com.carpediem.randy.accountant.exercise.ExerciseContract;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by randy on 16-4-20.
 * 习题首页，显示习题列表
 */
public class ExerciseFragment extends BaseFragment implements ExerciseContract.View {
    @Bind(R.id.exercise_recycle_view)
    RecyclerView mRvExerciseList;

    private ExerciseContract.Presenter mPresenter;
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root =  inflater.inflate(R.layout.fragment_exercise,container,false);
        ButterKnife.bind(this,root);
        return root;
    }




    @Override
    public void setPresenter(ExerciseContract.Presenter presenter) {
        if (presenter == null) {
            throw new RuntimeException("ExerciseFragment set presenter wrong");
        }
        mPresenter = presenter;
    }

    static class ExerciseListAdapter extends RecyclerView.Adapter{



        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return 0;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return null;
        }
    }
    static class ExerciseListViewHolder extends RecyclerView.ViewHolder{
        public ExerciseListViewHolder(View itemView) {
            super(itemView);
        }

        @Override
        public String toString() {
            return super.toString();
        }
    }
}
