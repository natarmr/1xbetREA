package org.xplatform.uikit_sport.eventcard.container.results;

import a.ihu0;
import a.xx5;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import org.xbet.client1.R;
import org.xplatform.uikit_sport.eventcard.bottom.EventCardBottomMarketMultiline;

/* JADX INFO: loaded from: classes6.dex */
public final class ResultsHistoryEventCard extends xx5 {
    public final int i;
    public final int j;
    public final int k;

    /* JADX WARN: Illegal instructions before constructor call */
    public ResultsHistoryEventCard(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, R.attr.eventCardResultsHistoryStyle);
        this.i = getResources().getDimensionPixelSize(R.dimen.space_8);
        this.j = getResources().getDimensionPixelSize(R.dimen.space_12);
        this.k = getResources().getDimensionPixelSize(R.dimen.space_16);
    }

    private final int getEventCardBottomHeight() {
        View eventCardBottom;
        if (getEventCardBottom() == null || ((eventCardBottom = getEventCardBottom()) != null && eventCardBottom.getVisibility() == 8)) {
            return 0;
        }
        View eventCardBottom2 = getEventCardBottom();
        int measuredHeight = eventCardBottom2 != null ? eventCardBottom2.getMeasuredHeight() : 0;
        return measuredHeight > 0 ? measuredHeight : this.k;
    }

    private final int getEventCardInfoHeight() {
        View eventCardInfo = getEventCardInfo();
        int measuredHeight = eventCardInfo != null ? eventCardInfo.getMeasuredHeight() : 0;
        View eventCardBottom = getEventCardBottom();
        int measuredHeight2 = eventCardBottom != null ? eventCardBottom.getMeasuredHeight() : 0;
        if (measuredHeight > 0) {
            return measuredHeight;
        }
        if (measuredHeight2 > 0) {
            return 0;
        }
        return this.j;
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
        int eventCardInfoHeight = getEventCardInfoHeight();
        View eventCardMiddle = getEventCardMiddle();
        int measuredHeight = eventCardMiddle != null ? eventCardMiddle.getMeasuredHeight() : 0;
        int measuredHeight2 = ((getMeasuredHeight() - eventCardTopHeight) - eventCardInfoHeight) - eventCardBottomHeight;
        int measuredHeight3 = getMeasuredHeight() - eventCardBottomHeight;
        int i5 = measuredHeight3 - eventCardInfoHeight;
        int i6 = ((measuredHeight2 / 2) - (measuredHeight / 2)) + eventCardTopHeight;
        int i7 = measuredHeight + i6;
        View eventCardTop = getEventCardTop();
        if (eventCardTop != null) {
            eventCardTop.layout(0, 0, getMeasuredWidth(), eventCardTopHeight);
        }
        View eventCardMiddle2 = getEventCardMiddle();
        if (eventCardMiddle2 != null) {
            eventCardMiddle2.layout(0, i6, getMeasuredWidth(), i7);
        }
        View eventCardInfo = getEventCardInfo();
        if (eventCardInfo != null) {
            eventCardInfo.layout(0, i5, getMeasuredWidth(), measuredHeight3);
        }
        View eventCardBottom = getEventCardBottom();
        if (eventCardBottom != null) {
            eventCardBottom.layout(0, measuredHeight3, getMeasuredWidth(), getMeasuredHeight());
        }
    }

    @Override // a.xx5, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        int i3 = 0;
        for (View view : new ihu0(this)) {
            if (view.getVisibility() == 8 && (view instanceof EventCardBottomMarketMultiline)) {
                measuredHeight = this.i;
            } else if (view.getVisibility() == 8) {
                measuredHeight = 0;
            } else {
                measureChild(view, i, i2);
                measuredHeight = view.getMeasuredHeight();
            }
            i3 += measuredHeight;
        }
        setMeasuredDimension(View.resolveSize(getMeasuredWidth(), i), View.resolveSize(Math.max(i3, getSuggestedMinimumHeight()), i2));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ResultsHistoryEventCard(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ResultsHistoryEventCard(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
