package com.javaclass.anima.android27fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by anima on 2016/8/6.
 */
public class F2 extends Fragment {

    private View f2View;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        f2View = inflater.inflate(R.layout.layout_f2,container,false);


        return f2View;

    }
}
