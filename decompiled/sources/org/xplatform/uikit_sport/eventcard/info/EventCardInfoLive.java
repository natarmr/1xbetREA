package org.xplatform.uikit_sport.eventcard.info;

import a.abo;
import a.cqd0;
import a.hny;
import a.ktt0;
import a.l7n;
import a.vd7;
import a.wej;
import a.yum0;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.xbet.client1.R;
import org.xplatform.uikit.components.timer.DsTimer;

/* JADX INFO: loaded from: classes6.dex */
public final class EventCardInfoLive extends LinearLayout implements abo {
    public static final /* synthetic */ int b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vd7 f47290a;

    /* JADX WARN: Illegal instructions before constructor call */
    public EventCardInfoLive(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, R.attr.eventCardInfoLiveStyle);
        LayoutInflater.from(context).inflate(R.layout.event_card_live_view, this);
        int i2 = R.id.info;
        TextView textView = (TextView) yum0.f(this, R.id.info);
        if (textView != null) {
            i2 = R.id.timer;
            DsTimer dsTimer = (DsTimer) yum0.f(this, R.id.timer);
            if (dsTimer != null) {
                this.f47290a = new vd7(this, textView, dsTimer, (byte) 12);
                setOrientation(1);
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cqd0.c, R.attr.eventCardInfoLiveStyle, 0);
                setInfoText(ktt0.p(typedArrayObtainStyledAttributes, context, 3));
                typedArrayObtainStyledAttributes.recycle();
                dsTimer.setOnTimerFinished(new wej(0, this, EventCardInfoLive.class, "checkInfoVisibility", "checkInfoVisibility()V", 0, (byte) 12));
                return;
            }
        }
        hny.u("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public final void a() {
        vd7 vd7Var = this.f47290a;
        ((EventCardInfoLive) vd7Var.b).setVisibility((((TextView) vd7Var.c).getVisibility() == 0 || ((DsTimer) vd7Var.d).getVisibility() == 0) ? 0 : 8);
    }

    public final void b() {
        vd7 vd7Var = this.f47290a;
        ((TextView) vd7Var.c).setMaxLines(((DsTimer) vd7Var.d).getVisibility() == 0 ? 1 : 2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int marginStart;
        vd7 vd7Var = this.f47290a;
        DsTimer dsTimer = (DsTimer) vd7Var.d;
        DsTimer dsTimer2 = (DsTimer) vd7Var.d;
        TextView textView = (TextView) vd7Var.c;
        if (dsTimer.getVisibility() == 0 && textView.getVisibility() == 0) {
            int measuredWidth = (getMeasuredWidth() / 2) - (dsTimer2.getMeasuredWidth() / 2);
            ViewGroup.LayoutParams layoutParams = dsTimer2.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            int i5 = marginLayoutParams != null ? marginLayoutParams.topMargin : 0;
            int measuredHeight = dsTimer2.getMeasuredHeight() + i5;
            dsTimer2.layout(measuredWidth, i5, dsTimer2.getMeasuredWidth() + measuredWidth, measuredHeight);
            ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            int i6 = measuredHeight + (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0);
            ViewGroup.LayoutParams layoutParams3 = textView.getLayoutParams();
            marginStart = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams3).getMarginStart() : 0;
            textView.layout(marginStart, i6, textView.getMeasuredWidth() + marginStart, textView.getMeasuredHeight() + i6);
            return;
        }
        if (dsTimer2.getVisibility() == 0 && textView.getVisibility() != 0) {
            int measuredWidth2 = (getMeasuredWidth() / 2) - (dsTimer2.getMeasuredWidth() / 2);
            int measuredHeight2 = (getMeasuredHeight() / 2) - (dsTimer2.getMeasuredHeight() / 2);
            dsTimer2.layout(measuredWidth2, measuredHeight2, dsTimer2.getMeasuredWidth() + measuredWidth2, dsTimer2.getMeasuredHeight() + measuredHeight2);
        } else if (dsTimer2.getVisibility() != 0 && textView.getVisibility() == 0) {
            int measuredHeight3 = (getMeasuredHeight() / 2) - (textView.getMeasuredHeight() / 2);
            ViewGroup.LayoutParams layoutParams4 = textView.getLayoutParams();
            marginStart = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams4).getMarginStart() : 0;
            textView.layout(marginStart, measuredHeight3, textView.getMeasuredWidth() + marginStart, textView.getMeasuredHeight() + measuredHeight3);
        }
    }

    public final void setHideAfterFinished(boolean z) {
        ((DsTimer) this.f47290a.d).setHideAfterFinished(z);
    }

    public final void setInfoText(CharSequence charSequence) {
        TextView textView = (TextView) this.f47290a.c;
        textView.setText(charSequence);
        textView.setVisibility((charSequence == null || charSequence.length() == 0) ? 8 : 0);
        b();
        a();
    }

    public final void setTime(long j) {
        ((DsTimer) this.f47290a.d).setTime(j);
    }

    public final void setTimeDirection(l7n l7nVar) {
        l7nVar.getClass();
        ((DsTimer) this.f47290a.d).setTimeDirection(l7nVar);
    }

    public final void setTimerVisibility(boolean z) {
        ((DsTimer) this.f47290a.d).setVisibility(z ? 0 : 8);
        b();
        a();
    }

    public final void setUpdateInterval(long j) {
        ((DsTimer) this.f47290a.d).setUpdateTimeIntervalMs(j);
    }

    public final void setInfoText(int i) {
        setInfoText(getContext().getText(i));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventCardInfoLive(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventCardInfoLive(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
