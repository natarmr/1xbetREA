package com.google.android.material.switchmaterial;

import a.csn;
import a.d7x;
import a.dwi0;
import a.mrv;
import a.n6x;
import a.rpd0;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.appcompat.widget.SwitchCompat;

/* JADX INFO: loaded from: classes.dex */
public class SwitchMaterial extends SwitchCompat {
    public static final int[][] A1 = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public final csn w1;
    public ColorStateList x1;
    public ColorStateList y1;
    public boolean z1;

    public SwitchMaterial(Context context, AttributeSet attributeSet) {
        super(dwi0.V(context, attributeSet, org.xbet.client1.R.attr.switchStyle, org.xbet.client1.R.style.Widget_MaterialComponents_CompoundButton_Switch), attributeSet, org.xbet.client1.R.attr.switchStyle);
        Context context2 = getContext();
        this.w1 = new csn(context2);
        mrv.c0(context2, attributeSet, org.xbet.client1.R.attr.switchStyle, org.xbet.client1.R.style.Widget_MaterialComponents_CompoundButton_Switch);
        int[] iArr = rpd0.T;
        mrv.d0(context2, attributeSet, iArr, org.xbet.client1.R.attr.switchStyle, org.xbet.client1.R.style.Widget_MaterialComponents_CompoundButton_Switch, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, org.xbet.client1.R.attr.switchStyle, org.xbet.client1.R.style.Widget_MaterialComponents_CompoundButton_Switch);
        this.z1 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    private ColorStateList getMaterialThemeColorsThumbTintList() {
        ColorStateList colorStateList = this.x1;
        if (colorStateList != null) {
            return colorStateList;
        }
        int iH = d7x.H(getContext(), n6x.V(this, org.xbet.client1.R.attr.colorSurface));
        int iH2 = d7x.H(getContext(), n6x.V(this, org.xbet.client1.R.attr.colorControlActivated));
        float dimension = getResources().getDimension(org.xbet.client1.R.dimen.mtrl_switch_thumb_elevation);
        csn csnVar = this.w1;
        if (csnVar.f4898a) {
            float elevation = 0.0f;
            for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
                elevation += ((View) parent).getElevation();
            }
            dimension += elevation;
        }
        int iA = csnVar.a(dimension, iH);
        ColorStateList colorStateList2 = new ColorStateList(A1, new int[]{d7x.F(iH, 1.0f, iH2), iA, d7x.F(iH, 0.38f, iH2), iA});
        this.x1 = colorStateList2;
        return colorStateList2;
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        ColorStateList colorStateList = this.y1;
        if (colorStateList != null) {
            return colorStateList;
        }
        int iH = d7x.H(getContext(), n6x.V(this, org.xbet.client1.R.attr.colorSurface));
        int iH2 = d7x.H(getContext(), n6x.V(this, org.xbet.client1.R.attr.colorControlActivated));
        int iH3 = d7x.H(getContext(), n6x.V(this, org.xbet.client1.R.attr.colorOnSurface));
        ColorStateList colorStateList2 = new ColorStateList(A1, new int[]{d7x.F(iH, 0.54f, iH2), d7x.F(iH, 0.32f, iH3), d7x.F(iH, 0.12f, iH2), d7x.F(iH, 0.12f, iH3)});
        this.y1 = colorStateList2;
        return colorStateList2;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.z1 && getThumbTintList() == null) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
        }
        if (this.z1 && getTrackTintList() == null) {
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.z1 = z;
        if (z) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        } else {
            setThumbTintList(null);
            setTrackTintList(null);
        }
    }

    public SwitchMaterial(Context context) {
        this(context, null);
    }
}
