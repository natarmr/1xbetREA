package org.xplatform.themesettings.impl.presentation.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class DisallowInterceptView extends LinearLayout {
    public DisallowInterceptView(Context context) {
        super(context);
        requestDisallowInterceptTouchEvent(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        getParent().requestDisallowInterceptTouchEvent(true);
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0015  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        int action = motionEvent.getAction();
        if (action == 1) {
            requestDisallowInterceptTouchEvent(false);
        } else if (action == 2) {
            requestDisallowInterceptTouchEvent(true);
        } else if (action == 3) {
            requestDisallowInterceptTouchEvent(false);
        }
        return super.onTouchEvent(motionEvent);
    }

    public DisallowInterceptView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        requestDisallowInterceptTouchEvent(true);
    }
}
