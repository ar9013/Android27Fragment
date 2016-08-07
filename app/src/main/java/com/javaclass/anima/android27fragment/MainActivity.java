package com.javaclass.anima.android27fragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private FragmentManager fmgr;
    private FragmentTransaction tran;
    private F1 f1;
    private F2 f2;
    private boolean isF1;
    private TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.main_tv);

        fmgr = getFragmentManager();

        f1 = new F1(); f2 = new F2();
        tran = fmgr.beginTransaction();
        tran.add(R.id.container,f1);
        tran.commit();
        isF1 = true;

    }

    public void b0(View v){
        isF1 = !isF1;

        tran = fmgr.beginTransaction();
        if(isF1){
            tran.replace(R.id.container,f1);
        }else{
            tran.replace(R.id.container,f2);
        }
        tran.commit();
    }

    void changeTV(String mesg){
        tv.setText(mesg);
    }

}
