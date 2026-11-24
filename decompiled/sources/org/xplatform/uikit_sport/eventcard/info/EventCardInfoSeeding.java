package org.xplatform.uikit_sport.eventcard.info;

import a.abo;
import a.cqd0;
import a.dc3;
import a.hny;
import a.ktt0;
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

/* JADX INFO: loaded from: classes6.dex */
public final class EventCardInfoSeeding extends ConstraintLayout implements abo {
    public final dc3 q;

    /* JADX WARN: Illegal instructions before constructor call */
    public EventCardInfoSeeding(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, R.attr.eventCardInfoSeedingStyle);
        LayoutInflater.from(context).inflate(R.layout.event_card_seeding_view, this);
        int i2 = R.id.info;
        TextView textView = (TextView) yum0.f(this, R.id.info);
        if (textView != null) {
            i2 = R.id.leftSeeding;
            TextView textView2 = (TextView) yum0.f(this, R.id.leftSeeding);
            if (textView2 != null) {
                i2 = R.id.rightSeeding;
                TextView textView3 = (TextView) yum0.f(this, R.id.rightSeeding);
                if (textView3 != null) {
                    this.q = new dc3((ViewGroup) this, textView, (View) textView2, (View) textView3, (byte) 4);
                    TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cqd0.c, R.attr.eventCardInfoSeedingStyle, 0);
                    setInfoText(ktt0.p(typedArrayObtainStyledAttributes, context, 3));
                    String strP = ktt0.p(typedArrayObtainStyledAttributes, context, 5);
                    String strP2 = ktt0.p(typedArrayObtainStyledAttributes, context, 6);
                    String str = (strP == null || strP.length() == 0) ? strP2 : strP;
                    String str2 = (strP2 == null || strP2.length() == 0) ? strP : strP2;
                    textView2.setText(str);
                    textView2.setVisibility((strP == null || strP.length() == 0) ? 4 : 0);
                    textView3.setText(str2);
                    textView3.setVisibility((strP2 == null || strP2.length() == 0) ? 4 : 0);
                    u();
                    typedArrayObtainStyledAttributes.recycle();
                    return;
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public final void setInfoText(CharSequence charSequence) {
        TextView textView = (TextView) this.q.e;
        textView.setText(charSequence);
        textView.setVisibility((charSequence == null || charSequence.length() == 0) ? 4 : 0);
        u();
    }

    public final void u() {
        dc3 dc3Var = this.q;
        ((EventCardInfoSeeding) dc3Var.b).setVisibility((((TextView) dc3Var.e).getVisibility() == 0 || ((TextView) dc3Var.c).getVisibility() == 0 || ((TextView) dc3Var.d).getVisibility() == 0) ? 0 : 8);
    }

    public final void setInfoText(int i) {
        setInfoText(getContext().getString(i));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventCardInfoSeeding(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventCardInfoSeeding(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
