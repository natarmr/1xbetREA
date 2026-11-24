package org.xplatform.cyber.calendar.impl.presentation.content.month;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class CyberCalendarMonthView extends LinearLayout {
    public static final /* synthetic */ int b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f46489a;

    /* JADX WARN: Illegal instructions before constructor call */
    public CyberCalendarMonthView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        setOrientation(1);
        this.f46489a = new ArrayList();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CyberCalendarMonthView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CyberCalendarMonthView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
