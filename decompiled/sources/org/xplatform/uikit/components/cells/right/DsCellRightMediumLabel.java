package org.xplatform.uikit.components.cells.right;

import a.bqd0;
import a.hny;
import a.jab;
import a.ktt0;
import a.nq8;
import a.yum0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class DsCellRightMediumLabel extends ConstraintLayout implements jab {
    public final nq8 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DsCellRightMediumLabel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.cell_right_medium_label_layout, this);
        TextView textView = (TextView) yum0.f(this, R.id.label);
        if (textView == null) {
            hny.u("Missing required view with ID: ".concat(getResources().getResourceName(R.id.label)));
            throw null;
        }
        this.q = new nq8(this, textView, (byte) 5);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bqd0.t, 0, 0);
        ktt0.h(typedArrayObtainStyledAttributes, textView, 2);
        setText(ktt0.p(typedArrayObtainStyledAttributes, context, 1));
        setTextColor(ktt0.m(0, context, typedArrayObtainStyledAttributes));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // a.jab
    public int getLabelLength() {
        return ((TextView) this.q.c).length();
    }

    @Override // a.jab
    public void setLabelMaxLines(int i) {
        TextView textView = (TextView) this.q.c;
        if (i < 2) {
            i = 2;
        }
        textView.setMaxLines(i);
    }

    @Override // a.jab
    public void setMaxWidthPercent(int i) {
        setMaxWidth(i);
    }

    public final void setText(CharSequence charSequence) {
        nq8 nq8Var = this.q;
        ((TextView) nq8Var.c).setVisibility((charSequence == null || charSequence.length() == 0) ? 8 : 0);
        ((TextView) nq8Var.c).setText(charSequence);
    }

    public final void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            ((TextView) this.q.c).setTextColor(colorStateList);
        }
    }

    public final void setTextColor(int i) {
        setTextColor(ColorStateList.valueOf(i));
    }

    public final void setText(int i) {
        setText(getContext().getString(i));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsCellRightMediumLabel(Context context) {
        this(context, null);
        context.getClass();
    }
}
