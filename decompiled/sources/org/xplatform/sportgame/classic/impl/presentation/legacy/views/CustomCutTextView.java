package org.xplatform.sportgame.classic.impl.presentation.legacy.views;

import a.ohs0;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Spannable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: loaded from: classes.dex */
public final class CustomCutTextView extends AppCompatTextView {
    public final Paint i;
    public String j;

    /* JADX WARN: Illegal instructions before constructor call */
    public CustomCutTextView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        Paint paint = new Paint();
        paint.setTextSize(getTextSize());
        paint.setTypeface(getTypeface());
        this.i = paint;
        this.j = "";
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            super.onRestoreInstanceState(bundle.getParcelable("BUNDLE_KEY_SUPER"));
            String string = bundle.getString("BUNDLE_KEY_TEXT");
            string.getClass();
            this.j = string;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putString("BUNDLE_KEY_TEXT", this.j);
        bundle.putParcelable("BUNDLE_KEY_SUPER", super.onSaveInstanceState());
        return bundle;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i3 != 0) {
            setText(this.j);
            return;
        }
        double dMeasureText = this.i.measureText(this.j) / i;
        String strN = this.j;
        if (dMeasureText > 2.68d) {
            strN = ohs0.n(strN, Separators.DOT);
        }
        setText(strN);
    }

    public final void setSpannableText(Spannable spannable) {
        spannable.getClass();
        setText(spannable);
        this.j = spannable.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CustomCutTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CustomCutTextView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
