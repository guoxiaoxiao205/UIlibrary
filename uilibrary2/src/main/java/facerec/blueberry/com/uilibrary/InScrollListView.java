package com.caiqr.eagle.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

/**
 * 在scrollView中展开自身长度的listView
 */
public class InScrollListView extends ListView {

    public InScrollListView(Context context) {
        super(context);
    }

    public InScrollListView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.setFocusable(false);
        this.setFocusableInTouchMode(false);
    }

    public InScrollListView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2,
                MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, expandSpec);
    }

}