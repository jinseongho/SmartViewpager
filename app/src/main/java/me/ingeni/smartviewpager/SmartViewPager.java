package me.ingeni.smartviewpager;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

/**
 * Created by jinseongho on 2016. 7. 18..
 */

public class SmartViewPager extends LinearLayout {

    private ViewPager viewPager;
    private LinearLayout indicatorlayout;

    public SmartViewPager(Context context) {
        super(context);
        initView();
    }

    public SmartViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView();
        getAttrs(attrs);
    }

    public SmartViewPager(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs);
        initView();
        getAttrs(attrs, defStyle);
    }

    public void initView() {
        LayoutInflater mInflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = mInflater.inflate(R.layout.layout_smart_viewpager, this, false);
        viewPager = (ViewPager) v.findViewById(R.id.smart_view_pager);
        indicatorlayout = (LinearLayout) v.findViewById(R.id.indicator_layout);
        addView(v);
    }

    private void getAttrs(AttributeSet attrs) {
        TypedArray typedArray = getContext().obtainStyledAttributes(attrs, R.styleable.SmartViewPager);
        setTypeArray(typedArray);
    }


    private void getAttrs(AttributeSet attrs, int defStyle) {
        TypedArray typedArray = getContext().obtainStyledAttributes(attrs, R.styleable.SmartViewPager, defStyle, 0);
        setTypeArray(typedArray);
    }

    private void setTypeArray(TypedArray typedArray) {

        int bg_resID = typedArray.getResourceId(R.styleable.SmartViewPager_bg, Color.TRANSPARENT);
        indicatorlayout.setBackgroundResource(bg_resID);
        typedArray.recycle();
    }

}
