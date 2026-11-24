package org.xplatform.cyber.calendar.impl.presentation.content.day;

import a.g5g;
import a.h5g;
import a.jw5;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import org.xplatform.uikit.components.views.OptimizedScrollRecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public final class CyberCalendarDayFlingRecyclerView extends OptimizedScrollRecyclerView {
    public final GestureDetector o2;
    public h5g p2;

    /* JADX WARN: Illegal instructions before constructor call */
    public CyberCalendarDayFlingRecyclerView(Context context, AttributeSet attributeSet, int i) {
        byte b = 2;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        this.o2 = new GestureDetector(context, new g5g(this, (byte) 0));
        setOnTouchListener(new jw5(this, b));
    }

    public final void setOnDayEventListener(h5g h5gVar) {
        h5gVar.getClass();
        this.p2 = h5gVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CyberCalendarDayFlingRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CyberCalendarDayFlingRecyclerView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
