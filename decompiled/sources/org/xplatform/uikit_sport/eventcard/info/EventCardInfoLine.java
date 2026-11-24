package org.xplatform.uikit_sport.eventcard.info;

import a.abo;
import a.cqd0;
import a.dc3;
import a.hny;
import a.ktt0;
import a.l7n;
import a.wej;
import a.yum0;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xbet.client1.R;
import org.xplatform.uikit.components.timer.DsTimer;

/* JADX INFO: loaded from: classes6.dex */
public final class EventCardInfoLine extends ConstraintLayout implements abo {
    public static final /* synthetic */ int r = 0;
    public final dc3 q;

    /* JADX WARN: Illegal instructions before constructor call */
    public EventCardInfoLine(Context context, AttributeSet attributeSet, int i) {
        AttributeSet attributeSet2 = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet2, R.attr.eventCardInfoLineStyle);
        LayoutInflater.from(context).inflate(R.layout.event_card_line_view, this);
        int i2 = R.id.altInfo;
        TextView textView = (TextView) yum0.f(this, R.id.altInfo);
        if (textView != null) {
            i2 = R.id.info;
            TextView textView2 = (TextView) yum0.f(this, R.id.info);
            if (textView2 != null) {
                i2 = R.id.timer;
                DsTimer dsTimer = (DsTimer) yum0.f(this, R.id.timer);
                if (dsTimer != null) {
                    this.q = new dc3((ViewGroup) this, textView, (View) textView2, (View) dsTimer, (byte) 3);
                    TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet2, cqd0.c, R.attr.eventCardInfoLineStyle, 0);
                    setInfoText(ktt0.p(typedArrayObtainStyledAttributes, context, 3));
                    setAltInfoText(ktt0.p(typedArrayObtainStyledAttributes, context, 0));
                    typedArrayObtainStyledAttributes.recycle();
                    dsTimer.setOnTimerFinished(new wej(0, this, EventCardInfoLine.class, "checkInfoVisibility", "checkInfoVisibility()V", 0, (byte) 11));
                    return;
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public final void setAltInfoText(CharSequence charSequence) {
        TextView textView = (TextView) this.q.e;
        textView.setText(charSequence);
        textView.setVisibility((charSequence == null || charSequence.length() == 0) ? 8 : 0);
        v();
        u();
    }

    public final void setHideAfterFinished(boolean z) {
        ((DsTimer) this.q.d).setHideAfterFinished(z);
    }

    public final void setInfoText(CharSequence charSequence) {
        TextView textView = (TextView) this.q.c;
        textView.setText(charSequence);
        textView.setVisibility((charSequence == null || charSequence.length() == 0) ? 8 : 0);
        v();
        u();
    }

    public final void setTime(long j) {
        ((DsTimer) this.q.d).setTime(j);
    }

    public final void setTimeDirection(l7n l7nVar) {
        l7nVar.getClass();
        ((DsTimer) this.q.d).setTimeDirection(l7nVar);
    }

    public final void setTimerVisibility(boolean z) {
        ((DsTimer) this.q.d).setVisibility(z ? 0 : 8);
        v();
        u();
    }

    public final void setUpdateInterval(long j) {
        ((DsTimer) this.q.d).setUpdateTimeIntervalMs(j);
    }

    public final void u() {
        dc3 dc3Var = this.q;
        ((EventCardInfoLine) dc3Var.b).setVisibility((((TextView) dc3Var.c).getVisibility() == 4 && ((TextView) dc3Var.e).getVisibility() == 4 && ((DsTimer) dc3Var.d).getVisibility() == 4) ? 4 : 0);
    }

    public final void v() {
        dc3 dc3Var = this.q;
        TextView textView = (TextView) dc3Var.c;
        TextView textView2 = (TextView) dc3Var.e;
        textView.setMaxLines((((DsTimer) dc3Var.d).getVisibility() == 0 || textView2.getVisibility() == 0) ? 1 : 2);
        textView2.setMaxLines(((TextView) dc3Var.c).getVisibility() != 0 ? 2 : 1);
    }

    public final void setAltInfoText(int i) {
        setAltInfoText(getContext().getText(i));
    }

    public final void setInfoText(int i) {
        setInfoText(getContext().getString(i));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventCardInfoLine(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventCardInfoLine(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
