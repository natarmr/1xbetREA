package org.xplatform.cyber.calendar.impl.presentation.content.calendarperiod;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class CyberCalendarPeriodEventItemView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f46484a;

    /* JADX WARN: Illegal instructions before constructor call */
    public CyberCalendarPeriodEventItemView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Integer numValueOf = motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            this.f46484a = System.currentTimeMillis();
            return true;
        }
        if (numValueOf != null && numValueOf.intValue() == 1) {
            return performClick();
        }
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (System.currentTimeMillis() - this.f46484a < 110) {
            return super.performClick();
        }
        return false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CyberCalendarPeriodEventItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CyberCalendarPeriodEventItemView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
