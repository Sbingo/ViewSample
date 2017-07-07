package com.sbingo.viewsample;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Author: Sbingo
 * Date:   2017/6/28
 */

public class ViewGroupA extends FrameLayout{

    Logger myLogger = Logger.getLogger("Sbingo ViewGroupA");

    public ViewGroupA(Context context) {
        super(context);
    }

    public ViewGroupA(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ViewGroupA(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        myLogger.log(Level.INFO, "dispatchTouchEvent");
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public void requestDisallowInterceptTouchEvent(boolean disallowIntercept) {
        myLogger.log(Level.INFO, "requestDisallowInterceptTouchEvent");
        super.requestDisallowInterceptTouchEvent(disallowIntercept);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        myLogger.log(Level.INFO, "onInterceptTouchEvent");
        return super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        myLogger.log(Level.INFO, "onTouchEvent");
        return super.onTouchEvent(event);
    }
}
