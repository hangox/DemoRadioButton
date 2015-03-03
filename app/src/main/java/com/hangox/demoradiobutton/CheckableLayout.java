package com.hangox.demoradiobutton;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.RelativeLayout;

/**
 * Created With Android Studio
 * User 47
 * Date 2015/3/3
 * Time 19:08
 */
public class CheckableLayout extends RelativeLayout implements Checkable{
    private boolean mChecked;
    private Checkable mCheckableView;
    public CheckableLayout(Context context) {
        super(context);
    }

    public CheckableLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CheckableLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void setChecked(boolean checked) {
        if(mCheckableView ==  null) initCheckableView();
        mChecked = checked;
        mCheckableView.setChecked(mChecked);
    }

    private void initCheckableView() {
        mCheckableView = (Checkable) findViewWithTag("checkableview");
    }

    @Override
    public boolean isChecked() {
        return mChecked;
    }

    @Override
    public void toggle() {
        setChecked(!mChecked);
    }
}
