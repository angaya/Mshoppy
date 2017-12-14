package com.creativenavigation.shoppymenu.customfonts;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

public class MyRadioButton extends android.support.v7.widget.AppCompatRadioButton {
    public MyRadioButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public MyRadioButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyRadioButton(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/MavenPro-Medium.ttf");
            setTypeface(tf);
        }
    }

}