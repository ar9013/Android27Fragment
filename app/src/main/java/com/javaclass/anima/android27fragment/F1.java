package com.javaclass.anima.android27fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by anima on 2016/8/6.
 */
public class F1 extends Fragment {

    private View f1View;
    private Button button1;
    private MainActivity mainActivity;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        f1View = inflater.inflate(R.layout.layout_f1,container,false);

        button1 = (Button) f1View.findViewById(R.id.f1_b1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainActivity = (MainActivity) getActivity();
                mainActivity.changeTV("Welecome to F1.");
            }
        });

        return f1View;
    }


}
