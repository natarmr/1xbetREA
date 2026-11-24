package org.xplatform.cyber.calendar.impl.presentation.content;

import a.knm0;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;

/* JADX INFO: loaded from: classes2.dex */
public final class CyberCalendarSwipeScrollView extends ScrollView {
    /* JADX WARN: Illegal instructions before constructor call */
    public CyberCalendarSwipeScrollView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
        knm0.i(this, false);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CyberCalendarSwipeScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CyberCalendarSwipeScrollView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
