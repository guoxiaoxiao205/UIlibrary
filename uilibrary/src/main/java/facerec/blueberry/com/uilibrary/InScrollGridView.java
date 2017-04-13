package facerec.blueberry.com.uilibrary;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.GridView;

/**
 * Created by wanxin on 16/1/4.
 */
public class InScrollGridView extends GridView {

    public InScrollGridView(Context context) {
        super(context);
    }

    public InScrollGridView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public InScrollGridView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    //不出现滚动条
    @Override
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {

        int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2, MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, expandSpec);
    }
}