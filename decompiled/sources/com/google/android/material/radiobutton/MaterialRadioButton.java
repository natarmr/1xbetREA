package com.google.android.material.radiobutton;

import a.d7x;
import a.dwi0;
import a.g7x;
import a.mrv;
import a.n6x;
import a.rpd0;
import a.yd3;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialRadioButton extends yd3 {
    public static final int[][] g = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public ColorStateList e;
    public boolean f;

    public MaterialRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(dwi0.V(context, attributeSet, i, org.xbet.client1.R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet, i);
        Context context2 = getContext();
        TypedArray typedArrayL0 = mrv.l0(context2, attributeSet, rpd0.F, i, org.xbet.client1.R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (typedArrayL0.hasValue(0)) {
            setButtonTintList(g7x.A(0, context2, typedArrayL0));
        }
        if (typedArrayL0.hasValue(1)) {
            setRippleColor(g7x.A(1, context2, typedArrayL0));
        }
        this.f = typedArrayL0.getBoolean(2, false);
        typedArrayL0.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        ColorStateList colorStateList = this.e;
        if (colorStateList != null) {
            return colorStateList;
        }
        int iH = d7x.H(getContext(), n6x.V(this, org.xbet.client1.R.attr.colorControlActivated));
        int iH2 = d7x.H(getContext(), n6x.V(this, org.xbet.client1.R.attr.colorOnSurface));
        int iH3 = d7x.H(getContext(), n6x.V(this, org.xbet.client1.R.attr.colorSurface));
        ColorStateList colorStateList2 = new ColorStateList(g, new int[]{d7x.F(iH3, 1.0f, iH), d7x.F(iH3, 0.54f, iH2), d7x.F(iH3, 0.38f, iH2), d7x.F(iH3, 0.38f, iH2)});
        this.e = colorStateList2;
        return colorStateList2;
    }

    private void setRippleColor(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return;
        }
        Drawable background = getBackground();
        if (background instanceof DrawableWrapper) {
            background = ((DrawableWrapper) background).getDrawable();
        }
        if (background instanceof RippleDrawable) {
            ((RippleDrawable) background).setColor(colorStateList);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }

    public MaterialRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, org.xbet.client1.R.attr.radioButtonStyle);
    }

    public MaterialRadioButton(Context context) {
        this(context, null);
    }
}
