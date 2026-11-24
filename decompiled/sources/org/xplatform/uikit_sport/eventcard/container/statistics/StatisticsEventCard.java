package org.xplatform.uikit_sport.eventcard.container.statistics;

import a.jmu0;
import a.xx5;
import a.zao;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import org.xbet.client1.R;
import org.xplatform.uikit_sport.eventcard.middle.EventCardMiddleCricket;
import org.xplatform.uikit_sport.eventcard.middle.EventCardMiddleFighting;

/* JADX INFO: loaded from: classes6.dex */
public final class StatisticsEventCard extends xx5 {
    public final int i;
    public final int j;
    public final zao k;
    public final zao l;

    /* JADX WARN: Illegal instructions before constructor call */
    public StatisticsEventCard(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, R.attr.eventCardStatisticsStyle);
        this.i = getResources().getDimensionPixelSize(R.dimen.size_4);
        this.j = getResources().getDimensionPixelSize(R.dimen.space_8);
        this.k = a();
        this.l = a();
        setClipToPadding(false);
        setClipToOutline(true);
    }

    private final boolean getDoubleIndication() {
        View eventCardMiddle = getEventCardMiddle();
        if (eventCardMiddle == null) {
            return false;
        }
        return (eventCardMiddle instanceof EventCardMiddleCricket) || (eventCardMiddle instanceof EventCardMiddleFighting);
    }

    private final int getEventCardTopHeight() {
        View eventCardTop = getEventCardTop();
        int measuredHeight = eventCardTop != null ? eventCardTop.getMeasuredHeight() : 0;
        return measuredHeight > 0 ? measuredHeight : this.j;
    }

    public final zao a() {
        Context context = getContext();
        context.getClass();
        zao zaoVar = new zao(context);
        if (zaoVar.getId() == -1) {
            zaoVar.setId(jmu0.d());
        }
        addView(zaoVar, new FrameLayout.LayoutParams(this.i, -1));
        return zaoVar;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        if (getDoubleIndication()) {
            this.k.u(true);
            this.l.u(false);
        }
    }

    @Override // a.xx5, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int eventCardTopHeight = getEventCardTopHeight();
        View eventCardInfo = getEventCardInfo();
        int measuredHeight = eventCardInfo != null ? eventCardInfo.getMeasuredHeight() : 0;
        View eventCardMiddle = getEventCardMiddle();
        int measuredHeight2 = eventCardMiddle != null ? eventCardMiddle.getMeasuredHeight() : 0;
        int measuredHeight3 = (getMeasuredHeight() - eventCardTopHeight) - measuredHeight;
        int i5 = this.j;
        int measuredHeight4 = getMeasuredHeight() - i5;
        int i6 = measuredHeight4 - measuredHeight;
        int i7 = (((measuredHeight3 - i5) / 2) - (measuredHeight2 / 2)) + eventCardTopHeight;
        int i8 = measuredHeight2 + i7;
        View eventCardTop = getEventCardTop();
        if (eventCardTop != null) {
            eventCardTop.layout(0, 0, getMeasuredWidth(), eventCardTopHeight);
        }
        View eventCardMiddle2 = getEventCardMiddle();
        if (eventCardMiddle2 != null) {
            eventCardMiddle2.layout(0, i7, getMeasuredWidth(), i8);
        }
        View eventCardInfo2 = getEventCardInfo();
        if (eventCardInfo2 != null) {
            eventCardInfo2.layout(0, i6, getMeasuredWidth(), measuredHeight4);
        }
        int measuredWidth = getMeasuredWidth();
        zao zaoVar = this.l;
        int measuredWidth2 = measuredWidth - zaoVar.getMeasuredWidth();
        boolean doubleIndication = getDoubleIndication();
        zao zaoVar2 = this.k;
        if (doubleIndication) {
            zaoVar2.layout(0, i7, zaoVar2.getMeasuredWidth(), i8);
            zaoVar.layout(measuredWidth2, i7, getMeasuredWidth(), i8);
        } else {
            zaoVar2.layout(0, 0, zaoVar2.getMeasuredWidth(), getMeasuredHeight());
            zaoVar.layout(measuredWidth2, 0, getMeasuredWidth(), getMeasuredHeight());
        }
    }

    @Override // a.xx5, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        View eventCardTop = getEventCardTop();
        int i3 = this.j;
        if (eventCardTop == null || eventCardTop.getVisibility() != 0) {
            measuredHeight = i3;
        } else {
            measureChild(eventCardTop, i, i2);
            measuredHeight = eventCardTop.getMeasuredHeight();
        }
        View eventCardMiddle = getEventCardMiddle();
        if (eventCardMiddle != null && eventCardMiddle.getVisibility() != 8) {
            measureChild(eventCardMiddle, i, i2);
            measuredHeight += eventCardMiddle.getMeasuredHeight();
        }
        View eventCardInfo = getEventCardInfo();
        if (eventCardInfo != null && eventCardInfo.getVisibility() != 8) {
            measureChild(eventCardInfo, i, i2);
            measuredHeight += eventCardInfo.getMeasuredHeight();
        }
        int iMax = Math.max(measuredHeight + i3, getSuggestedMinimumHeight());
        setMeasuredDimension(View.resolveSize(getMeasuredWidth(), i), View.resolveSize(iMax, i2));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.i, 1073741824);
        boolean doubleIndication = getDoubleIndication();
        zao zaoVar = this.l;
        zao zaoVar2 = this.k;
        if (!doubleIndication) {
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
            measureChild(zaoVar2, iMakeMeasureSpec, iMakeMeasureSpec2);
            measureChild(zaoVar, iMakeMeasureSpec, iMakeMeasureSpec2);
        } else {
            View eventCardMiddle2 = getEventCardMiddle();
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(eventCardMiddle2 != null ? eventCardMiddle2.getMeasuredHeight() : 0, 1073741824);
            measureChild(zaoVar2, iMakeMeasureSpec, iMakeMeasureSpec3);
            measureChild(zaoVar, iMakeMeasureSpec, iMakeMeasureSpec3);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StatisticsEventCard(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StatisticsEventCard(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
