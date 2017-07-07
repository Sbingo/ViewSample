package com.sbingo.viewsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    ViewGroupA viewGroupA;
    ViewGroupB viewGroupB;
    MyView myView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewGroupA = (ViewGroupA) findViewById(R.id.vga);
        viewGroupB = (ViewGroupB) findViewById(R.id.vgb);
        myView = (MyView) findViewById(R.id.my_view);

//        viewGroupB.requestDisallowInterceptTouchEvent(true);
        viewGroupB.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Log.i("Sbingo ViewGroupB", "onTouch");
                return false;
            }
        });

//        viewGroupB.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.i("Sbingo ViewGroupB", "onClick");
//            }
//        });

        myView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Log.i("Sbingo MyView", "onTouch");
                return false;
            }
        });

//        myView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.i("Sbingo MyView", "onClick");
//            }
//        });
    }
}
