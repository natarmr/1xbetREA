package org.xplatform.uikit_sport.eventcard.container;

import a.xx5;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class SyntheticsEventCard extends xx5 {
    public final int i;
    public final int j;

    /* JADX WARN: Illegal instructions before constructor call */
    public SyntheticsEventCard(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, R.attr.eventCardSyntheticsStyle);
        this.i = getResources().getDimensionPixelSize(R.dimen.space_8);
        this.j = getResources().getDimensionPixelSize(R.dimen.space_16);
    }

    private final int getEventCardBottomHeight() {
        View eventCardBottom = getEventCardBottom();
        int measuredHeight = eventCardBottom != null ? eventCardBottom.getMeasuredHeight() : 0;
        return measuredHeight > 0 ? measuredHeight : this.j;
    }

    private final int getEventCardTopHeight() {
        View eventCardTop = getEventCardTop();
        int measuredHeight = eventCardTop != null ? eventCardTop.getMeasuredHeight() : 0;
        return measuredHeight > 0 ? measuredHeight : this.i;
    }

    @Override // a.xx5, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int eventCardTopHeight = getEventCardTopHeight();
        int eventCardBottomHeight = getEventCardBottomHeight();
        View eventCardMiddle = getEventCardMiddle();
        int measuredHeight = eventCardMiddle != null ? eventCardMiddle.getMeasuredHeight() : 0;
        int measuredHeight2 = (getMeasuredHeight() - eventCardTopHeight) - eventCardBottomHeight;
        int measuredHeight3 = getMeasuredHeight() - eventCardBottomHeight;
        int i5 = ((measuredHeight2 / 2) - (measuredHeight / 2)) + eventCardTopHeight;
        int i6 = measuredHeight + i5;
        View eventCardTop = getEventCardTop();
        if (eventCardTop != null) {
            eventCardTop.layout(0, 0, getMeasuredWidth(), eventCardTopHeight);
        }
        View eventCardMiddle2 = getEventCardMiddle();
        if (eventCardMiddle2 != null) {
            eventCardMiddle2.layout(0, i5, getMeasuredWidth(), i6);
        }
        View eventCardBottom = getEventCardBottom();
        if (eventCardBottom != null) {
            eventCardBottom.layout(0, measuredHeight3, getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SyntheticsEventCard(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SyntheticsEventCard(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
