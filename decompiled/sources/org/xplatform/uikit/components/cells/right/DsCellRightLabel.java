package org.xplatform.uikit.components.cells.right;

import a.bqd0;
import a.hny;
import a.jab;
import a.jmu0;
import a.ktt0;
import a.vd7;
import a.yum0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class DsCellRightLabel extends ConstraintLayout implements jab {
    public final vd7 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DsCellRightLabel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.cell_right_label_layout, this);
        int i = R.id.icon;
        ImageView imageView = (ImageView) yum0.f(this, R.id.icon);
        if (imageView != null) {
            i = R.id.label;
            TextView textView = (TextView) yum0.f(this, R.id.label);
            if (textView != null) {
                this.q = new vd7(this, imageView, textView, (byte) 5);
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bqd0.s, 0, 0);
                ktt0.h(typedArrayObtainStyledAttributes, textView, 4);
                setText(ktt0.p(typedArrayObtainStyledAttributes, context, 1));
                setTextColor(ktt0.m(0, context, typedArrayObtainStyledAttributes));
                setIcon(typedArrayObtainStyledAttributes.getDrawable(2));
                setIconTint(ktt0.m(3, context, typedArrayObtainStyledAttributes));
                typedArrayObtainStyledAttributes.recycle();
                return;
            }
        }
        hny.u("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    @Override // a.jab
    public int getLabelLength() {
        return ((TextView) this.q.d).getText().length();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        jmu0.b(this, z);
    }

    public final void setIcon(Drawable drawable) {
        vd7 vd7Var = this.q;
        ((ImageView) vd7Var.c).setImageDrawable(drawable);
        ((ImageView) vd7Var.c).setVisibility(drawable != null ? 0 : 8);
    }

    public final void setIconTint(ColorStateList colorStateList) {
        ((ImageView) this.q.c).setImageTintList(colorStateList);
    }

    public final void setIconVisible(boolean z) {
        ((ImageView) this.q.c).setVisibility(z ? 0 : 8);
    }

    @Override // a.jab
    public void setLabelMaxLines(int i) {
        TextView textView = (TextView) this.q.d;
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
        vd7 vd7Var = this.q;
        ((TextView) vd7Var.d).setText(charSequence);
        ((TextView) vd7Var.d).setVisibility((charSequence == null || charSequence.length() == 0) ? 8 : 0);
    }

    public final void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            ((TextView) this.q.d).setTextColor(colorStateList);
        }
    }

    public final void setIconTint(int i) {
        setIconTint(ColorStateList.valueOf(i));
    }

    public final void setTextColor(int i) {
        setTextColor(ColorStateList.valueOf(i));
    }

    public final void setText(int i) {
        setText(getContext().getString(i));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsCellRightLabel(Context context) {
        this(context, null);
        context.getClass();
    }
}
