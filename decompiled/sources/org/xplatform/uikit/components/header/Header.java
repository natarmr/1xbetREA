package org.xplatform.uikit.components.header;

import a.bqd0;
import a.hny;
import a.ktt0;
import a.vd7;
import a.yum0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xbet.client1.R;
import org.xplatform.uikit.components.buttons.DsButton;

/* JADX INFO: loaded from: classes6.dex */
public final class Header extends ConstraintLayout {
    public final vd7 q;

    /* JADX WARN: Illegal instructions before constructor call */
    public Header(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, R.attr.headerStyle);
        LayoutInflater.from(context).inflate(R.layout.header_view, this);
        int i2 = R.id.button;
        DsButton dsButton = (DsButton) yum0.f(this, R.id.button);
        if (dsButton != null) {
            i2 = R.id.title;
            TextView textView = (TextView) yum0.f(this, R.id.title);
            if (textView != null) {
                this.q = new vd7(this, dsButton, textView, (byte) 15);
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bqd0.O, R.attr.headerStyle, 0);
                ktt0.h(typedArrayObtainStyledAttributes, textView, 7);
                int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, 0);
                int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
                textView.setPadding(dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize);
                setTitle(ktt0.p(typedArrayObtainStyledAttributes, context, 5));
                setTitleColor(ktt0.m(8, context, typedArrayObtainStyledAttributes));
                setButtonText(ktt0.p(typedArrayObtainStyledAttributes, context, 1));
                setButtonIcon(typedArrayObtainStyledAttributes.getDrawable(0));
                textView.setMaxLines(typedArrayObtainStyledAttributes.getInt(4, 1));
                typedArrayObtainStyledAttributes.recycle();
                return;
            }
        }
        hny.u("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public String getTitleText() {
        return ((TextView) this.q.d).getText().toString();
    }

    public final void setButtonClickListener(View.OnClickListener onClickListener) {
        ((DsButton) this.q.c).setOnClickListener(onClickListener);
    }

    public final void setButtonIcon(Drawable drawable) {
        AppCompatImageView icon = ((DsButton) this.q.c).getIcon();
        if (icon != null) {
            icon.setImageDrawable(drawable);
        }
    }

    public final void setButtonText(CharSequence charSequence) {
        DsButton dsButton = (DsButton) this.q.c;
        dsButton.l(String.valueOf(charSequence));
        dsButton.setVisibility((charSequence == null || charSequence.length() == 0) ? 8 : 0);
    }

    public final void setTitle(int i) {
        setTitle(getContext().getString(i));
    }

    public final void setTitleColor(int i) {
        ((TextView) this.q.d).setTextColor(ColorStateList.valueOf(i));
    }

    public final void setTitle(CharSequence charSequence) {
        ((TextView) this.q.d).setText(charSequence);
    }

    public final void setTitleColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            ((TextView) this.q.d).setTextColor(colorStateList);
        }
    }

    public final void setButtonIcon(int i) {
        ((DsButton) this.q.c).i(i);
    }

    public final void setButtonText(int i) {
        setButtonText(getContext().getString(i));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
