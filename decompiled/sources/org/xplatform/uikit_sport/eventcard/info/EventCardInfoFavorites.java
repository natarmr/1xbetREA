package org.xplatform.uikit_sport.eventcard.info;

import a.abo;
import a.cqd0;
import a.hny;
import a.ktt0;
import a.vd7;
import a.yum0;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class EventCardInfoFavorites extends ConstraintLayout implements abo {
    public final vd7 q;

    /* JADX WARN: Illegal instructions before constructor call */
    public EventCardInfoFavorites(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, R.attr.eventCardInfoFavoritesStyle);
        LayoutInflater.from(context).inflate(R.layout.event_card_info_favourites_view, this);
        int i2 = R.id.firstLine;
        TextView textView = (TextView) yum0.f(this, R.id.firstLine);
        if (textView != null) {
            i2 = R.id.secondLine;
            TextView textView2 = (TextView) yum0.f(this, R.id.secondLine);
            if (textView2 != null) {
                this.q = new vd7(this, textView, textView2, (byte) 11);
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cqd0.c, R.attr.eventCardInfoFavoritesStyle, 0);
                setFirstInfoText(ktt0.p(typedArrayObtainStyledAttributes, context, 2));
                setSecondInfoText(ktt0.p(typedArrayObtainStyledAttributes, context, 7));
                typedArrayObtainStyledAttributes.recycle();
                return;
            }
        }
        hny.u("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public final void setFirstInfoText(CharSequence charSequence) {
        TextView textView = (TextView) this.q.c;
        textView.setText(charSequence);
        textView.setVisibility((charSequence == null || charSequence.length() == 0) ? 8 : 0);
        u();
    }

    public final void setSecondInfoText(CharSequence charSequence) {
        TextView textView = (TextView) this.q.d;
        textView.setText(charSequence);
        textView.setVisibility((charSequence == null || charSequence.length() == 0) ? 8 : 0);
        u();
    }

    public final void u() {
        vd7 vd7Var = this.q;
        TextView textView = (TextView) vd7Var.c;
        TextView textView2 = (TextView) vd7Var.d;
        textView.setMaxLines(textView2.getVisibility() == 0 ? 1 : 3);
        textView2.setMaxLines(((TextView) vd7Var.c).getVisibility() == 0 ? 2 : 3);
    }

    public final void setFirstInfoText(int i) {
        setFirstInfoText(getContext().getText(i));
    }

    public final void setSecondInfoText(int i) {
        setSecondInfoText(getContext().getText(i));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventCardInfoFavorites(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventCardInfoFavorites(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
