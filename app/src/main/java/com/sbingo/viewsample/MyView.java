package com.sbingo.viewsample;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Author: Sbingo
 * Date:   2017/6/28
 */

public class MyView extends android.support.v7.widget.AppCompatTextView {

    Logger myLogger = Logger.getLogger("Sbingo MyView");

    public MyView(Context context) {
        super(context);
    }

    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        myLogger.log(Level.INFO, "dispatchTouchEvent");
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                getParent().requestDisallowInterceptTouchEvent(true);
                break;
            default:
        }
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        myLogger.log(Level.INFO, "onTouchEvent：" + event.getAction());
        return true;
    }

}
