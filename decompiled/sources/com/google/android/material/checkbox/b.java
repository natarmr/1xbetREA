package com.google.android.material.checkbox;

import a.afn0;
import a.cd3;
import a.d7x;
import a.dwi0;
import a.epv0;
import a.g7x;
import a.itf0;
import a.j63;
import a.k63;
import a.l63;
import a.mrv;
import a.n6x;
import a.plc;
import a.rpd0;
import a.rw2;
import a.s06;
import a.s33;
import a.xh;
import a.ywu;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public class b extends cd3 {
    public final LinkedHashSet e;
    public final LinkedHashSet f;
    public ColorStateList g;
    public boolean h;
    public boolean i;
    public boolean j;
    public CharSequence k;
    public Drawable l;
    public Drawable m;
    public boolean n;
    public ColorStateList o;
    public ColorStateList p;
    public PorterDuff.Mode q;
    public int r;
    public int[] s;
    public boolean t;
    public CharSequence u;
    public CompoundButton.OnCheckedChangeListener v;
    public final l63 w;
    public final s06 x;
    public static final int[] y = {R.attr.state_indeterminate};
    public static final int[] z = {R.attr.state_error};
    public static final int[][] A = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public static final int B = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    public b(Context context, AttributeSet attributeSet, int i) {
        super(dwi0.V(context, attributeSet, i, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, i);
        this.e = new LinkedHashSet();
        this.f = new LinkedHashSet();
        Context context2 = getContext();
        l63 l63Var = new l63(context2);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = itf0.f15351a;
        Drawable drawable = resources.getDrawable(R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        l63Var.f7201a = drawable;
        drawable.setCallback(l63Var.f);
        new k63(l63Var.f7201a.getConstantState());
        this.w = l63Var;
        this.x = new s06(this, (byte) 2);
        Context context3 = getContext();
        this.l = getButtonDrawable();
        this.o = getSuperButtonTintList();
        setSupportButtonTintList(null);
        mrv.c0(context3, attributeSet, i, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        int[] iArr = rpd0.D;
        mrv.d0(context3, attributeSet, iArr, i, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context3.obtainStyledAttributes(attributeSet, iArr, i, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        ywu ywuVar = new ywu(context3, typedArrayObtainStyledAttributes);
        this.m = ywuVar.n(2);
        if (this.l != null && n6x.S(context3.getTheme(), R.attr.isMaterial3Theme, false)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
            if (resourceId == B && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.l = epv0.U(R.drawable.mtrl_checkbox_button, context3);
                this.n = true;
                if (this.m == null) {
                    this.m = epv0.U(R.drawable.mtrl_checkbox_button_icon, context3);
                }
            }
        }
        this.p = g7x.B(context3, ywuVar, 3);
        this.q = afn0.y(typedArrayObtainStyledAttributes.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.h = typedArrayObtainStyledAttributes.getBoolean(11, false);
        this.i = typedArrayObtainStyledAttributes.getBoolean(6, true);
        this.j = typedArrayObtainStyledAttributes.getBoolean(9, false);
        this.k = typedArrayObtainStyledAttributes.getText(8);
        if (typedArrayObtainStyledAttributes.hasValue(7)) {
            setCheckedState(typedArrayObtainStyledAttributes.getInt(7, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(10)) {
            setRippleColor(g7x.B(context3, ywuVar, 10));
        }
        ywuVar.A();
        a();
    }

    private String getButtonStateDescription() {
        int i = this.r;
        if (i == 1) {
            return getResources().getString(R.string.mtrl_checkbox_state_description_checked);
        }
        return i == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        ColorStateList colorStateList = this.g;
        if (colorStateList != null) {
            return colorStateList;
        }
        int iH = d7x.H(getContext(), n6x.V(this, R.attr.colorControlActivated));
        int iH2 = d7x.H(getContext(), n6x.V(this, R.attr.colorError));
        int iH3 = d7x.H(getContext(), n6x.V(this, R.attr.colorSurface));
        int iH4 = d7x.H(getContext(), n6x.V(this, R.attr.colorOnSurface));
        ColorStateList colorStateList2 = new ColorStateList(A, new int[]{d7x.F(iH3, 1.0f, iH2), d7x.F(iH3, 1.0f, iH), d7x.F(iH3, 0.54f, iH4), d7x.F(iH3, 0.38f, iH4), d7x.F(iH3, 0.38f, iH4)});
        this.g = colorStateList2;
        return colorStateList2;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.o;
        if (colorStateList != null) {
            return colorStateList;
        }
        return super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
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

    public final void a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        xh xhVar;
        this.l = plc.C(this.l, this.o, getButtonTintMode());
        this.m = plc.C(this.m, this.p, this.q);
        if (this.n) {
            l63 l63Var = this.w;
            if (l63Var != null) {
                j63 j63Var = l63Var.b;
                Drawable drawable = l63Var.f7201a;
                s06 s06Var = this.x;
                if (drawable != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                    s33 s33Var = s06Var.f31399a;
                    if (s33Var == null) {
                        s33Var = new s33(s06Var);
                        s06Var.f31399a = s33Var;
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(s33Var);
                }
                ArrayList arrayList = l63Var.e;
                if (arrayList != null && s06Var != null) {
                    arrayList.remove(s06Var);
                    if (l63Var.e.size() == 0 && (xhVar = l63Var.d) != null) {
                        j63Var.b.removeListener(xhVar);
                        l63Var.d = null;
                    }
                }
                Drawable drawable2 = l63Var.f7201a;
                if (drawable2 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable2;
                    s33 s33Var2 = s06Var.f31399a;
                    if (s33Var2 == null) {
                        s33Var2 = new s33(s06Var);
                        s06Var.f31399a = s33Var2;
                    }
                    animatedVectorDrawable2.registerAnimationCallback(s33Var2);
                } else if (s06Var != null) {
                    ArrayList arrayList2 = l63Var.e;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        l63Var.e = arrayList2;
                    }
                    if (!arrayList2.contains(s06Var)) {
                        l63Var.e.add(s06Var);
                        xh xhVar2 = l63Var.d;
                        if (xhVar2 == null) {
                            xhVar2 = new xh(l63Var, (byte) 1);
                            l63Var.d = xhVar2;
                        }
                        j63Var.b.addListener(xhVar2);
                    }
                }
            }
            Drawable drawable3 = this.l;
            if ((drawable3 instanceof AnimatedStateListDrawable) && l63Var != null) {
                ((AnimatedStateListDrawable) drawable3).addTransition(R.id.checked, R.id.unchecked, l63Var, false);
                ((AnimatedStateListDrawable) this.l).addTransition(R.id.indeterminate, R.id.unchecked, l63Var, false);
            }
        }
        Drawable drawable4 = this.l;
        if (drawable4 != null && (colorStateList2 = this.o) != null) {
            drawable4.setTintList(colorStateList2);
        }
        Drawable drawable5 = this.m;
        if (drawable5 != null && (colorStateList = this.p) != null) {
            drawable5.setTintList(colorStateList);
        }
        super.setButtonDrawable(plc.A(this.l, this.m, -1, -1));
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.l;
    }

    public Drawable getButtonIconDrawable() {
        return this.m;
    }

    public ColorStateList getButtonIconTintList() {
        return this.p;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.q;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.o;
    }

    public int getCheckedState() {
        return this.r;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.k;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.r == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.h && this.o == null && this.p == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, y);
        }
        if (this.j) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, z);
        }
        this.s = plc.E(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (!this.i || !TextUtils.isEmpty(getText()) || (buttonDrawable = getButtonDrawable()) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - buttonDrawable.getIntrinsicWidth()) / 2) * (getLayoutDirection() == 1 ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = buttonDrawable.getBounds();
            getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.j) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.k));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof MaterialCheckBox$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        MaterialCheckBox$SavedState materialCheckBox$SavedState = (MaterialCheckBox$SavedState) parcelable;
        super.onRestoreInstanceState(materialCheckBox$SavedState.getSuperState());
        setCheckedState(materialCheckBox$SavedState.f45563a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        MaterialCheckBox$SavedState materialCheckBox$SavedState = new MaterialCheckBox$SavedState(super.onSaveInstanceState());
        materialCheckBox$SavedState.f45563a = getCheckedState();
        return materialCheckBox$SavedState;
    }

    @Override // a.cd3, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(epv0.U(i, getContext()));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.m = drawable;
        a();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(epv0.U(i, getContext()));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.p == colorStateList) {
            return;
        }
        this.p = colorStateList;
        a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.q == mode) {
            return;
        }
        this.q = mode;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.o == colorStateList) {
            return;
        }
        this.o = colorStateList;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        a();
    }

    public void setCenterIfNoTextEnabled(boolean z2) {
        this.i = z2;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z2) {
        setCheckedState(z2 ? 1 : 0);
    }

    public void setCheckedState(int i) {
        AutofillManager autofillManager;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.r != i) {
            this.r = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30 && this.u == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.t) {
                return;
            }
            this.t = true;
            LinkedHashSet linkedHashSet = this.f;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw rw2.h(it);
                }
            }
            if (this.r != 2 && (onCheckedChangeListener = this.v) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (i2 >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.t = false;
        }
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.k = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z2) {
        if (this.j == z2) {
            return;
        }
        this.j = z2;
        refreshDrawableState();
        Iterator it = this.e.iterator();
        if (it.hasNext()) {
            throw rw2.h(it);
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.v = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.u = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z2) {
        this.h = z2;
        if (z2) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // a.cd3, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.l = drawable;
        this.n = false;
        a();
    }
}
